package com.company;

public class Manager extends Pegawai implements PoPay {
    public double poPay;

    public Manager(String nama, String nip, int gajiPokok, int tahunMasuk, int bulanMasuk, int tanggalMasuk){
        super(nama, nip, gajiPokok, tahunMasuk, bulanMasuk, tanggalMasuk);
    }

    public double getPoPay() {
        return super.getGajiPokok() + (0.1 * super.getGajiPokok());
    }

    @Override
    public double totalUang() {
        return getPoPay();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSaldo PoPay : " + totalUang();
    }
}
