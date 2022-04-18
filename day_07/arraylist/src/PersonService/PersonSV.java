package PersonService;


import com.company.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonSV {
    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> perlist = new ArrayList<>();
        perlist.add(new Person(1, "Huy", 22, "Vĩnh Phúc"));
        perlist.add(new Person(2, "Hiệp", 22, "Vĩnh Phúc"));
        perlist.add(new Person(3, "Hoàng", 22, "Vĩnh Phúc"));
        perlist.add(new Person(4, "Hải", 22, "Vĩnh Phúc"));
        return perlist;
    }

    public void show(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }
    //tạo đối tượng person

    public Person createPerson() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Nhập tên: ");
        p.setName(sc.nextLine());
        System.out.println("nhập tuổi: ");
        p.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập địa chỉ: ");
        p.setAddress(sc.nextLine());
        return p;
    }
    //Thêm đối tượng person vào ArrayList

//tìm dối tuonjng theo id

    //Xóa đối tuowjg ra khỏi danh sáche
    public void removePerson(ArrayList<Person> list, Person person) {
        list.remove(person);
    }
//cập nhật lại địa chỉ
    public void
}
