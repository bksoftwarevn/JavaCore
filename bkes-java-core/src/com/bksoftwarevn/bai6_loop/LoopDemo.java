package com.bksoftwarevn.bai6_loop;

public class LoopDemo {
    public static void main(String[] args) {
        // for(int i = 0; i < 10; i++){}
        // while(i < 10){}
        // do{} while(i < 10)
        // foreach
        // khoi tao bien vong lap;dk vong lap; buoc nhay
        for(int i = 0,  b = 10; i < 10 ; i++){
            System.out.println(i);
        }

        int i = 0;
        for(System.out.println("1"), checkLoop();checkLoop() || checkLoop2() | checkLoop3(i) ; ){
            if(i < 10){
                System.out.println(i++);
            }else {
                break;
            }
            if(i%2==0){
                continue;
            }
            System.out.println("abc");
        }

        while (i > 10){
            System.out.println("1");
        }

        do {
            System.out.println(i);
        }while (i < 10);
    }

    private static boolean checkLoop3(int i) {
        return false;
    }

    private static boolean checkLoop2() {
        return false;
    }


    public static boolean checkLoop(){
        return System.currentTimeMillis()%2==0;
    }
}
