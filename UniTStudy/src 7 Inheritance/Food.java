public class Food {
    /* Perms */
    private int _cal;
    private String _lastDate;

    /* Constructors */
    public Food() {
        _cal = 100;
        _lastDate = "1/1/1900";
    }

    public Food(int cal, String lastDate) {
        _cal = cal;
        _lastDate = lastDate;
    }

    /* Methods */
    public int getCal() {
        return _cal;
    }

    public String getLastDate() {
        return _lastDate;
    }

    public void setCal(int cal) {
        this._cal = cal;
    }

    public void setLastDate(String lastDate) {
        this._lastDate = lastDate;
    }

    public void eat() {
        System.out.println("I'm eating food");
    }

    public String toString() {
        return "Cal: " + this.getCal() + ", Last Date: " + this.getLastDate();
    }
}
