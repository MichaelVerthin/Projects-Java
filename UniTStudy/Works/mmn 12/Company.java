/**
 * Version: (2023a)
 * Author's name: Michael Verthin
 * Author's ID: 209506260
 */
public class Company {
    // ---------- Perms ----------
    private RentNode _head;

    // ---------- Constructors ----------
    /**
     * An empty constructor for a new Company, it only sets the head Node to be null
     */
    public Company() {
        _head = null;
    }

    // ---------- Methods ----------
    /**
     * This is a helping function
     * 
     * @return true if the Company is empty and False if not
     */
    private boolean empty() {
        return _head == null;
    }

    /**
     * This method is adding a new Node by a sort to the right place according to:
     * 1. The Pickup date if the rent, from newer to older
     * 2. If they are the same, then the longer rent period will come before
     * 3. The same Rent will not be added to the Company (return false)
     * 
     * @param name
     * @param car
     * @param PickDate
     * @param returnDate
     * @return True if the addition of a new Node to the Company was made, false if
     *         not
     */
    public boolean addRent(String name, Car car, Date PickDate, Date returnDate) {
        Rent r = new Rent(name, car, PickDate, returnDate);
        RentNode newR = new RentNode(r);
        if (empty()) {
            _head = newR;
            _head.setNext(null);
            return true;
        } else if (!isRentExist(r)) {
            RentNode temp = _head;
            while (temp != null) {
                if (newR.getRent().getPickDate().equals(temp.getRent().getPickDate())) // Is there a date like this
                    if (newR.getRent().getReturnDate().after(temp.getRent().getReturnDate())) { // Where to add it check
                        if (temp == _head) { // Add in case it's replaces the _head
                            _head = newR;
                            newR.setNext(temp);
                            return true; // Successfully added
                        }
                    } else {
                        if (temp.getNext() != null) {
                            newR.setNext(temp.getNext());
                            temp.setNext(newR);
                        } else {
                            temp.setNext(newR);
                            newR.setNext(null);
                        }
                        return true; // Successfully added
                    }
                else if (newR.getRent().getPickDate().before(temp.getRent().getPickDate())) { // where to add it check
                    if (temp == _head) { // Add in case it's replaces the _head
                        _head = newR;
                        newR.setNext(temp);
                        return true; // Successfully added
                    }
                    if (temp.getNext() != null) {
                        newR.setNext(temp.getNext());
                        temp.setNext(newR);
                    } else {
                        temp.setNext(newR);
                        newR.setNext(null);
                    }
                    return true;
                } else if (temp.getNext() == null // Last where to add it check, I promise...
                        && newR.getRent().getPickDate().after(temp.getRent().getPickDate())) {
                    temp.setNext(newR);
                    return true; // Successfully added
                }
                temp = temp.getNext();
            }
        }
        return false; // Can't add
    }

    /**
     * This is a helping function
     * 
     * @param r
     * @return true if the same rent already exists in the Company, false if not
     */
    private boolean isRentExist(Rent r) {
        RentNode temp = _head;
        while (temp != null) {
            if (temp.getRent().equals(r))
                return true;
            temp = temp.getNext();
        }
        return false;
    }

