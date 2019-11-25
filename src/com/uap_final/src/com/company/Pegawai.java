package com.company;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pegawai {
    private String nama;
    private String nip;
    private int gajiPokok;
    private LocalDate waktuMasuk;

    public Pegawai(String nama, String nip, int gajiPokok, int tahunMasuk, int bulanMasuk, int tanggalMasuk){
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.waktuMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public LocalDate getWaktuMasuk() {
        return waktuMasuk;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public double getBonus() {
        if (Period.between(waktuMasuk, LocalDate.now()).getYears() < 1){
            return gajiPokok;
        } else if(Period.between(waktuMasuk, LocalDate.now()).getYears() >= 1 && Period.between(waktuMasuk, LocalDate.now()).getYears() <= 5){
            return 0.05 * gajiPokok * Period.between(waktuMasuk, LocalDate.now()).getYears();
        } else{
            return 0.1 * gajiPokok * Period.between(waktuMasuk, LocalDate.now()).getYears();
        }
    }

    public String toString(){
        return "Nama : " + nama
                + "\nNIP : " + nip
                + "\nGaji Pokok : " + gajiPokok
                + "\nTahun Masuk : " + waktuMasuk.getYear();
    }
}
