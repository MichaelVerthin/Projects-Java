public class CircularIntList {
    private IntNode _head;

    public CircularIntList() {
        _head = null;
    }

    public CircularIntList(IntNode node) {
        _head = node;
    }

    public void printList() {
        System.out.println(_head.getValue() + "-->");
        IntNode temp = _head.getNext();
        while (temp != _head) {
            System.out.println(temp.getValue() + "-->");
            temp = temp.getNext();
        }
    }

    public void addToEnd(IntNode node) {
        if (empty()) {
            _head = node;
            _head.setNext(_head);
        } else {
            IntNode ptr = _head;
            while (ptr.getNext() != _head)
                ptr = ptr.getNext();
            ptr.setNext(node);
            node.setNext(_head);
        }
    }

    public boolean empty() {
        return _head == null;
    }
}
