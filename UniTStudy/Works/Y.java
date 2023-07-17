package UniTStudy.Works;

public class Y extends Z {
    protected int _yVal;

    public Y(int zval, int yVal) {
        _yVal = yVal;
    }

    public boolean foo(int n) {

        return n == _zVal;

    }

    public boolean equals(Z obj) {
        if (obj instanceof Y)

            return false;
        return super.equals(obj) || _yVal == ((Y) obj)._yVal;

    }
}
