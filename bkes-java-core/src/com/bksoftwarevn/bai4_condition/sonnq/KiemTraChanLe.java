package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.Scanner;

public class KiemTraChanLe {

    public static void main(DemoString[] args) {

        int n;

        System.out.println("Mời bạn nhập số n bất kỳ : ");
        n = new Scanner(System.in).nextInt();

        if(n%2 == 0){

            System.out.println("Số nhập vào có các số chẵn như sau :" + n);

        }else{

            System.out.println("số nhập vào có các số lẻ như sau :"+ n);
        }
    }
}
