/**
 * Version: (2023a)
 * Author's name: Michael Verthin
 * Author's ID: 209506260
 */
public class RentNode {
    // ---------- Perms ----------
    Rent _rent;
    RentNode _next;

    // ---------- Constructors ----------
    /**
     * Constructor that create a new RentNode,
     * it receives only the Rent and sets the next Node to be null
     * 
     * @param r
     */
    public RentNode(Rent r) {
        _rent = r;
        _next = null;
    }

    /**
     * Constructor that create a new RentNode,
     * it receives both the Rent and the next Node to be set as next to
     * 
     * @param r
     * @param next
     */
    public RentNode(Rent r, RentNode next) {
        _rent = r;
        _next = next;
    }

    /**
     * Constructor that create a new RentNode,
     * it receives another RentNode and copy the info of that one to the new one
     * 
     * @param other
     */
    public RentNode(RentNode other) {
        _rent = other._rent;
        _next = other._next;
    }

    // ---------- Methods ----------
    /**
     * 
     * @return a copy of the Rent that is that Node
     */
    public Rent getRent() {
        return _rent;
    }

    /**
     * 
     * @return a pointer to the next Node
     */
    public RentNode getNext() {
        return _next;
    }

    /**
     * Receives a Rent and updates the Rent inside this Node
     * 
     * @param r
     */
    public void setRent(Rent r) {
        _rent = r;
    }

    /**
     * Receive a pointer and updates the Next value to it
     * 
     * @param next
     */
    public void setNext(RentNode next) {
        _next = next;
    }
}
