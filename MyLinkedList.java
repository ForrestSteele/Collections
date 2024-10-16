// one hundred
/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList
{
    private Node head;
    private Node tail;
    private int size;
    
    public void addHead(int value) {
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        size++;
    }
    
    public void removeHead() {
        Node tempNode = head;
        head = head.getNext();
        size--;
        tempNode.setNext(null);
    }
    
    public void addTail(int value) {
        if (size == 0) {
            addHead(value);
        }
        Node node = new Node(value);
        tail.setNext(node);
        tail = node;
        size++;
    }
    
    //public void removeTail() {}, not needed for queues
    
    private class Node {
        private int element;
        private Node next;

        public Node (int value) {
            element = value;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setNext(Node node) {
            next = node;
        }
    }
}
