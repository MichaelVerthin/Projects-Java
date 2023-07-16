public class IntListTwo {
    private IntNodeTwo _head, _tail;

    public IntListTwo() {
        _head = null;
        _tail = null;
    }

    public boolean diff(int num) {
        int c = 0;
        IntNodeTwo temp = _head;
        if (temp.getValue() == num)
            c++;
        temp = temp.getNext();
        while (temp != _head) {
            if (temp.getValue() == num)
                c++;
            if (c == 2)
                return true;
        }
        return false;
    }

    // What the uni made:
    public boolean Unidiff(int num) {
        if (empty() || _head.getNext() == null)
            return false;
        IntNodeTwo ptr = _head;
        int max = ptr.getValue();
        int min = ptr.getValue();
        while (ptr != null) {
            if (ptr.getValue() > max)
                max = ptr.getValue();
            if (ptr.getValue() < min)
                min = ptr.getValue();
            ptr = ptr.getNext();
        }
        return max - min > num;
    }

    public boolean empty() {
        return _head == null;
    }

    public void addToEnd(IntNodeTwo node) {
        if (empty()) {
            _head = node;
            _tail = node;
            _head.setNext(null);
            _head.setPrev(null);
        } else {
            IntNodeTwo ptr = _head;
            while (ptr.getNext() != null)
                ptr = ptr.getNext();
            ptr.setNext(node);
            node.setNext(null);
            node.setPrev(ptr);
            _tail = node;
        }
    }
}
