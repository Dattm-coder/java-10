package model;

public class Qlsanpham {
    private int id;
    private String ten;
    private String moTa;
    private int soLuong;
    private long giaBan;
    private String donVi;

    public Qlsanpham() {
    }

    public Qlsanpham(int id, String ten, String moTa, int soLuong, long giaBan, String donVi) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.donVi = donVi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return id +" - "+ ten+" - "+moTa+" - "+soLuong+" - "+giaBan+" - "+donVi;
    }
}
