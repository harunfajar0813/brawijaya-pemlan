package com.bab6.praktikum;
public class Manusia {
    private String nama;
    private Boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    private String jkString;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        this.jkString = (jenisKelamin == true)?"Laki-Laki" : "Perempuan";
    }
    public String getNama() {
        return nama;
    }
    public Boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public Boolean getMenikah() {
        return menikah;
    }
    public String getJkString() {
        return jkString;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTunjangan(){
        if (menikah == true){
            if (jenisKelamin == true){
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public String toString(){
        return "Nama : " + nama +
                "\nNIK : " + nik +
                "\nJenis Kelamin : " + jkString +
                "\nPendapatan : " + getPendapatan();
    }
}
