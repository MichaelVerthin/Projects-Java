/**
 * Version:
 * (2023a)
 * Author:
 * Michael Verthin
 */
public class Rent {
    /* Perms */
    private String _name;
    private Car _car;
    private Date _pickDate;
    private Date _returnDate;
    private final double WEEK_RENT_DISCOUNT_DEFAULT = 0.1;
    private final int A_RATE = 100;
    private final int B_RATE = 150;
    private final int C_RATE = 180;
    private final int D_RATE = 240;

    /* Constructors */

    /**
     * Creates a new Rent object
     * The return date must be at least one day after the pickup date, otherwise set
     * it to one day after the pick up date.
     * 
     * @param name the client's name
     * @param car  the rented car
     * @param pick the pickup date
     * @param ret  the return date
     */
    public Rent(String name, Car car, Date pick, Date ret) {
        _name = name;
        _car = new Car(car);
        _pickDate = new Date(pick);
        _returnDate = new Date(ret);
        if (pick.difference(ret) < 1)
            _returnDate = new Date(ret.tomorrow());
    }

    /**
     * Copy constructor
     * 
     * @param other the rent to be copied
     */
    public Rent(Rent other) {
        this._name = other._name;
        this._car = other._car;
        this._pickDate = other._pickDate;
        this._returnDate = other._returnDate;
    }

    /* Methonds */

    /**
     * Gets the name
     * 
     * @return the name
     */
    public String getName() {
        return this._name;
    }

    /**
     * Gets the car
     * 
     * @return the car
     */
    public Car getCar() {
        return this._car;
    }

    /**
     * Gets the pick up date
     * 
     * @return the pick up date
     */
    public Date getPickDate() {
        return this._pickDate;
    }

    /**
     * Gets the return date
     * 
     * @return the return date
     */
    public Date getReturnDate() {
        return this._returnDate;
    }

    /**
     * Sets the client name
     * 
     * @param name the client name (You can assume that the name is a valid name)
     */
    public void setName(String name) {
        this._name = name;
    }

    /**
     * Sets the rented car
     * 
     * @param car the rented car (You can assume that car is not null)
     */
    public void setCar(Car car) {
        this._car = car;
    }

    /**
     * Sets the pick up date
     * The pick up date must be at least one day before the return date, otherwise -
     * don't change the pick up date
     * 
     * @param pickDate the pick up date (You can assume that pick up date is not
     *                 null)
     */
    public void setPickDate(Date pickDate) {
        this._pickDate = pickDate;
    }

    /**
     * Sets the return date
     * The return date must be at least one day after the pick up date, otherwise -
     * don't change the return date
     * 
     * @param returnDate the return date (You can assume that return date is not
     *                   null)
     */
    public void setReturnDate(Date returnDate) {
        this._returnDate = returnDate;
    }

    /**
     * Check if 2 rents are the same
     * 
     * @param other the rent to compare this rent to
     * @return true if the rents are the same
     */
    public boolean equals(Rent other) {
        return this._name == other.getName() && this._car.equals(other.getCar())
                && this._pickDate.equals(other.getPickDate()) && this._returnDate.equals(other.getReturnDate());
    }

    /**
     * Returns the number of rent days
     * 
     * @return the number of rent days
     */
    public int howManyDays() {
        return _pickDate.difference(_returnDate);
    }

    /**
     * Returns the rent total price
     * 
     * @return the rent total price
     */
    public int getPrice() {
        int rate = A_RATE;
        if (this._car.getType() == 'B')
            rate = B_RATE;
        else if (this._car.getType() == 'C')
            rate = C_RATE;
        else if (this._car.getType() == 'D')
            rate = D_RATE;
        return this._pickDate.difference(_returnDate) * rate
                + (int) (this._pickDate.difference(_returnDate) / 7 * WEEK_RENT_DISCOUNT_DEFAULT);
    }

    /**
     * Try to upgrade the car to a better car
     * If the given car is better than the current car of the rent, upgrade it and
     * return the upgrade additional cost, otherwise - don't upgrade
     * 
     * @param newCar the car to upgrade to
     * @return the upgrade cost
     */
    public int upgrade(Car newCar) {
        Car c = new Car(newCar);
        int currentRent = this.getPrice();
        if (this._car.worse(newCar)) {
            this._car = c;
            return currentRent - this.getPrice();
        } else
            return 0;
    }

    /**
     * Check if there is a double listing of a rent for the same person and car with
     * an overlap in the rental days
     * If there is - return a new rent object with the unified dates, otherwise -
     * return null.
     * 
     * @param other the other rent
     * @return the unified rent or null
     */
    public Rent overlap(Rent other) {
        Rent r = new Rent(other);
        if (this._name == other.getName() && this._car.equals(other.getCar())) {
            if (other.getPickDate().before(_returnDate)
                    || other.getPickDate().equals(_returnDate) && other.getPickDate().after(_pickDate))
                r.setPickDate(_pickDate);
            else if (other.getPickDate().before(_returnDate)
                    || other.getPickDate().equals(_returnDate) && other.getPickDate().before(_pickDate))
                r.setPickDate(other.getPickDate());
            else
                return null;
            if (this._returnDate.after(other.getReturnDate()))
                r.setReturnDate(_returnDate);
            else if (this._returnDate.before(other.getReturnDate()))
                r.setReturnDate(other.getReturnDate());
            return r;
        } else
            return null;
    }

    /**
     * Returns a String that represents this rent
     * 
     * @return String that represents this rent in the following format:
     *         Name:Rama From:30/10/2022 To:12/11/2022 Type:B Days:13 Price:1845
     */
    public String toString() {
        return "Name:" + this.getName() + " From:" + this.getPickDate() + " To:" +
                this.getReturnDate() + " Type:"
                + this.getCar().getType() + " Days:" +
                this.getPickDate().difference(this.getReturnDate()) + " Price:"
                + this.getPrice();
    }
}
