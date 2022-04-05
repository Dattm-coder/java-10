package com.company;

import java.util.Scanner;

public class ClassContinue {
    public static void main(String[] args) {
//
//
//        for (int i = 0; i <= 5; i++){
//            System.out.println(i);
//        }
//
//        for (int  i = 2; i < 10; i++){
//            if(i%2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }


      /*  int i = 0;
        while (i < 10){
            System.out.println("Xin chào");
            i++;
        }*/


//        Scanner sc = new Scanner(System.in);
//        int age = 0;
//        int count = 0;
//        boolean isContinue = true;
//        while (age <= 0){
//            System.out.println("Nhập tuổi: ");
//            age = sc.nextInt();
//            count ++;
//
//            if(age > 0){
//                isContinue = false;
//            }
//            if(count >=3){
//                System.out.println("Bạn nhập quá nhiều lần");
//                System.exit(0);
//
//            }
//
//        }
//        System.out.println("tuổi của bạn là: " + age);


//        int i = 11;
//        do {
//            System.out.println("Xin chào");
//            i++;
//        }while (i < 10);

/*        for (int i = 0; i <= 100; i++ ){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }*/

//        for (int i = 0; i <= 100; i++ ){
//            if(i % 3 == 0){
//                if (i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                }else {
//                    System.out.println("Fizz");
//                }
//            }else {
//                if (i % 5 == 0){
//                    System.out.println("Buzz");
//                }else {
//                    System.out.println(i);
//                }
//            }
//        }
        // lập phương trình
        Scanner sc = new Scanner(System.in);
        double a = 0;
        do {
            System.out.println("Xin mời nhập a:");
            a = sc.nextDouble();
        }while (a == 0);

        System.out.println("Xin mời nhập b:");
        double b = sc.nextDouble();
        System.out.println("Xin mời nhập c:");
        double c = sc.nextDouble();

        double d = ((b*b) - (4*a*c));

        if (d > 0){
            System.out.println("Có 2 nghiệm");
            System.out.println("x1 = " + ((-b)- Math.sqrt(d))/(2*a));
            System.out.println("x2 = " + ((-b)+ Math.sqrt(d))/(2*a));
        }else if (d == 0){
            System.out.println("Có 1 nghiệm kép x =" + (-b/(2*a)));
        }else {
            System.out.println("Vô nghiệm");
        }

    }
}
