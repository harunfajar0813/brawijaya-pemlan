package com.kontak;

public class Person {
    private String name;
    private String alamat;
    private String kota;
    private Phone[] phonesList;

    public Person(String name, String alamat, String kota, Phone[] phonesList){
        this.name = name;
        this.alamat = alamat;
        this.kota = kota;
        this.phonesList = phonesList;
    }

    public Person(String name, String alamat, String kota){
        this.name = name;
        this.alamat = alamat;
        this.kota = kota;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKota() {
        return kota;
    }

    public void setPhonesList(Phone[] phonesList){
        this.phonesList = phonesList;
    }

    public Phone[] getPhonesList(){
        return phonesList;
    }

    public void displayPerson(){
        System.out.println("Nama : " + this.name);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Kota : " + this.kota);
        for (int i = 0; i < this.phonesList.length; i++){
            this.phonesList[i].displayPhone();
        }
        System.out.println();
    }
}
