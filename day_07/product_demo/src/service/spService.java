package service;

import model.Qlsanpham;

import java.util.ArrayList;

public class spService {

    public ArrayList<Qlsanpham> getAllPQlsanphams() {
        ArrayList<Qlsanpham> splist = new ArrayList<>();
        splist.add(new Qlsanpham(1, "Cà phê", "Ngon", 34, 12000,"VND"));
        splist.add(new Qlsanpham(2, "Cà pháo", "Ngon", 22, 11000,"VND"));
        splist.add(new Qlsanpham(3, "Cà chua", "Ngon", 35, 15000,"VND"));
        splist.add(new Qlsanpham(4, "Bí đao", "Ngon", 38, 112000,"VND"));
        return splist;
    }
    public void show(ArrayList<Qlsanpham> list) {
        for (Qlsanpham sp : list) {
            System.out.println(sp);
        }
    }

    public void timKiem(ArrayList<Qlsanpham> list, Qlsanpham qlsanpham){
        for( Qlsanpham sp : list){
            if(Qlsanpham.ten.equalsIgnoreCase("Sách giáo khoa")){
                System.out.println(spService);
            }
    }
}
