package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        //VD01

        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 2;

//                    i<=arr[4];
//        System.out.println("Số phần tử có trong mảng: " + arr.length);
//        for(int i=0 ; i<=arr.length ; i++){
//            System.out.println(arr[i]);
//        }


/////////Dung for each
        System.out.println("Dung for each");
        for (int i : arr){
//            System.out.println(i); //in ra mang arr
            if(i%2 ==0){
                System.out.println("phan tu chan: "+i);
            }
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep");
        for (int i : arr){
            System.out.println(i);
        }

        int[] copy = Arrays.copyOf(arr,10);
        for (int i: copy){
            System.out.println(i);//gias tri k co se mac dinh laf 0
        }

        String string = Arrays.toString(copy);
        System.out.println(string);



//        for (int i= 0; i< arr.length; i++){
//            if(arr[i] == 8){
//                System.out.println("index: " + i);
//            }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                System.out.println("Số chẵn là: " + i);
                count++;
            }
        }
        System.out.println("số phần tử chia hết cho 2 là: " + count);


//     tìm số lớn nhất, nhỏ nhất trong chuỗi
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            System.out.println("mãx: " + max);
//        }

        //
//        int min = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < min) {
//                    min = arr[i];
//                }
//                System.out.println("min: " + min);
//            }

        //vd: sắp xếp mảng giảm dần

        for (int i = 0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("mảng sau khi sắp xếp: ");
        for (int i=0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

//        String[] languages = new String[4];
//        languages[0] = "html";
//        languages[1] = "html/css";
//        languages[3] = "html/java";
//        languages[2] = "html/ruby";
//        for (int i= 0; i<languages.length;i++){
//            System.out.println(languages[i]);
//        }


        //vd:02
/*        String[] names = {"Chris", "Emma", "John", "Robert"};
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(names[2]); //Lấy ra phần tử ở index 2

        System.out.println("Kích thước mảng:" + names.length);*/


//        for(int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
///     kish thước mảng từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số phần tử mảng: ");
//        int n = sc.nextInt();


//        nhập số phần tử
//        double[] pon = new  double[n];
//        for (int i = 0; i<n; i++){
//            System.out.printf("nhập phần tử thứ %d: ", (i+1));
//            pon[i] = sc.nextDouble();
//        }
//        System.out.println("mảng số thực:");
//        for (int i = 0; i<n; i++){
//            System.out.println(pon[i]+ "\t");
//        }


        String str = "Nó chỉ dừng lại ở đó";
        String[] s = str.split("\\s");
        System.out.println("trong chuỗi có bn từ: " +s.length);
        for(int i = 0 ; i < s.length; i++){
            System.out.println(s[i]);
        }

        //


    }
}
