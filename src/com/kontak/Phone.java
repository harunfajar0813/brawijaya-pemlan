package com.kontak;

public class Phone {
    private String type;
    private String phoneNumber;

    public Phone(String type, String phoneNumber){
        this.type = type;
        this.phoneNumber = phoneNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayPhone(){
        System.out.println(this.type + " : " + this.phoneNumber);
    }
}
