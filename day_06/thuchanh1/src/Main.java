import model.Person;

public class Main {

    public static void main(String[] args) {
//tạo đối tượng p1
        Person p1 = new Person();
        p1.name = "Linh";
        p1.age = 20;
        p1.address = "VPHUC";

        System.out.println(p1);
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address+ " - "+Person.school);
        p1.study();

        Person p2 = new Person();
//        p2.name = "HOA";
//        p2.age = 20;
//        p2.address = "Hanoi";
        System.out.println(p2.name + " - " + p2.age + " - " + p2.address);
        p2.study();

        Person p3 = new Person();


//
//        Dog dog1= new Dog();
//        dog1.breed = "Neapolitan Mastiff";
//        dog1.size = "Large";
//        dog1.age = "5 year";
//        System.out.println(dog1.breed + " - " + dog1.size + " - " + dog1.age+ " - " + dog1.color);
//        dog1.eat();
//        Dog dog2= new Dog();
//        dog1.breed = "Neapolitan Mastiff";
//        dog1.size = "Large";
//        dog1.age = "5 year";
//        Dog dog3= new Dog();
//        dog1.breed = "Neapolitan Mastiff";
//        dog1.size = "Large";
//        dog1.age = "5 year";
    }
}
