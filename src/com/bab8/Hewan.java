package com.bab8;

public class Hewan implements MahlukHidup, Identitas{

    @Override
    public void makan() {
        System.out.println("Hewan : Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Hewan : Berjalan dengan 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Hewan : Suara tidak jelas");
    }

    public void tampilakanNama() {}

    @Override
    public void tampilakanUmur() {}
}
