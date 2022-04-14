package model;

public class Nvien {
    private int ID;
    private String name;
    private String birthday;
    private String address;
    private String email;
    private String mobile;

    public Nvien() {
    }

    public Nvien(int ID, String name, String birthday, String address, String email, String mobile) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
