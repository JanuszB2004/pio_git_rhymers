package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;
    private static final int EMPTY_INDICATOR = -1;


    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.getNext().prev = last;
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_INDICATOR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_INDICATOR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
class Node {

    private final int value;
    Node prev;
    Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}
