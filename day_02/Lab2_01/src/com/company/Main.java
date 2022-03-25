package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chiều dài của hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Mời bạn nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        //Tính chu vi và diện tích hình chữ nhật
        double chuVi = (chieuDai + chieuRong)*2;
        double dienTich = chieuDai*chieuRong;
        System.out.println("Chu vi hình chữ nhật bạn đã nhập là: "+chuVi);
        System.out.println("Diện tích hình chữ nhật bạn đã nhập là: "+dienTich);
    }
}
