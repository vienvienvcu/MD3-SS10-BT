package model;

public class Customer {
    private String name;
    private String birthDate;
    private String address;
    private String imgUrl;

    public Customer() {
    }

    public Customer(String name,String birthDate,String address, String imgUrl) {
        this.address = address;
        this.birthDate = birthDate;
        this.imgUrl = imgUrl;
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

