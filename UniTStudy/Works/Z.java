package UniStudyJava.Works;

public abstract class Z {
    protected int _zVal;

    public Z() {
        _zVal = 1;
    }

    public Z(int zVal) {
        _zVal = zVal;
    }

    public abstract boolean foo(int n);

    public boolean equals(Object obj) {
        if (!(obj instanceof Z))
            return false;
        return _zVal == ((Z) obj)._zVal;
    }
}
