public class RentNode {
    // ---------- Perms ----------
    Rent _rent;
    RentNode _next;

    // ---------- Constructors ----------
    public RentNode(Rent r) {
        _rent = r;
        _next = null;
    }

    public RentNode(Rent r, RentNode next) {
        _rent = r;
        _next = next;
    }

    public RentNode(RentNode other) {
        this._rent = other._rent;
        this._next = other._next;
    }

    // ---------- Methods ----------
    public Rent getRent() {
        return _rent;
    }

    public RentNode getNext() {
        return _next;
    }

    public void setRent(Rent r) {
        _rent = r;
    }

    public void setNext(RentNode next) {
        _next = next;
    }
}
