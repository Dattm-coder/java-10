package com.company;

public class PrintData {
    public static void main(String[] args) {
        System.out.println("Xin chào");
        System.out.println("các bjan");


        String name = "Đạt";
        int age = 26;
        String address = "VP";
        System.out.println("Xin chào các bạn, tôi tên là: "+ name +
                ", năm nay tôi " + age + " tuổi, "+
                "tôi đến từ " +address);

        System.out.printf("Xin chào các bạn, tôi tên là: %s,"+ " năm nay rôi %d tuổi, tôi đến từ %s",name,age,address);

        System.out.printf("\n%f + %f = %f", 9f,8.5,7.5);

    }
}
