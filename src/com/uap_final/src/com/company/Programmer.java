package com.company;

public class Programmer extends Pegawai implements PoPay{
    private int lembur;

    public Programmer(String nama, String nip, int gajiPokok, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int lembur){
        super(nama, nip, gajiPokok, tahunMasuk, bulanMasuk, tanggalMasuk);
        this.lembur = lembur;
    }

    public double tunjangan(){
        return 0.05 * super.getGajiPokok() * lembur;
    }

    @Override
    public double totalUang() {
        return tunjangan();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTunjangan Sales : " + tunjangan()
                + "\nTotal Gaji : " + totalUang();
    }
}
