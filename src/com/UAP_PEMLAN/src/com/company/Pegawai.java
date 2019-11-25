package com.company;

public abstract class Pegawai {

    private String NIP;
    private String nama;
    private String alamat;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, String alamat) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPokok = 2000000;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    abstract double getGajiTotal();
}
