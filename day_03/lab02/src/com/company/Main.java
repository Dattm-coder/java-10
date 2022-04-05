package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String chuoi = "Hello every one";
        char kyTu = 'e';
        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
                System.out.println("ký tự e xuất hiện tại index: " + i);
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi '" + chuoi + "' = " + count);

    }
}
