package com.swalayan;

public class Pelanggan {
    private String namaPelanggan;
    private String pinPelanggan;
    private String nomerPelanggan;
    private int saldoPelanggan;

    public Pelanggan(String namaPelanggan, String pinPelanggan, String nomerPelanggan, int saldoPelanggan){
        this.namaPelanggan = namaPelanggan;
        this.pinPelanggan = pinPelanggan;
        this.nomerPelanggan = nomerPelanggan;
        this.saldoPelanggan = saldoPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setPinPelanggan(String pinPelanggan) {
        this.pinPelanggan = pinPelanggan;
    }

    public String getPinPelanggan(){
        return pinPelanggan;
    }

    public void setNomerPelanggan(String nomerPelanggan) {
        this.nomerPelanggan = nomerPelanggan;
    }

    public String getNomerPelanggan() {
        return nomerPelanggan;
    }

    public void setSaldoPelanggan(int saldoPelanggan) {
        this.saldoPelanggan = saldoPelanggan;
    }

    public int getSaldoPelanggan() {
        return saldoPelanggan;
    }

    public void show(){
        System.out.println("Nama : " + namaPelanggan);
        System.out.println("Nomer Rekening : " + nomerPelanggan);
        System.out.println("Saldo : " + saldoPelanggan);
    }
}
