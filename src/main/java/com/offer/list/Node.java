package com.offer.list;

/**
 * @ClassName Node
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/19 16:01
 * Version 1.0
 **/
public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }
    public void getList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
