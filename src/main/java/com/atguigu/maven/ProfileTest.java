package com.atguigu.maven;

public class ProfileTest {

    public static void main(String[] args) {

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " is working");
        });

        System.out.println("1234");
        System.out.println("master commit");
        System.out.println("hot-fix");

        System.out.println("asdfasdf");
        System.out.println("asdfasdf");
        System.out.println("asdfasdf");
        System.out.println("git test");
        System.out.println("git test123");

        System.out.println("123");
        System.out.println("pc2");
    }
}

