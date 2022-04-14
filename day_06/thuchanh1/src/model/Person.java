package model;

public class Person {
    // tạo thuộc tính
    public String name;
    public int age;
    public String address;
    public static String school = "Techmaster";

    public void  study() {
        System.out.println(name + " Gọi phương thức này study()");

    }

    public Person(){
        System.out.println("contractor mặc định");
    }
    public Person(String ten,int tuoi, String diaChi){
        name = ten;
        age =tuoi;
        address =diaChi;
    }

    public static void  method(){
        System.out.println("Phương thúc static");
    }

    static {
        System.out.println("Khối static");
    }
}
