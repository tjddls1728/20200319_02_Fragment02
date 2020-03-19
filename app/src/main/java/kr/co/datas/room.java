package kr.co.datas;

import java.io.Serializable;

public class room implements Serializable {

//    가격 주소 만 표현
    private int price;
    private String address;


    public room(int price, String address) {
        this.price = price;
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
