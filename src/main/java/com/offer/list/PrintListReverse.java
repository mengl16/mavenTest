package com.offer.list;

import java.util.Stack;

/**输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @ClassName PrintListReverse
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/19 15:53
 * Version 1.0
 **/
public class PrintListReverse {


    public static void listReverse(Node node){
        if(node!=null){
            if(node.getNext()!=null){
                listReverse(node.getNext());
            }
            System.out.println(node.getData());
        }
//        Node node1=node;
//        while(node1!=null){
//            System.out.println(node1.getData());
//            node1=node1.getNext();
//        }
    }

    public static void listNotReverse(Node node){
        Stack<Node> nodes =new Stack<>();
        while(node!=null){
            nodes.push(node);
            node=node.getNext();

        }
        while (!nodes.isEmpty()){
            Node node1 =nodes.pop();
            System.out.println(node1.getData());
        }
//        Node node1=node;
//        while(node1!=null){
//            System.out.println(node1.getData());
//            node1=node1.getNext();
//        }
    }
    public static void main(String[] args) {

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
//        listReverse(node1);
        listNotReverse(node1);
    }
}
