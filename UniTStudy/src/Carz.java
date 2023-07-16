/**
 * Version:
 * (2023a)
 * Author:
 * Michael Verthin
 */
public class Carz {

    /* Prems */
    private int _id;
    private char _type;
    private String _brand;
    private boolean _isManual;

    private final int ID_DEFAULT = 9999999;
    private final char TYPE_DEFAULT = 'A';

    /* Constructors */

    /**
     * Default contructor
     * Creates a new Car object
     * id should be a 7 digits number, otherwise set it to 9999999
     * type should be 'A','B','C' or 'D', otherwise set it to 'A'
     * 
     * @param id       the id of the car (7 digits number)
     * @param type     the type of the car ('A','B','C' or 'D')
     * @param brand    the car's brand
     * @param isManual flag indicating if the car is manual
     */
    public Carz(int id, char type, String brand, boolean isManual) {
        _id = ID_DEFAULT;
        if (id > 999999)
            _id = id;
        _type = TYPE_DEFAULT;
        if (type == 'A' || type == 'B' || type == 'C' && type == 'D')
            _type = type;
        _brand = brand;
        _isManual = isManual;
    }

    public Carz(int id, char type, String brand) {
        _id = ID_DEFAULT;
        if (id > 999999)
            _id = id;
        _type = TYPE_DEFAULT;
        if (type == 'A' || type == 'B' || type == 'C' && type == 'D')
            _type = type;
        _brand = brand;
    }

    /**
     * Copy constructor
     * 
     * @param car the car to be copied
     */
    public Carz(Carz car) {
        this._id = car._id;
        this._type = car._type;
        this._brand = car._brand;
        this._isManual = car._isManual;
    }

    /* Methods */

    /**
     * Gets the id
     * 
     * @return the id
     */
    public int getId() {
        return _id;
    }

    /**
     * Gets the type
     * 
     * @return the type
     */
    public char getType() {
        return _type;
    }

    /**
     * Gets the brand
     * 
     * @return the brand
     */
    public String getBrand() {
        return _brand;
    }

    /**
     * Gets the isManual flag
     * 
     * @return the isManual flag
     */
    public boolean isManual() {
        return _isManual;
    }

    /**
     * Sets the id (only if the given id is valid)
     * 
     * @param id the id value to be set
     */
    public void setId(int id) {
        _id = id;
    }

    /**
     * Set the type of the car
     * 
     * @param type the type value to be set
     */
    public void setType(char type) {
        _type = type;
    }

    /**
     * Sets the brand of the car
     * 
     * @param brand the brand value to be set
     */
    public void setBrand(String brand) {
        _brand = brand;
    }

    /**
     * Sets the isManual flag of the car
     * 
     * @param manual the isManual flag to be set
     */
    public void setIsManual(boolean manual) {
        _isManual = manual;
    }

    /**
     * Returns a String object that represents this car
     * 
     * @return String that represents this car in the following format:
     *         id:1234567 type:B brand:Toyota gear:manual (or auto)
     */
    public String toString() {
        String manual = "manual";
        if (_isManual == false)
            manual = "auto";
        return "id:" + _id + " type:" + _type + " brand:" + _brand + " gear:" + manual;
    }

    /**
     * Check if two cars are the same
     * Cars are considered the same if they have the same type, brand and gear
     * 
     * @param other the car to compare this car to
     * @return true if the cars are the same, otherwise false
     */
    public boolean equals(Carz other) {
        return this._type == other._type && this._brand == other._brand && this._isManual == other._isManual;
    }

    /**
     * Check if this car is better than the other car
     * A car is considered better than another car if its type is higher.vvv
     * 
     * @param other car to compare this car to
     * @return true if this car is better than the other car, otherwise false
     */
    public boolean better(Carz other) {
        if (this._type == other._type)
            return this._isManual == false && other._isManual == true;
        return this._type > other._type;
    }

    /**
     * Check if this car is worse than the other car
     * 
     * @param other car to compare this car to
     * @return true if this car is worse than the other car, otherwise false
     * 
     */
    public boolean worse(Carz other) {
        return this.better(other) == false;
    }
}
