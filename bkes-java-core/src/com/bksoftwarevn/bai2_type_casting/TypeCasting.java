package com.bksoftwarevn.bai2_type_casting;

public class TypeCasting {
    public static void main(String[] args) {
        // Cơ chế ép kiểu
        /*
        1. Ep kieu tu dong: java kiem soat - danh cho chuyen kieu tu kieu co kich thuoc be sang lon
            Code: Khong phai code
        2. Ep kieu tuong minh: nguoc lai
            Code tuong minh ra: Muon chuyen tu kieu A ve Kieu B -> (B)A
         */

        int a = 10;
        float b = 20.5f;
        double c = a;
        a = (int)b;
    }
}
