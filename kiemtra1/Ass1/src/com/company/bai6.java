package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập email: ");
        String input1 = sc.nextLine();
        System.out.println("Xin mời nhập số điện thoại: ");
        String input2 = sc.nextLine();
        String regex1 = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";
        String regex2 = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(input2);
        //check email
        if (matcher1.find()) {
            System.out.println("Mail hợp lệ");
        } else {
            System.out.println("Kiem tra lai email!");
        }
        //check sdt
        if (matcher2.find()) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Kiem tra lai số điện thoại!");
        }
    }
}
