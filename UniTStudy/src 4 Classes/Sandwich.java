public class Sandwich {

    /* Prems */
    private Cheese _cheese;
    private double _price;
    private boolean _isGrain;
    private final double DEFAULT_PRICE = 10;
    private final boolean ISGRAIN_DEFAULT = true;

    /* Constructors */
    public Sandwich(Cheese cheese, double price, boolean isGrain) {
        _cheese = new Cheese(cheese);
        _price = DEFAULT_PRICE;
        if (price >= 0)
            _price = price;
        _isGrain = isGrain;
    }

    public Sandwich(String type, double fatPercentage, double price, boolean isGrain) {
        _cheese = new Cheese(type, fatPercentage);
        _price = DEFAULT_PRICE;
        if (price >= 0)
            _price = price;
        _isGrain = isGrain;
    }

    public Sandwich() {
        _cheese = new Cheese();
        _price = DEFAULT_PRICE;
        _isGrain = ISGRAIN_DEFAULT;
    }

    public Sandwich(Sandwich other) {
        this._cheese = new Cheese(other.getCheese());
        this._price = other.getPrice();
        this._isGrain = other.isGrain();
    }

    /* Methods */
    public Cheese getCheese() {
        return new Cheese(_cheese);
    }

    public double getPrice() {
        return _price;
    }

    public boolean isGrain() {
        return _isGrain;
    }

    public void setCheese(Cheese cheese) {
        _cheese = new Cheese(cheese);
    }

    public void setPrice(double price) {
        _price = price;
    }

    public void setIsGrain(boolean grain) {
        _isGrain = grain;
    }

}