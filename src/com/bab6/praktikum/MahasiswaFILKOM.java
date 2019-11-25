package com.bab6.praktikum;public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public double getBeasiswa(){
        if  (ipk >= 3.0 && ipk <= 3.5){
            return 50;
        } else if (ipk >= 3.6 && ipk <= 4.0){
            return 75;
        } else {
            return 0;
        }
    }

    public String toString(){
        String angkatan = nim.substring(0,2);
        char jurusan = nim.charAt(6);
        if (jurusan == '2'){
            return "Nama : " + super.getNama() +
                    "\nNIK" + super.getNik() +
                    "\nJenis Kelamin : " + super.getJkString() +
                    "\nPendapatan : " + (super.getPendapatan() + getBeasiswa())  +
                    "\nNIM : " + nim +
                    "\nIPK : " + ipk +
                    "\nStatus : Teknik Informatika, " + angkatan;
        } else if (jurusan == '3') {
            return "Nama : " + super.getNama() +
                    "\nNIK : " + super.getNik() +
                    "\nJenis Kelamin : " + super.getJkString() +
                    "\nPendapatan : " + (super.getPendapatan() + getBeasiswa()) +
                    "\nNIM : " + nim +
                    "\nIPK : " + ipk +
                    "\nStatus : Teknik Komputer, " + angkatan;
        } else if (jurusan == '4') {
            return "Nama : " + super.getNama() +
                    "\nNIK : " + super.getNik() +
                    "\nJenis Kelamin : " + super.getJkString() +
                    "\nPendapatan : " + (super.getPendapatan() + getBeasiswa()) +
                    "\nNIM : " + nim +
                    "\nIPK : " + ipk +
                    "\nStatus : Sistem Informasi, " + angkatan;
        } else if (jurusan == '6') {
            return "Nama : " + super.getNama() +
                    "\nNIK : " + super.getNik() +
                    "\nJenis Kelamin : " + super.getJkString() +
                    "\nPendapatan : " + (super.getPendapatan() + getBeasiswa()) +
                    "\nNIM : " + nim +
                    "\nIPK : " + ipk +
                    "\nStatus : Pendidikan Teknologi Informasi, " + angkatan;
        } else if (jurusan == '7') {
            return "Nama : " + super.getNama() +
                    "\nNIK : " + super.getNik() +
                    "\nJenis Kelamin : " + super.getJkString() +
                    "\nPendapatan : " + (super.getPendapatan() + getBeasiswa()) +
                    "\nNIM : " + nim +
                    "\nIPK : " + ipk +
                    "\nStatus : Teknologi Informasi, " + angkatan;
        } else {
            return "failed";
        }
    }
}