package com.company;

public class bai2 {
    public static void main(String[] args) {
        String chuoi = "You only live once, but if you do it right, once is enough";
        char kyTu = 'o';
        int count = 0;

        System.out.println("Số ký tự trong chuỗi là: "+ chuoi.length());
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
                System.out.println("ký tự 'o' xuất hiện tại index: " + i);
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi '" + chuoi + "' = " + count);

    }
}
