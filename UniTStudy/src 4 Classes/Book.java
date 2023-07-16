/**
 * Book class
 * 
 */

public class Book {

    private String _name;
    private int _numOfPages;

    public Book(String name, int numOfPages) {
        _name = name;
        _numOfPages = numOfPages;
    }

    public String getName() {
        return _name;
    }

    public int getNumOfPages() {
        return _numOfPages;
    }

    public void setName(String name) {
        /* Fix here */
        if (name != null && name != "")
            _name = name;
    }

    public void setNumOfPages(int numOfPages) {
        /* Fix here */
        if (numOfPages > 0)
            _numOfPages = numOfPages;
    }

}
