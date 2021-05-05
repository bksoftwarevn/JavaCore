package com.bksoftwarevn.bai7_exam;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String myName = "Mạnh";
        String fullName;
        System.out.println("Nhap ho va ten: ");
        fullName = new Scanner(System.in).nextLine();

        if(fullName!=null){
            String tmp[] = fullName.split("\\s+");
            if(tmp.length > 0 && myName.equalsIgnoreCase(tmp[tmp.length-1].trim())){
                System.out.println("Yes - " + new StringBuilder(tmp[tmp.length-1].trim()).reverse());
            }
        }

        // hoặc
        if(fullName!=null){
            String tmp[] = fullName.split("\\s+");
            if(tmp.length > 0 && myName.equalsIgnoreCase(tmp[tmp.length-1].trim())){
                System.out.print("Yes - ");
                char a[] = tmp[tmp.length-1].trim().toCharArray();
                for (int i = a.length-1; i >=0 ; i--) {
                    System.out.print(a[i]);
                }
            }
        }

        if(fullName!=null && fullName.replace("\\s+"," ").endsWith(" " +  myName)){
            System.out.println("Yes - " + new StringBuilder(myName.trim()).reverse());
        }
    }
}
