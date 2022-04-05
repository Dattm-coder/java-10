package com.company;

import java.util.Random;

public class bai3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int randumNumber = rd.nextInt(50);
        System.out.println("Số ngẫu nhiên là: " + randumNumber);
        int index = 0;
        for (int i = 1; i <= randumNumber; i++) {
            if (randumNumber % i == 0) {
                index++;
            }
        }
        if (index == 2) {
            System.out.println(randumNumber + " la so nguyen to.");
        } else {
            System.out.println(randumNumber + " khong la so nguyen to.");
        }
    }
}
