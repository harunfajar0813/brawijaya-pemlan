package com.bab5.sub2;

public class Jaket {
    public static final int hargaA = 100000;
    public static final int hargaB = 125000;
    public static final int hargaC = 175000;

    public static void transaksi(int pilihanJaket, int jumlahPembelian){
        if (jumlahPembelian >= 100){
            if (pilihanJaket == 1){
                System.out.println("Harga 1 jaket menjadi Rp. 95.000,-");
                System.out.println("Harga total : " + (95000 * jumlahPembelian));
            } else if (pilihanJaket == 2){
                System.out.println("Harga 1 jaket menjadi Rp. 120.000,-");
                System.out.println("Harga total : " + (120000 * jumlahPembelian));
            } else if (pilihanJaket == 3){
                System.out.println("Harga 1 jaket menjadi Rp. 160.000,-");
                System.out.println("Harga total : " + (160000 * jumlahPembelian));
            } else {
                System.out.println("Transaksi gagal");
            }
        } else if (jumlahPembelian >= 1 && jumlahPembelian <= 100) {
            int harga = 0;
            if (pilihanJaket == 1) {
                harga = hargaA;
            } else if(pilihanJaket == 2){
                harga = hargaB;
            } else if (pilihanJaket == 3){
                harga = hargaC;
            } else {
                System.out.println("Transaksi gagal");
            }
            System.out.println("Harga total : " + (harga * jumlahPembelian));
        } else {
            System.out.println("Transaksi gagal");
        }
    }
}
