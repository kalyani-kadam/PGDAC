public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(head == null) {
            head = newNode;
            return true;
        }

        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setPrev(last);

        return true;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public boolean insert(int data, int position) {
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            if(head != null) {
                newNode.setNext(head);
                head.setPrev(newNode);
            }
            head = newNode;
            return true;
        }

        Node prevNode = head;
        for(int i = 1; i < position - 1; i++) {
            prevNode = prevNode.getNext();
            if(prevNode == null) {
                return false;
            }
        }

        Node nextNode = prevNode.getNext();

        newNode.setPrev(prevNode);
        if(nextNode != null) {
            newNode.setNext(nextNode);
            nextNode.setPrev(newNode);
        }
        prevNode.setNext(newNode);

        return true;
    }
}
