package com.bksoftwarevn.bai3_wrapper_class;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10;
        int c = 10;
        Integer d = new Integer(10);

        System.out.println("a + 1 = "  + (a+1));
        System.out.println("b + 1 = "  + (b+1));

        System.out.println(b.doubleValue() + 1); // 11.0
        System.out.println(b.toString() + 1); // 101
        System.out.println(b.intValue() + 1); // 11


        // autoboxing
        Integer m = 10;

        //unboxing
        int n = m;  // Ban chat la no goi cau lenh intValue() de tra ve int -> giong lenh duoi
        int f = m.intValue();
    }
}