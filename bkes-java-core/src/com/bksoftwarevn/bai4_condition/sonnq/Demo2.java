package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.*;

public class Demo2 {

    public static void main(java.lang.String[] args) {

        System.out.println("Mời bạn nhập giá trị vào đây : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Giá trị bạn vừa nhập vào là : " + a);
        if (a < 0) {

            System.out.println("Giá trị bên trong không tồn tại !");
        } else if (a == 0) {

            System.out.println("Giá trị bên trong tồn tại giá trị = 0!");

        } else {

            System.out.println("Giá trị bên trong tồn tại !");
        }

        int x= 0;
        do{

            System.out.println("Giá trị của i = "+ x );
            x++;


        }while(x <= 5);

        for(int i = 0; i <= 5; i++){

            System.out.print(i+ "");
        }




    }
}
