package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.*;

public class Demo2 {

    public static void main(java.lang.String[] args) {

        System.out.println("Mời bạn nhập giá trị ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Giá trị bạn vừa nhập vào là : " + a);
        if (a < 0) {

            System.out.println("Giá trị bên trong không tồn tại !");
        } else if (a == 0) {

            System.out.println("Giá trị bên trong tồn tại giá trị = 0!");
        } else {

            System.out.println("Giá trị bên trong tồn tại");
        }





    }
}
