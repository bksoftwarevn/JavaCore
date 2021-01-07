package com.bksoftwarevn.bai3_wrapper_class;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10;

        System.out.println("a + 1 = "  + (a+1));
        System.out.println("b + 1 = "  + (b+1));

        System.out.println(b.doubleValue() + 1); // 11.0
        System.out.println(b.toString() + 1); // 101
        System.out.println(b.intValue() + 1); // 11
    }
}
