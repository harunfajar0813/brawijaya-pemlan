package com.company;

public class StafAkademik extends Pegawai implements Sertifikasi {

    private int jumlahHari;
    private double gajiPerHari;
    private boolean certified;

    public StafAkademik(String NIP, String nama, String alamat, int jumlahHari, boolean certified) {
        super(NIP, nama, alamat);
        this.jumlahHari = jumlahHari;
        this.gajiPerHari = 50000;
        this.certified = certified;
    }

    public double getGajiTotal() {
        return super.getGajiPokok() + ((jumlahHari-20) * gajiPerHari);
    }

    public boolean isCertified() {
        return certified;
    }
}
