package com.bab7.praktikum;public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString(){
        return String.format("\nNama : " + nama + "\nHarga Per Kue : Rp. " + harga);
    }
}