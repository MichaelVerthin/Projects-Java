public class Company {
    // ---------- Perms ----------
    private RentNode _head;

    // ---------- Constructors ----------
    public Company() {
        _head = null;
    }

    // ---------- Methods ----------
    private boolean empty() {
        return _head == null;
    }

    private RentNode nextElement(RentNode node) {
        return node.getNext();
    }

    private Rent getValueOfNode(RentNode node) {
        return node.getRent();
    }

    public boolean addRent(String name, Car car, Date PickDate, Date returnDate) {
        Rent r = new Rent(name, car, PickDate, returnDate);
        RentNode newR = new RentNode(r);
        if (!isRentExist(r)) {
            RentNode temp = _head;
            while (temp.getNext() != null) {
                if (temp.getRent().getPickDate().before(r.getPickDate())
                        && temp.getNext().getRent().getPickDate().before(r.getPickDate()))
                    temp.getNext();
                else {
                    temp.setNext(newR);
                    newR.setNext(temp.getNext());
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isRentExist(Rent r) {
        RentNode temp = _head;
        while (temp.getNext() != null) {
            if (temp.getRent().equals(r))
                return true;
            temp.getNext();
        }
        return false;
    }

    public boolean removeRent(Date d) {
        RentNode pointer = _head;
        while (pointer != null) {
            if (pointer.getNext().getRent().getPickDate().equals(d)) {
                pointer.setNext(pointer.getNext().getNext());
                pointer.getNext().setNext(null);
                return true;
            }
        }
        return false;
    }

    public int getNumOfRents() {
        RentNode pointer = _head;
        int counter = 1;
        while (pointer.getNext() != null)
            counter++;
        return counter;
    }

    public int getSumOfPrices() {
        RentNode pointer = _head;
        int sum = 1;
        while (pointer.getNext() != null)
            sum += pointer.getRent().getPrice();
        return sum;
    }
}
