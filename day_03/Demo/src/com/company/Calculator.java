package com.company;

import java.util.Scanner;

public class Calculator {
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Tổng: "+c);
    }
    public void minus(int a, int b){
        System.out.println("Tru: "+ ( a - b ));
    }
}
