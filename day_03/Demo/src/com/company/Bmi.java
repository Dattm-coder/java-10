package com.company;

public class Bmi {
    public void bmiCalculator(){
        double height = 1.5;
        double weight = 45;

        double bmi = weight/(height*height);
        System.out.println("Chi so bmi: "+ bmi);
    }
    public void bmiCalculator2(double height,double weight){
        double bmi = weight/(height*height);
        System.out.println("Chi so bmi: "+ bmi);
    }

    public double bmiCalculator3(double height,double weight){
        double bmi = weight/(height*height);
        return bmi;
    }

    public String result(double bmi){
        String rs ="";

        if (bmi < 18.5){
//            System.out.println("Gay");
//            return "Gay";
            rs ="gay";
        }else if (bmi >= 18.5 && bmi <= 24.5){
//            System.out.println("nguoi dep");
            rs ="Binh thuong";

        }else {
//            System.out.println("thua can");
            rs = "beo";
        }
        return rs;
    }

    public double dienTich(double r){
        double s = (r*r)*Math.PI;
        return s;
    }
    public double chuVi(double r){
        double c = (r*2)*Math.PI;
        return c;
    }
}
