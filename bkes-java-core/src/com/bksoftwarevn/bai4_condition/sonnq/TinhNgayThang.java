package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.Scanner;

public class TinhNgayThang {

    public static void main(DemoString[] args) {
        int thang;
        int nam;


        System.out.println("Mời bạn nhập vào tháng : ");
        thang = new Scanner(System.in).nextInt();

        System.out.println("Mời bạn nhập vào năm : ");
        nam = new Scanner(System.in).nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("Tháng này có 31 ngày !");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("Tháng này có 30 ngày !");
                break;
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))

                    System.out.println("Tháng này có 29 ngày !");
                else

                    System.out.println("Tháng này có 28 ngày !");
                break;
            default:

                System.out.println("Tháng nhập không tồn tại !");
                break;
        }

    }
}
