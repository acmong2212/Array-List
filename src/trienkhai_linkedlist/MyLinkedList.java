package trienkhai_linkedlist;

public class MyLinkedList {
    Node head;
    int numberNode;

    public class Node{
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return data;
        }
    }


    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node node = new Node(data);
        if (index < numberNode && index >= 0) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        numberNode++;
    }

    public void addFirst(Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        numberNode++;

    }

    public void show() {
        Node temp = head;
        for (int i = 0; i <= numberNode; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
