package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*ArrayList<String> strlist = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Double> doulist = new ArrayList<>();
        ArrayList<Character> charlist = new ArrayList<>();
//        ArrayList<> list = new ArrayList();

        //Thêm phần tử vào arraylist
        strlist.add("Java");
        strlist.add("HTML");
        strlist.add("Java core");
        strlist.add("C#");

        for(String s : strlist){
            System.out.println(s);
        }
        //Sắp xếp
        Collections.sort(strlist);
        System.out.println("Danh sách sau khi sắp xếp");
        for(String s : strlist){
            System.out.println(s);
        }

        System.out.println("Phần tử có index bằng 2 là: "+ strlist.get(2));

        // kiểm tra phần tử chứa y
        for( int i= 0; i< strlist.size();i++){
            if(strlist.get(i).contains("y")){
                System.out.println(strlist.get(i));
            }
        }
        //Kiểm tra
        System.out.println(strlist.contains("C#"));

        ArrayList<String> strlist2 = new ArrayList<>();
        strlist2.add("PHP");
        strlist2.add("C");
        strlist2.addAll(strlist);
        System.out.println(strlist2);


        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(2);
        intlist.add(4);
        intlist.add(5);
        intlist.add(11);
        intlist.add(12);
        intlist.add(23);
        intlist.add(21);
        intlist.add(13);
        intlist.add(15);
        int count = 0;
        for (int i=0; i< intlist.get(7);i++){
            if(i%2 == 0){
                System.out.println("Số chẵn trong chuỗi là:" + intlist.get(i));
                count ++;
            }
            System.out.println("Tổng số chắn: "+count);
        }




//        strlist.set(1, "MySQL");
//        System.out.println("Danh sách sau khi cập nhập");
//        for(String s : strlist){
//            System.out.println(s);
//        }
//
//        strlist.remove("Java");
//        System.out.println("Danh sách sau khi xóa java:");
//        for(String s : strlist){
//            System.out.println(s);
//        }
//
//        strlist.remove(1);
//        System.out.println("Danh sách sau khi xóa index 1");
//        for(String s : strlist){
//            System.out.println(s);
//        }
//
//        System.out.println("Số phần tử:" + strlist.size());
//
//        strlist.clear();
//        System.out.println("Số phần tử:" + strlist.size());

*/

        Person p = new Person(1,"Đạt",26,"Hà Giang");
        ArrayList<Person> perlist = new ArrayList<>();
        perlist.add(p);
        perlist.add(new Person(2,"Huy",22,"Vĩnh Phúc"));
        perlist.add(new Person(3,"Hiệp",22,"Vĩnh Phúc"));
        perlist.add(new Person(4,"Hoàng",22,"Vĩnh Phúc"));
        perlist.add(new Person(5,"Hải",22,"Vĩnh Phúc"));
        for (Person person : perlist){
            System.out.println(person.getId()+" - "+person.getName()+" - "+person.getAge()+" - "+person.getAddress());

        }

        Person findPerson = null;
        for (Person person : perlist){
            if(person.getName().equals("Huy")){
                findPerson = person;
            }
            perlist.remove(findPerson);

            for (Person person1 : perlist){
                System.out.println(person.getId()+" - "+person.getName()+" - "+person.getAge()+" - "+person.getAddress());

            }
        }

    }
}
