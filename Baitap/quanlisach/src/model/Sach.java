package model;

public class Sach {
    public int maSach;
    public String tenSach;
    public String tacGia;
    public String theLoai;
    public String nhaXuatBan;
    public int namSX;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String tacGia, String theLoai, String nhaXuatBan, int namSX) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namSX=" + namSX +
                '}';
    }
}
