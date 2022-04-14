import java.util.Scanner;

//Viết chương tình quản lý sách với các thông tin sau:
//id,title,description, author, category, publishingYear
//thực hiện các công việc: thêm sách mới, in sách ra màn hình
public class Book {
    public int id;
    public String title;
    public String description;
    public String auther;
    public String category;
    public String publishingYear;


    public Book() {
    }

    public Book(int id, String title, String description, String auther, String category, String publishingYear) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.auther = auther;
        this.category = category;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", auther='" + auther + '\'' +
                ", category='" + category + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tiêu đề sách: ");
        this.title = sc.nextLine();
        System.out.println("nhập description: ");
        this.description = sc.nextLine();
        System.out.println("nhập author: ");
        this.auther = sc.nextLine();
        System.out.println("nhập category: ");
        this.category = sc.nextLine();
        System.out.println("nhập publishingYear: ");
        this.publishingYear = sc.nextLine();

    }
}
