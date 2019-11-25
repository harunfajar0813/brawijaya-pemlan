package com.perpustakaan;

import java.io.*;

public class Buku {
    private String judul;
//    // start bab3 attribute pemlan
//    private String penulis;
//    private double hasilPenjualan;
//    // end bab3 attribute pemlan
    private String penerbit;
    private String kotaTerbit;
    private String sinopsis;
    private int tahunTerbit;
    private int jumlahHalaman;
    // start bab2 attribute pemlan
    private String[] penulis;
    // end bab2 attribute pemlan
//    // start bab3 pemlan
//    // soal nomer 4 hitungRoyalti(int hargaBuku, int persenYangInginDiambil)
//    public double hitungRoyalti(int hargaBuku, double persen,int bukuTerjual){
//        double potonganHarga = (persen/100.0) * hargaBuku * bukuTerjual;
//        return this.hasilPenjualan = potonganHarga;
//    }
//
//    // soal nomer 3 hitungRoyalti(int hargaBuku)
//    public double hitungRoyalti(int hargaBuku, int bukuTerjual){
//        double potonganHarga = (10.0/100.0) * hargaBuku * bukuTerjual;
//        return this.hasilPenjualan = potonganHarga;
//    }
//
//    // soal nomer 2
//    public void simpan(String pathFile){
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream(pathFile), "utf-8"))) {
//            writer.write("judul=" + judul);
//            writer.write("\npenulis=" + penulis);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // soal nomer 1
//    public void bacaFile(String path) {
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader(path));
//            String judul = reader.readLine().split("=")[1];
//            String penulis = reader.readLine().split("=")[1];
//            this.judul = judul;
//            this.penulis = penulis;
//            reader.close();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void show(){
//        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//        System.out.println("Judul Buku : " + judul);
//        System.out.println("Nama Penulis Buku : " + penulis);
//        System.out.println("Hasil penjualan buku adalah Rp." + hasilPenjualan);
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
//    }
//
//    public Buku() {
//        this.judul = judul;
//        this.penulis = penulis;
//    }
//
//    public Buku(String judul, String penulis) {
//        this.judul = judul;
//        this.penulis = penulis;
//    }
//
//    public String getJudul() {
//        return judul;
//    }
//
//    public void setJudul(String judul) {
//        this.judul = judul;
//    }
//
//    public String getPenulis() {
//        return penulis;
//    }
//
//    public void setPenulis(String penulis) {
//        this.penulis = penulis;
//    }
//    // end bab3 pemlan

    // start bab2 pemlan
    public Buku(String judul, String penerbit, String kotaTerbit, String sinopsis, String[] penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.kotaTerbit = kotaTerbit;
        this.sinopsis = sinopsis;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenulis() {
        String p = "";
        for (int i = 0; i < penulis.length; i++) {
            if (i == 0) {
                p += penulis[i];
            } else {
                p += ", " + penulis[i];
            }
        }
        return p;
    }

    public void cekKesamaan(Buku Buku) {
        int persen = 0;
        if (judul.equalsIgnoreCase(Buku.judul)) {
            persen += 16;
        }
        if (penerbit.equalsIgnoreCase(Buku.penerbit)) {
            persen += 16;
        }
        if (kotaTerbit.equalsIgnoreCase(kotaTerbit)) {
            persen += 16;
        }
        if (sinopsis.equalsIgnoreCase(Buku.sinopsis)) {
            persen += 16;
        }
        if (tahunTerbit == Buku.tahunTerbit) {
            persen += 16;
        }
        if (jumlahHalaman == Buku.jumlahHalaman) {
            persen += 20;
        }
        System.out.println("\nKesamaan dari Buku " + judul + " dan " + Buku.judul + " adalah " + persen + " %\n");
    }

    public int jumlahKata(String s) {
        String[] kata = s.split(" ");
        return kata.length;
    }

    public Buku copy() {
        return new Buku(judul, penerbit, kotaTerbit, sinopsis, penulis, tahunTerbit, jumlahHalaman);
    }


    public void displayMessage() {
        System.out.println("\nJudul Buku: " + judul);
        System.out.println("Penulis Buku: " + getPenulis());
        System.out.println("Penerbit Buku: " + penerbit);
        System.out.println("Tahun Terbit Buku: " + tahunTerbit);
        System.out.println("Sinopsis Buku: " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis Buku " + jumlahKata(sinopsis));
        System.out.println("");
    }
    // end bab2 pemlan
}
