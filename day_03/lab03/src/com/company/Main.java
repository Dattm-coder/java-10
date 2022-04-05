package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String chuoi;
        char kyTu;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);
            // kiểm tra ký tự tại vị trí i
            // có giống với ký tự tại vị trí (chuoi.length() - i - 1) hay không
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
