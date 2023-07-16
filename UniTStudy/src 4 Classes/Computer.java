/**
 * Computer class.
 * 
 */

public class Computer {

    private String _model;
    private int _memory;
    private final String DEFAULT_MODEL = "AX";
    private final int DEFAULT_MEMORY = 128;
    private final int MAX_MEMORY = 1024;

    public Computer() {
        _model = DEFAULT_MODEL;
        _memory = DEFAULT_MEMORY;
    }

    public void addMemory(int deltaMemory) {
        _memory += deltaMemory;
        /* fix the code here */
        if (_memory > MAX_MEMORY)
            _memory = MAX_MEMORY;
    }

    /** Ignore **/
    public String getModel() {
        return _model;
    }

    public int getMemory() {
        return _memory;
    }
}
