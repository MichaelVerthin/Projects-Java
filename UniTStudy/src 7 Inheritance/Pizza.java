public class Pizza extends Food {
    /* Perms */
    private int _numOfTops;
    private int _numOfSlices;

    /* Constructors */
    public Pizza() {
        super();
        _numOfTops = 1;
        _numOfSlices = 8;
    }

    public Pizza(int numOfTops, int numOfSlices, int cal, String lastDate) {
        super(cal, lastDate);
        _numOfTops = numOfTops;
        _numOfSlices = numOfSlices;
    }

    /* Methods */
    public int getNumOfTops() {
        return _numOfTops;
    }

    public int getNumOfSlices() {
        return _numOfSlices;
    }

    public void setNumOfSlices(int numOfSlices) {
        _numOfSlices = numOfSlices;
    }

    public void setNumOfTops(int numOfTops) {
        _numOfTops = numOfTops;
    }

    public void eat() {
        System.out.println("I'm eating pizza!!!");
    }

    public String toString() {
        return "Tops: " + this.getNumOfTops() + " Slices: " + super.toString();
    }
}
