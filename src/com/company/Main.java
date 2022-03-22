package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 5; i++) { //Tam giac nguoc
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) { //Tam giac
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++) { //Hinh vuong
            System.out.println();
            for (int j = 1; j < 6; j++) {
                System.out.print(" * ");
            }
        }
    }
}
