/**
 * Rectangle class.
 * 
 */

public class Rectangle {

    private int _height;
    private int _width;

    public Rectangle(int height, int width) {
        _height = height;
        _width = width;
    }

    /* Add isBigger method here */
    public boolean isBigger(Rectangle r2) {
        return r2._height * r2._width < this._height * this._width;
    }

    public String toString() {
        return "Width=" + _height + ", Height=" + _width;
    }
}
