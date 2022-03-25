package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
//        String name = sc.next(); không nhận sau khoảng trắng

        System.out.println("Tên của bạn là:"+name);

        System.out.println("Nhập tuổi của bạn:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Tuổi của bận là: "+age);

        System.out.println("Nhập điểm của bạn là: ");
//        double point = sc.nextDouble();
//        sc.nextLine();// xử lý trôi lệnh

        double point = Double.parseDouble(sc.nextLine());

        System.out.println("Điểm của bạn là:"+point);

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Địa chỉ là: "+address);
        //
        //tính chỉ số bmi

        System.out.println("Nhập chiều cao: ");
        double chieucao = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cân nặng: ");
        double cannang = Double.parseDouble(sc.nextLine());
        System.out.println("Chỉ số Bmi = "+ (cannang/(chieucao*chieucao)));
    }
}
