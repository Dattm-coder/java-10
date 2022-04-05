package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tao doi tuong class
        //<teen class> <teen bien tham chieu> = new <ten class>();
        Calculator calculator = new Calculator();
      //gọi phương thức sum()
        calculator.sum();

        calculator.minus(4,5);


        ///

        Bmi bmi = new Bmi();
        bmi.bmiCalculator();

        bmi.bmiCalculator2(1.6,55);
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao");
        double height = sc.nextDouble();
        System.out.println("Nhap can nang");
        double weight = sc.nextDouble();

//        double bmiRessult = bmi.bmiCalculator3(1.6,66);
        double bmiRessult = bmi.bmiCalculator3(height,weight);
        System.out.println("chi so bmi cua nguoi dep la: "+ bmiRessult);
        //
        //
        bmi.result(bmiRessult);

        System.out.println(bmi.result(bmiRessult));

        System.out.println("Moi nhap ban kinh");
        double r = sc.nextDouble();
        double dientich = bmi.dienTich(r);
        System.out.println("Dien tich la: "+dientich);


    }
}
