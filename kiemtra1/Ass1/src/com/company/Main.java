package com.company;

public class Main {

    public static void main(String[] args) {
        int h = 4;
        //hình vuông
        System.out.println("Hình vuông:");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Hình tam giác:");
        //hình tam giác
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

