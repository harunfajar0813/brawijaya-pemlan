package com.company;

public class Dosen extends Pegawai implements Sertifikasi {

    private int jumlahSKS;
    private double gajiPerSKS;
    private boolean certified;

    public Dosen(String NIP, String nama, String alamat, int jumlahSKS, boolean certified) {
        super(NIP, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.certified = certified;
        this.gajiPerSKS = 100000;
    }

    public double getGajiTotal() {
        return super.getGajiPokok() + (jumlahSKS * gajiPerSKS);
    }

    @Override
    public boolean isCertified() {
        return certified;
    }
}
