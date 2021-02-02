package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.Scanner;

public class GiaiPTB2 {

    public static void main(Demo2[] args) {


        System.out.println("Giải phương tình bậc 2 : a*x^2 + b*x + c = 0 ");

        System.out.println("Mời bạn nhập giá trị a = ");
        float a = new Scanner(System.in).nextFloat();

        System.out.println("Mời bạn nhập giá trị b = ");
        float b = new Scanner(System.in).nextFloat();

        System.out.println("Mời banh nhập giá trị c =");
        float c = new Scanner(System.in).nextFloat();

        if(a == 0){
            if(b == 0){

                System.out.println("Phương trình vô nghiệm !");
            }else{

                System.out.println("Phương trình có nghiệm x = " +(-c / b ));
            }
            return;
        }

        float delta = b*b - 4*a*c;
        float x1;
        float x2;

        if(delta > 0){
            x1 = (float)((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float)((-b - Math.sqrt(delta)) / (2*a));

            System.out.println("Phương trình có 2 nghiệm x1 = " + x1);

            System.out.println("x2 = " + x2);
        }else if(delta == 0){
            x1 = (-b / (2 * a));

            System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ x1);
        }else{

            System.out.println("Phương trình này vô nghiệm! ");
        }



    }
}
