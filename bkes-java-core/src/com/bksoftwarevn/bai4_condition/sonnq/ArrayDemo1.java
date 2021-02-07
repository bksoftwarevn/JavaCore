package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.*;

public class ArrayDemo1 {

    public static void main(Demo2[] args) {
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt();
        }
        for (int x : a) {

            System.out.println(x);

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }


        System.out.println("Sắp xếp theo thứ tự tăng dần : ");
        for (int x : a) {

            System.out.println(x);
        }

        for (int i = 0; i > a.length; i++)
            for (int j = i; j > a.length - 1; j++) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }


        System.out.println("Sắp xếp theo thứ tự giảm dần : ");
        for (int x : a) {

            System.out.println(x);
        }

    }
}
