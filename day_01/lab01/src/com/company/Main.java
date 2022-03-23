package com.company;

public class Main {

    public static void main(String[] args) {
//        Câu 1:
        int a = 12;
        int b = 6;
        double c = (double)b/a;
        System.out.println("Kết quả của phép cộng a+b= "+ (a+b));
        System.out.println("Kết quả của phép trừ a-b= "+ (a-b));
        System.out.println("Kết quả của phép trừ b-a= "+ (b-a));
        System.out.println("Kết quả của phép nhân a*b= "+ (a*b));
        System.out.println("Kết quả của phép chia a/b= "+ (a/b));
        System.out.println("Kết quả của phép chia b/a= "+ c);
//        Câu 2:
        int i = 0;
        System.out.println("Giá trị của i++: "+ (i++));// Đối với i++ thì biến i sẽ được in giá tri ban đầu i = 0 ra màn hình trước rồi sau đó mới tăng giá trị của i lên 1 đơn vị vì vậy sau khi in ra màn hình hiển thị thì giá trị của i = 1.
        System.out.println("Giá trị của ++i: "+ (++i));// Đối với ++i thì biến i sẽ được tăng lên 1 đơn vị so với giá trị i = 1 lên i =2 rồi sau đó được in ra mà hình với giá trị i = 2
    }
}
