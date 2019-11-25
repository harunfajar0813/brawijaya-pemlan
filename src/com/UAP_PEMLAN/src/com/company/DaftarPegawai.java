package com.company;

import java.util.ArrayList;

public class DaftarPegawai {

    ArrayList<Pegawai> pegawaiList;

    public DaftarPegawai() {
        this.pegawaiList = new ArrayList<>();
    }

    public ArrayList<Pegawai> getPegawaiList() {
        return pegawaiList;
    }

    public void addPegawai(Pegawai pegawai) {
        pegawaiList.add(pegawai);
    }

    public void tampilkan() {
        for (Pegawai p: pegawaiList) {
            System.out.println(p.getNama() + " " + p.getGajiTotal());
        }
    }
}
