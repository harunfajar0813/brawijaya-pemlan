package com.bab7.praktikum;public class KuePesanan extends Kue {
    private double berat;
    private static double totalHargaKuePesanan;
    private static double totalBeratKuePesanan;
    private static double hargaAkhirKuePesananTermahal;
    private static String namaKuePesananTermahal;
    private static double hargaPerKuePesananTermahal;
    private static double beratKuePesananTermahal;

    public KuePesanan(String nama, double harga, double berat){
        super(nama,harga);
        this.berat = berat;
        totalHargaKuePesanan += hitungHarga();
        totalBeratKuePesanan += berat;
        if (hitungHarga() > hargaAkhirKuePesananTermahal) {
            hargaAkhirKuePesananTermahal = hitungHarga();
            namaKuePesananTermahal = nama;
            hargaPerKuePesananTermahal = harga;
            beratKuePesananTermahal = berat;
        }
    }

    public double getBerat() {
        return berat;
    }

    public static double getTotalHargaKue() {
        return totalHargaKuePesanan;
    }

    public static double getTotalBeratKue() {
        return totalBeratKuePesanan;
    }

    public static String getDetailKueTermahal() {
        return String.format("\nNama : " + namaKuePesananTermahal + "\nHarga Per Kue : Rp. " + hargaPerKuePesananTermahal + "\nBerat : " + beratKuePesananTermahal + "\nHarga Akhir : Rp. " + hargaAkhirKuePesananTermahal);
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "\nBerat : " + berat + "\nHarga Akhir : Rp. " + hitungHarga());
    }
}