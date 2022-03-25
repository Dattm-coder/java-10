package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();

        System.out.println(toDay);
        LocalDate currentDate = LocalDate.of(2021, 10,5);
        System.out.println(currentDate);

        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());

        System.out.println(toDay.plusDays(1));
        //tắng lên 1 ngày
        //giảm 1 ngày
        System.out.println(toDay.minusDays(1));
        //tăng thnasg
        System.out.println(toDay.plusMonths(12));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime currenttime = LocalTime.of(12, 30);
        System.out.println(currenttime);
        //lấy giờ
        System.out.println(time.getHour());
        System.out.println(time.plusMinutes(300));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(currentDate, currenttime);
        System.out.println(localDateTime);

        //Định dạng theo ý muốn
        String format = "dd/MM/yyyy, hh:mm";

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(format);
        String rs = dateTime.format(myFormat);
        System.out.println(rs);

        //Viết ra chwong trình in thông tin cá nhân gồm tên, ngày sinh, quê quán
        //
        LocalDate ngaysinh = LocalDate.of(2001, 2, 6);
        String name = "Trần Mạnh Đạt";
        String address = "Vĩnh Phúc";

        System.out.println("Xin chào, Tôi tên là "+name +", tôi sinh ngày "+ngaysinh+ ", quê quán "+address);

    }
}
