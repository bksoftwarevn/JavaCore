package com.bksoftwarevn.bai4_condition.sonnq;

import java.util.Scanner;

public class SonNQ {

    public static void main(String[] args) {
        String hoTen;
        int ngaySinh;
        int thangSinh;
        int namSinh;

        int ngayHienTai;
        int thangHienTai;
        int namHienTai;


        System.out.println("Mời bạn nhập Họ và Tên : ");
        hoTen = new Scanner(System.in).nextLine();


        System.out.println(" Mời bạn nhập ngày sinh : ");
        ngaySinh = new Scanner(System.in).nextInt();


        System.out.println("Mời bạn nhập tháng sinh : ");
        thangSinh = new Scanner(System.in).nextInt();


        System.out.println("Mời bạn nhập năm sinh : ");
        namSinh = new Scanner(System.in).nextInt();


        System.out.println("Mời bạn nhập ngày hiện tại : ");
        ngayHienTai = new Scanner(System.in).nextInt();

        System.out.println("Mời bạn nhập tháng hiện tại : ");
        thangHienTai = new Scanner(System.in).nextInt();

        System.out.println("Mời bạn nhập năm hiện tại : ");
        namHienTai = new Scanner(System.in).nextInt();


        System.out.println("Đang kiểm tra năm không nhuận ...");

        if (!((namSinh % 4 == 0 && namSinh % 100 != 0) || namSinh % 400 == 0)) {

            System.out.println("Năm sinh không là năm nhuận !");
        }

        if (!((namHienTai % 4 == 0 && namHienTai % 100 != 0) || namHienTai % 400 == 0)) {

            System.out.println("Năm hiện tại không là năm nhuận !");
        }


        System.out.println("Hoàn thành kiểm tra!");


    }
}
