package datastructures.list;

//This Class have all methods for queue, stack, list.
public class ListImplementation {

    private ListNode head;
    private ListNode tail;
    private int length;

    public ListImplementation(int value){
        this.head = new ListNode(value);
        this.tail = this.head;
        this.length = 1;
    }

    public int getLength() {
        return this.length;
    }

    public void append(int value){
        ListNode list = new ListNode(value);
        this.tail.next = list;
        this.tail = list;
        this.length++;
    }

    public int popFirst(){
        //This is when the linked list is empty
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }

        //This is when the linked list have only one node
        if (head.next == null) {
            ListNode removedNode = head;
            head = null;
            length--;
            return removedNode.data;
        }

        //This return the last data and delete of the linked list
        ListNode removedNode = head;
        head = head.next;
        length--;
        return removedNode.data;
    }

    public int popLast(){
        //This is when the linked list is empty
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }

        //This is when the linked list have only one node
        if (head.next == null) {
            ListNode removedNode = head;
            head = null;
            length--;
            return removedNode.data;
        }

        //this store de before last and last node
        ListNode current = head;
        ListNode before = null;
        while (current.next != null) {
            before = current;
            current = current.next;
        }

        //This return the last data and delete of the linked list
        ListNode removedNode = current;
        before.next = null;
        length--;
        return removedNode.data;
    }

    public void print(){
        ListNode current = this.head;
        System.out.println("This is the current list");
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
