package com.bksoftwarevn.bai5_switch_case;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:
            case 3: {
                System.out.println("2");
                break;
            }
            default: {
                System.out.println("3");
            }
        }
    }
}
