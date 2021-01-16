package com.bksoftwarevn.bai4_condition;

public class IfDemo {
    public static void main(String[] args) {
        /*
            if(dk){
                statements;
            }
            Kiem tra dk neu dung thi thuc hien cac cau lenh statements trong block if
         */

        int a = 10;
        if (a % 2 == 0) {
            System.out.println("a la so chan");
        }

        /*
            if(dk){
                statements1;
            }else{
                statements2;
            }
            Kiem tra dk neu dung thi thuc hien cac cau lenh statements1 trong block if
            Nguoc lai thuc hien cac lenh statements2 trong block else
         */

        if (a < 10) {
            System.out.println("a nho hon 10");
        } else {
            System.out.println("a lon hon 10");
        }

        a = 100;
        if (a < 10) {
            System.out.println("a nho hon 10");
            System.out.println("Khong co block code");
        }
        // Truong hop khong co block code {}
        if (a < 10)
            System.out.println("a nho hon 10");

        System.out.println("Khong co block code");


        boolean b1 = a > 10;
        boolean b2 = a%2!=0;
        boolean b3 = 1000%2!=0;

        if(b1 && b2 && b3){

        }

        if(b1){
            if(b2){
                if(b3){
                    // todo 1
                }
            }else {
                // todo 2
            }
        }

        if (b1 && b2 && b3) {
            // TODO: 11/01/2021
        }else if(b1 && !b2 ){
            // TODO: 11/01/2021 2
        }else {

        }




    }
}
