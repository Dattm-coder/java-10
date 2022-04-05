package com.company;

import java.util.Random;
import java.util.Scanner;

public class randum {
    public static void main(String[] args) {
        Random rd = new Random();
//        boolean isCheck = true;
//        while (isCheck) {
//            int randumNumber = rd.nextInt(100);
//            System.out.println("Randum: " + randumNumber);
//            if (randumNumber > 90) {
//                isCheck = false;
//            }
//        }


        boolean isCheck = true;
        while (isCheck) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Xin mời nhập số:");
            int number = sc.nextInt();
            int randumNumber = rd.nextInt(100);
            if (randumNumber == number) {
                System.out.println("xin chúc mừng bạn");
                isCheck = false;
            }else if( randumNumber < number){
                System.out.println("Bạn đã nhập số lớn hơn rồi, nhập lại");
            }else {
                System.out.println("Bạn đã nhập số nhỏ hơn rồi, nhập lại");
            }
        }



    }
}
