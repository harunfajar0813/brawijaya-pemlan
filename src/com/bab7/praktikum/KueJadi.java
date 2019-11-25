package com.bab7.praktikum;public class KueJadi extends Kue {
    private double jumlah;
    private static double totalHargaKueJadi;
    private static double totalJumlahKueJadi;
    private static double hargaAkhirKueJadiTermahal;
    private static String namaKueJadiTermahal;
    private static double hargaPerKueJadiTermahal;
    private static double jumlahKueJadiTermahal;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama,harga);
        this.jumlah = jumlah;
        totalHargaKueJadi += hitungHarga();
        totalJumlahKueJadi += jumlah;
        if (hitungHarga() > hargaAkhirKueJadiTermahal) {
            hargaAkhirKueJadiTermahal = hitungHarga();
            namaKueJadiTermahal = nama;
            hargaPerKueJadiTermahal = harga;
            jumlahKueJadiTermahal = jumlah;
        }
    }

    public static double getTotalHargaKue() {
        return totalHargaKueJadi;
    }

    public static double getTotalJumlahKue() {
        return totalJumlahKueJadi;
    }

    public static double getHargaTermahal() {
        return hargaAkhirKueJadiTermahal;
    }

    public static String getDetailKueTermahal() {
        return String.format("\nNama : " + namaKueJadiTermahal + "\nHarga Per Kue : Rp. " + hargaPerKueJadiTermahal + "\nJumlah : " + jumlahKueJadiTermahal + "\nHarga Akhir : Rp. " + hargaAkhirKueJadiTermahal);
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public String toString(){
        return String.format(super.toString() + "\nJumlah : " + jumlah + "\nHarga Akhir : " + hitungHarga());
    }
}