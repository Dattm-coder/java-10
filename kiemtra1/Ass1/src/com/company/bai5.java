package com.company;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        //nhập mảng và in ra mảng
        //Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
        int soDong, soCot;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();


        int[][] mang1 = new int[soDong][soCot];
        int[][] mang2 = new int[soDong][soCot];
        int[][] mangTong = new int[soDong][soCot];

        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                mang1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                mang2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng 1 vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mang1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Mảng 2 vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mang2[i][j] + "\t");
            }
            System.out.println("\n");
        }


        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                mangTong[i][j] = mang1[i][j] + mang2[i][j];
            }
        }

        // hiển thị mảng tông

        System.out.println("Mảng tổng :");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mangTong[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
