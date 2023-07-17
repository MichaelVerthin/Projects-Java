package UniTStudy.Works;

public class X extends Z {
    protected int _xVal;

    public X(int zVal, int xVal) {
        super(zVal);
        _xVal = xVal;
    }

    public boolean foo(int n) {
        return n == _xVal;
    }
}
