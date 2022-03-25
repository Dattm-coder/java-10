package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Mời nhập họ tên, tuổi, giới tính, địa chỉ, tình trạng hôn nhân
        System.out.println("Xin mời nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Xin mời bạn nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Xin mời bạn nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Xin mời bạn nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Tình trạng hôn nhân: ");
        String status = sc.nextLine();
        System.out.println("Xin chào "+name+", bạn "+age +" tuổi, giới tính "+gender+", nơi ở "+address+" và tình trang hôn nhân là "+status);


    }
}
