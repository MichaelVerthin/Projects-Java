/**
 * This class represents a Cheese
 */
public class Cheese {

    private String _type;
    private double _fatPercentage;
    private final double MIN_PERCENTAGE = 0;
    private final double MAX_PERCENTAGE = 100;

    /**
     * Default contructor
     * Initialize an instance of cheese with cheese type Mozzarella and fat
     * percentage 0
     */
    public Cheese() {
        _type = "Mozzarella";
        _fatPercentage = MIN_PERCENTAGE;
    }

    /**
     * Initialize an instance of cheese with the given cheese type and fat
     * percentage
     * 
     * @param type          The cheese type
     * @param fatPercentage The fat percentage
     */
    public Cheese(String type, double fatPercentage) {
        if (type.equals(""))
            _type = "Mozzarella";
        else
            _type = type;
        if (fatPercentage < MIN_PERCENTAGE || fatPercentage > MAX_PERCENTAGE)
            _fatPercentage = MIN_PERCENTAGE;
        else
            _fatPercentage = fatPercentage;
    }

    /**
     * Copy Constructor
     * Initialize an instance of cheese identical to the given cheese
     * 
     * @param other The cheese to copy
     */
    public Cheese(Cheese other) {
        _type = other._type;
        _fatPercentage = other._fatPercentage;
    }

    /**
     * Returns the cheese type
     * 
     * @return cheese type
     */
    public String getType() {
        return _type;
    }

    /**
     * Returns the cheese fat percentage
     * 
     * @return cheese fat percentage
     */
    public double getFatPercentage() {
        return _fatPercentage;
    }

    /**
     * Sets the cheese type to the given type
     * If the type is an empty string, the cheese type will remain as is
     * 
     * @param The new cheese type
     */
    public void setType(String type) {
        if (!type.equals(""))
            _type = type;
    }

    /**
     * Sets the cheese fat percentage to the given fat percentage
     * If the fat percentage is not a valid percentage (0-100), the fat percentage
     * will remain as is
     * 
     * @param The new cheese type
     */
    public void setFatPercentage(double fatPercentage) {
        if (fatPercentage >= MIN_PERCENTAGE && fatPercentage <= MAX_PERCENTAGE)
            _fatPercentage = fatPercentage;
    }

    /**
     * Return true if the cheese type is Gouda, otherwise false
     * 
     * @return True if cheese type is Gouda, otherwise false
     */
    public boolean isGoudaCheese() {
        return _type.equals("Gouda");
    }

    /**
     * Return true if the given cheese is identical to the current cheese for all
     * attributes, otherwise false
     * 
     * @return True if the given cheese is identical to the current cheese,
     *         otherwise false
     */
    public boolean equals(Cheese other) {
        return _type.equals(other._type) && _fatPercentage == other._fatPercentage;
    }

    /**
     * Returns a string representation of the cheese object
     */
    public String toString() {
        return "Cheese type: " + _type + ", fat percentage: " + _fatPercentage;
    }

    /* Main */
    public static void main(String[] args) {
        Cheese c1 = new Cheese();
        System.out.println(c1.getType());
        Cheese c2 = new Cheese("Gouda", 2.5);
        System.out.println(c2.getFatPercentage());
        c2.setFatPercentage(4.5);
        System.out.println(c2.getFatPercentage());
        System.out.println(c1.equals(c2));
    }
}