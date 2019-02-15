public class Function implements Interface {
    Node top;
    int size;
    int size2;
    int size3;

    public Function() {
        this.top = null;
        this.size = 0;
        this.size2 = 0;
        this.size3 = 0;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pushRight(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        size++;
    }

    @Override
    public void pushMiss(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        size2++;
    }

    @Override
    public void pushPoint(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        size3++;
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            Node temp = top;
            while (temp != null) {
                temp = top.getNext();
                top.setNext(null);
            }
            top = null;
            size = 0;
            size2 = 0;
        }
    }
}
