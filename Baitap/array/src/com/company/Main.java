package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String s= new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập họ và tên: ");
        s= in.nextLine();
        StringBuilder kq= new StringBuilder();
        StringTokenizer tg= new StringTokenizer(s);
        while(tg.hasMoreTokens()){
            char arr[]= tg.nextToken().toCharArray();
            arr[0]= Character.toUpperCase(arr[0]);
            for(int i=1;i<arr.length;i++)
                arr[i]= Character.toLowerCase(arr[i]);
            kq.append(arr); kq.append(" ");
        }

        System.out.println("Họ và tên sau khi chuẩn hóa là: "+kq);


    }
}
