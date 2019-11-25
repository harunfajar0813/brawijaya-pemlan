package com.bab8;

public class Manusia implements MahlukHidup, Identitas {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Manusia : Makan pakai sendok garpu");
    }

    @Override
    public void berjalan() {
        System.out.println("Manusia : Jalan pakai dua kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Manusia : Suaranya merdu");
    }

    public void tampilakanNama() {
        System.out.println("Nama : " + this.nama);
    }

    @Override
    public void tampilakanUmur() {
        System.out.println("Umur : " + this.umur);
    }
}
