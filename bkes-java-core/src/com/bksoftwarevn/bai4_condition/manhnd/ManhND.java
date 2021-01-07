package com.bksoftwarevn.bai4_condition.manhnd;

import java.util.*;

public class ManhND {
    public static void main(String[] args) {
        String name;
        int myBirthday;
        int myMonthDay;
        int myYear;

        int today;
        int month;
        int year;

        System.out.println("Nhap ten:");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay sinh:");
        myBirthday = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang sinh:");
        myMonthDay = new Scanner(System.in).nextInt();
        System.out.println("Nhap nam sinh:");
        myYear = new Scanner(System.in).nextInt();



        System.out.println("Nhap ngay:");
        today = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang:");
        month = new Scanner(System.in).nextInt();
        System.out.println("Nhap nam:");
        year = new Scanner(System.in).nextInt();

        System.out.println("Dang kiem tra nam khong nhuan....");

        if(!((myYear%4==0 && myYear%100!=0) || myYear%400==0)){
            System.out.println("Nam sinh khong la nam nhuan!");
        }

        if(!((year%4==0 && year%100!=0) || year%400==0)){
            System.out.println("Nam hien tai khong la nam nhuan!");
        }

        System.out.println("Hoan thanh kiem tra!");







    }


}
