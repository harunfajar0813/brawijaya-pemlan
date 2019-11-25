package com.company;

public class Sales extends Pegawai{
    private int jumlahProdukTerjual;

    public Sales(String nama, String nip, int gajiPokok, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahProdukTerjual){
        super(nama, nip, gajiPokok, tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahProdukTerjual = jumlahProdukTerjual;
    }

    public double bonusProdukTerjual(){
        if (jumlahProdukTerjual > 10){
            return 0.03 * jumlahProdukTerjual * super.getGajiPokok();
        } else {
            return 0;
        }
    }

    public String toString(){
        return super.toString()
                + "\nBonus Produk Terjual : " + bonusProdukTerjual();
    }
}
