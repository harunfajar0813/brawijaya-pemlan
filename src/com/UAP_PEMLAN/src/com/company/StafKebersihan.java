package com.company;

public class StafKebersihan extends Pegawai {

    private int poin;
    private double gajiPerPoin;

    public StafKebersihan(String NIP, String nama, String alamat, int poin) {
        super(NIP, nama, alamat);
        this.poin = poin;
        gajiPerPoin = 25000;
    }

    @Override
    double getGajiTotal() {
        return super.getGajiPokok() + (poin * gajiPerPoin);
    }
}
