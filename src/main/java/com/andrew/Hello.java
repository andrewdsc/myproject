package com.andrew;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello(); //匿名物件並呼叫hello方法 只能執行一次
        Person p = new Person(); //這樣就可以由記憶體中重複呼叫p的物件並執行方法
        p.hello();
    }
}
