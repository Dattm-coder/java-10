package service;

import model.Student;

import java.util.Scanner;
// class sử dụng để xử lí các phương thức đối với Student
public class StudentService {

    //tạo đối tượng với contractor mặc định
    public Student createStudent(){
        Scanner sc = new Scanner(System.in);
    Student s = new Student();
        System.out.println("Nhập id: ");
        s.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên: ");
        s.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        s.theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        s.praticalPoint = sc.nextFloat();
    return s;

    }
// tạo đt với ct có tham số
    public Student createNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        float theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        float praticalPoint = sc.nextFloat();

        Student s = new Student(id,name,theoryPoint,praticalPoint);
        return s;

    }


}
