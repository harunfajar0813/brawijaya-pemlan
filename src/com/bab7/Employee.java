package com.bab7;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private static LocalDate tanggalLahir;
    private int produksiBarang;
    private int hargaProduksiBarang;

    public Employee(String name, String noKTP, int tahun, int bulan, int tanggal, int produksiBarang, int hargaProduksiBarang){
        this.name = name;
        this.noKTP = noKTP;
        tanggalLahir = LocalDate.of(tahun,bulan,tanggal);
        this.produksiBarang = produksiBarang;
        this.hargaProduksiBarang = hargaProduksiBarang;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }

    public static double getBonusBulan() {
        if (tanggalLahir.equals(LocalDate.now())) {
            return 100000;
        } else {
            return 0;
        }
    }
    public int getBonusProduksiBarang() {
        if (LocalDate.now().getDayOfMonth() > 1 && LocalDate.now().getDayOfMonth() <= 7){
            return produksiBarang * hargaProduksiBarang;
        } else if (LocalDate.now().getDayOfMonth() > 7 && LocalDate.now().getDayOfMonth() <= 14){
            return produksiBarang * hargaProduksiBarang;
        } else if (LocalDate.now().getDayOfMonth() > 14 && LocalDate.now().getDayOfMonth() <= 21){
            return produksiBarang * hargaProduksiBarang;
        } else {
            return produksiBarang * hargaProduksiBarang;
        }
    }

    public String toString(){
        return String.format(getName() + "\nNo. KTP : " + getNoKTP());
    }
    public abstract double earnings();//pendapatan
}