    /**
     * 
     * @param d
     * @return True if a node with the same date will be present in the Company,
     *         false if there is no such node
     */
    public boolean removeRent(Date d) {
        RentNode pointer = _head;
        while (pointer.getNext() != null) {
            if (pointer.getNext().getRent().getReturnDate().equals(d)) {
                pointer.setNext(pointer.getNext().getNext());
                pointer.getNext().setNext(null);
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }

    /**
     * 
     * @return the number of rents that are in the company (the number of nodes)
     */
    public int getNumOfRents() {
        RentNode pointer = _head;
        int counter = 0;
        while (pointer != null) {
            counter++;
            pointer = pointer.getNext();
        }
        return counter;
    }

    /**
     * 
     * @return the sum of all teh prices of all the rents inside the noddes of the
     *         Company
     */
    public int getSumOfPrices() {
        RentNode pointer = _head;
        int sum = 0;
        while (pointer != null) {
            sum += pointer.getRent().getPrice();
            pointer = pointer.getNext();
        }
        return sum;
    }

    /**
     * 
     * @return the total sum of the number of days of all the rents inside the nodes
     *         of the Company
     */
    public int getSumOfDays() {
        RentNode pointer = _head;
        int count = 0;
        while (pointer != null) {
            count += pointer.getRent().howManyDays();
            pointer = pointer.getNext();
        }
        return count;
    }

    /**
     * 
     * @return the average days of rent inside of the nodes of the Company,
     *         If there are no rents at all, this function will return 0
     */
    public double averageRent() {
        RentNode pointer = _head;
        double sumAvg = 0;
        int count = 0;
        while (pointer != null) {
            count++;
            sumAvg += pointer.getRent().howManyDays();
            pointer = pointer.getNext();
        }
        return (sumAvg / count);
    }

    /**
     * 
     * @return the lat car that her date of return to the Company is the latest,
     *         if there are a few rent with he same date then it will return the
     *         car in the closes node that it will find,
     *         If there are no rents at all, this fucntion will return null
     */
    public Car lastCarRent() {
        if (_head == null)
            return null;
        Rent compare = _head.getRent();
        RentNode pointer = _head;
        while (pointer != null) {
            if (pointer.getRent().getReturnDate().after(compare.getReturnDate()))
                compare = pointer.getRent();
            pointer = pointer.getNext();
        }
        return compare.getCar();
    }

    /**
     * 
     * @return the rent where the daus of rent is the maximum,
     *         in case of an equal number of maximum rents then it will return the
     *         rent in the first node it will find,
     *         If there are no rents at all, this function will return null
     */
    public Rent longestRent() {
        if (_head == null)
            return null;
        RentNode pointer = _head;
        Rent max = _head.getRent();
        while (pointer != null) {
            if (pointer.getRent().howManyDays() >= max.howManyDays())
                max = pointer.getRent();
            pointer = pointer.getNext();
        }
        return max;
    }

    /**
     * 
     * @return the most populer rate between all of the rents in the Company,
     *         If there are an equal number of rates between them, then it will
     *         return the highest rate,
     *         According the rate ranking order that is,
     *         If there are no rents then this function will return the char 'N'
     */
    public char mostCommonRate() {
        if (empty())
            return 'N';
        String[] count = { "A", "B", "C", "D" }; // Creating an arrey for all the rates
        RentNode pointer = _head;
        while (pointer != null) { // Summing up all the rates inside the arrey
            if (pointer.getRent().getCar().getType() == 'A')
                count[0] += 'A';
            if (pointer.getRent().getCar().getType() == 'B')
                count[1] += 'B';
            if (pointer.getRent().getCar().getType() == 'C')
                count[2] += 'C';
            if (pointer.getRent().getCar().getType() == 'D')
                count[3] += 'D';
            pointer = pointer.getNext();
        }
        int max = count[0].length();
        char longest = count[0].charAt(0);
        for (int i = 1; i < count.length; i++) {
            if (count[i].length() > max) {
                max = count[i].length();
                longest = count[i].charAt(0);
            }
        }
        return longest;
    }

    /**
     * 
     * @param other Company with it's rents
     * @return true if all the nodes of the Company that was received are present in
     *         this Commpany,
     *         If the other Company is empty then this function will return true as
     *         well,
     *         If there are nodes that are present in the other Company that don't
     *         have the same node, this function will return false
     */
    public boolean includes(Company other) {
        RentNode ptr1 = _head;
        RentNode ptr2 = other._head;
        if (ptr2 != null && empty())
            return false;
        else
            while (ptr1 != null && ptr2 != null)
                if (ptr1.getRent().equals(ptr2.getRent())) {
                    ptr1 = ptr1.getNext();
                    ptr2 = ptr2.getNext();
                } else
                    return false;
        return true;
    }

    /**
     * This function is adding all of the nodes from the other Company that it
     * received, by placing them in the order they should appear in,
     * If a node with same rent will be in the other Comapany, it will not be added
     * to this Company, THERE ARE NO DUPLICATIONS!
     * 
     * @param other
     */
    public void merge(Company other) {
        RentNode ptr1 = _head;
        RentNode ptr2 = other._head;
        while (ptr1 != null && ptr2 != null) {
            if (isRentExist(ptr2.getRent()))
                ptr2 = ptr2.getNext();
            else
                addRent(ptr2.getRent().getName(), ptr2.getRent().getCar(), ptr2.getRent().getPickDate(),
                        ptr2.getRent().getReturnDate());
        }
    }

    /**
     * This is a simple function that prints to the terminal the sum of all the
     * nodes, in addition it will print the nodes themselves in the format of:
     * Name:{name} From:dd/mm/yyyy To:dd/mm/yyyy Type:{char} Days:{int} Price:{int},
     */
    public String toString() {
        String str = "";
        int count = 0;
        RentNode ptr = _head;
        while (ptr != null) {
            count++;
            ptr = ptr.getNext();
        }
        str += "The company has " + count + " rents";
        if (count == 0)
            return str += ".";
        str += ":\n";
        ptr = _head;
        while (ptr != null) {
            str += ptr.getRent().toString() + "\n";
            ptr = ptr.getNext();
        }
        return str;
    }
}
