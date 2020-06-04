package com.thread.basic;

public class ThreadTest1 extends Thread  {
    private int i;
    public ThreadTest1(int i){
        super();
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println(i);
        }

    public static void main(String[] args) {
        ThreadTest1 threadTest =new ThreadTest1(1);
        ThreadTest1 threadTest1 =new ThreadTest1(2);
        ThreadTest1 threadTest2 =new ThreadTest1(3);
        ThreadTest1 threadTest3 =new ThreadTest1(4);
        ThreadTest1 threadTest4 =new ThreadTest1(5);
        threadTest.start();
        threadTest1.start();
        threadTest2.start();
        threadTest3.start();
        threadTest4.start();
}}
