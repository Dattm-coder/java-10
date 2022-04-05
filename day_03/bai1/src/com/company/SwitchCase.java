package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tháng:");
        int number = sc.nextInt();
        switch (number){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Là tháng có 31 ngày");
                break;
            case 2:
                System.out.println("Là tháng có 28 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Là tháng có 30 ngày");
                break;
//            case 4:
//                System.out.println("Thứ 4");
//                break;
            default:
                System.out.println("Không có tháng đấy");
        }
    }



}
