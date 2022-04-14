import model.Person;
import model.Student;
import service.StudentService;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        //gọi tới phương thức nhập dữ liệu
        Student s2 = new Student();

        s1.input();
        s2.input();

//        s1.output();
//        s2.output();
//        System.out.println(s1.diemTrungBinh());

        System.out.println(s1);
        System.out.println(s2);


        //sử dụng class studentService
        StudentService service = new StudentService();
        Student s3 = service.createStudent();
        System.out.println(s3);


        Student[] arrStudent = new Student[3];
        Student s = new Student(1, "Ngọc", 8, 8);
        arrStudent[0] = s;
        arrStudent[1] = new Student(2, "linh", 7, 8);
        arrStudent[2] = new Student(3, "ĐẠt",9,9);
        for (int i=0; i<arrStudent.length; i++){
            System.out.println(arrStudent[i]);
        }
        System.out.println("======================================");
        for (Student student: arrStudent){
            System.out.println(student);
        }

        System.out.println("Tìm theo tên");
        for(Student student: arrStudent){
            if (student.name.equalsIgnoreCase("Ngọc")){
                System.out.println(student);
            }
        }
        System.out.println("Những người có điểm thực hành bằng 8: ");
        for (Student student : arrStudent){

        }
    }
}
