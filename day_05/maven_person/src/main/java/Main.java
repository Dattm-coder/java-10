import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Hiệp");
        p.setAge(21);
        p.setAddress("Hà Nội");
        System.out.println(p.getName() +" "+p.getAge()+" "+p.getAddress());
    }
}
