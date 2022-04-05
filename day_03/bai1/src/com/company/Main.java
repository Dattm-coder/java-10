package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int a = 17;
//        int b = 10;
////        System.out.println(a<b);
//        if(a < b){
//            System.out.println("Số a nhỏ hơn b");
//        }else if(a > b){
//            System.out.println("a lớn b");
//        }else {
//            System.out.println("a bằng b");
//        }

        //
        //lồng các câu lệnh if else

//        if(a < b){
//            System.out.println("a nhở hơn b");
//        }else {
//            if(a == b){
//                System.out.println("a bằng b");
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Xin mời nhập chiều cao");
//        double chieuCao = sc.nextDouble();
//        System.out.println("Xin mời nhập cân nặng");
//        double canNang = sc.nextDouble();
//
//        double bmi = canNang/(chieuCao*chieuCao);
//
//        if (bmi < 18.5){
//            System.out.println("gầy");
//        }else if(bmi >=18.5 && bmi <= 24.9){
//            System.out.println("bình thường");
//
//        }else {
//            System.out.println("béo");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("xin mời nhập a: ");
        int a = sc.nextInt();
        System.out.println("xin mời nhập b: ");
        int b = sc.nextInt();
        System.out.println("xin mời nhập c: ");
        int c = sc.nextInt();

        if (a+b >c){
            System.out.println("3 cạnh tạo thành 1 tam giác");
        }else if(a+c >b){
            System.out.println("3 cạnh tạo thành 1 tam giác");
        }else if(b+c >a){
            System.out.println("3 cạnh tạo thành 1 tam giác");
        }
        else {
            System.out.println("không hợp thành 1 tam giác");
        }






    }
}
