package com.company;

import java.time.Month;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// sử dụng string literal
        String name = "Ngọc";
        String title = "Cuốn theo chiều gió";
    // Sử dụng từ khóa new
    String address = new String("Hà Nội");
    String fullName = "ngọc";
    String city = new String("Hà Nội");

        System.out.println("tôi tên là: "+ name);

        int size = name.length();
        System.out.println("Chuỗi "+ name + " dài "+ size);

        System.out.println("Độ dài chuỗi "+ address +"là:"+ address.length());
        //tính cả khoảng trống
        System.out.println("Viết in hoa: " + name.toUpperCase());
        //viết hoa
        System.out.println("Viết thường: " + name.toLowerCase());
        //viết thường

        System.out.println("So sánh 2 chuỗi: " + name.equals(fullName));
        //so sánh 2 chuỗi

        String result = name.equals(fullName) ? "2 chuỗi giống nhau" : "2 chuỗi khác nhau";
        System.out.println(result);
        //
        System.out.println(name == fullName);
        System.out.println(address == city);
        System.out.println(address.equals(city));

        //
        System.out.println("So sanh khong phan biet chu in hoa: "+ name.equalsIgnoreCase(fullName));

        String str = "    Java    ";
        System.out.println("Chuỗi ban đầu "+ str);
        System.out.println("đây là chuổi sau khi loại bỏ khoảng trắng: "+ str.trim());

        System.out.println("Thay chữ a thành chữ e: " + str.replace('a','e'));
        //replaceall thay đổi cả 1 chuỗi
        System.out.println(str.contains("a"));

        //Đếm vị trị ký tự
        System.out.println("Ký tự u nằm ở index bao nhiêu: "+ title.indexOf("u"));

        System.out.println("Ký tự u nằm ở index cuối cùng bao nhiêu: "+ title.lastIndexOf("u"));

        System.out.println("chữ ở index đầu tiên: " +title.charAt(0));
        // lấu ra chuỗi con
        System.out.println("Lấy ra chuỗi con: "+title.substring(10));
        System.out.println("lấy ra chuỗi con: "+title.substring(10,15));

        String s = "ngọc";
        String temp = String.valueOf(s.charAt(0));
        System.out.println("Viết hoa chữ cái đầu và viết thường các chữ cái sau: "+temp.toUpperCase()+s.substring(1).toLowerCase());
        // có thể có toLower để phòng chữ sau viết hoa


        Season muaDong = Season.WINTER;
        System.out.println(muaDong);

        Month thang = Month.DECEMBER;
        System.out.println(thang);

    }
}
