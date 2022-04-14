package model;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public float theoryPoint;
    public float praticalPoint;

    public static String school = "Techmaster";

    public Student() {
    }

    public Student(int id, String name, float theoryPoint, float praticalPoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.praticalPoint = praticalPoint;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        this.theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        this.praticalPoint = sc.nextFloat();*/
    }

    public float diemTrungBinh() {
        float diemTrungBinh = (this.praticalPoint + this.theoryPoint) / 2;
        return diemTrungBinh;
//        System.out.println("Điểm trung bình: "+ diemTrungBinh);
    }

    public void output() {
        System.out.println(this.id + " - " + this.name + " - " + this.theoryPoint + " - " + this.praticalPoint + " - " + this.diemTrungBinh());
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name + " - " + this.theoryPoint + " - " + this.praticalPoint + " - " + this.diemTrungBinh();

    }
}


