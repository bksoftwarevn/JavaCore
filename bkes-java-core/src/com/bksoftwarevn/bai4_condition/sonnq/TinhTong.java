package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.Scanner;

public class TinhTong {

    public static void main(String[] args) {
        int n;
        long tong = 0;
        do{

            System.out.println("Mời bạn nhập số n bất kỳ : ");
            n = new Scanner(System.in).nextInt();
        }while (n <= 0);

        for(int i = 0; i <= n ; i++){
            tong += i;

        }
        System.out.println("Tổng dãy số đến số n là " + tong);

    }
}
