package model;

public class Dog {
    public String breed;
    public String size;
    public String age;
    public String color;

//    public void eat(){
//        System.out.println("Ăn nhiều chỉ có ăn giềng với mắm tôm thôi");
//    }
//    public void sleep(){
//        System.out.println("Ngủ nhiều thì cũng lên mâm");
//    }
//    public void run(){
//        System.out.println("Chạy nhanh không lên đĩa");
//    }

    public Dog() {
    }

    public Dog(String breed, String size, String age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

}
