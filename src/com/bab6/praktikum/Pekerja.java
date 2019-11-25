package com.bab6.praktikum;import java.time.*;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    private double tunjanganAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak = jumlahAnak;
        this.tunjanganAnak = 20 * jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double getBonus(){
        LocalDate now = LocalDate.now();
        Period perbandinganTahun = Period.between(tahunMasuk, now);
        if (perbandinganTahun .getYears() >= 0 && perbandinganTahun .getYears() <= 5){
            return (0.05) * gaji;
        } else if (perbandinganTahun .getYears() >= 6 && perbandinganTahun .getYears() <= 10){
            return (0.1) * gaji;
        } else if(perbandinganTahun .getYears() >= 11){
            return (0.15) * gaji;
        } else {
            return 0;
        }
    }

    public String toString(){

        return "Nama : " + super.getNama() +
                "\nNIK : " + super.getNik() +
                "\nJenis Kelamin : " + super.getJkString() +
                "\nPendapatan : " + super.getPendapatan() +
                "\nTahun Masuk : " + tahunMasuk +
                "\nJumlah Anak : " + jumlahAnak +
                "\nGaji : " + (gaji + getBonus() + tunjanganAnak);
    }
}