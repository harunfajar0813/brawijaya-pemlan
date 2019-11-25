package com.bab6.praktikum;public class Manager extends Pekerja {
    private String dapartemen;
    private double tunjanganManager;

    public Manager(String dapartemen, double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.dapartemen = dapartemen;
        tunjanganManager = (0.1) * getGaji();
    }
    public String getDapartemen() {
        return dapartemen;
    }
    public String toString(){
        return "Nama : " + super.getNama() +
                "\nNIK : " + super.getNik() +
                "\nJenis Kelamin : " + super.getJkString() +
                "\nPendapatan : " + super.getPendapatan() +
                "\nTahun Masuk : " + getTahunMasuk() +
                "\nJumlah Anak : " + getJumlahAnak() +
                "\nGaji : " + (getGaji() + getBonus() + tunjanganManager + getTunjanganAnak()) +
                "\nDepartemen : " + dapartemen;
    }
}