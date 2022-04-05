package com.company;

import java.util.zip.CheckedInputStream;

public class bai4 {
    public static void main(String[] args) {
        //Liệt kê 10 số nguyên tố đầu tiên
        int n = 10;
        int status = 1;
        int num = 3;
        System.out.println(n + " Số nguyên tố đầu tiên là:");
        System.out.println(2);
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }

        //Liet ke cac so nguyen so nho hon 10
        System.out.println("\n");
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int i = 1; i < n; i++) {
            int dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.print(" " + i);
            }
        }
    }
}
