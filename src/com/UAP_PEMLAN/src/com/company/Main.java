package com.company;

public class Main {

    public static void main(String[] x) {
        System.out.println("Nomer 1");
        Pegawai d1 = new Dosen("1111", "Budi", "Malang", 10, true);
        Pegawai d2 = new Dosen("1112", "Andi", "Batu", 0, false);

        Pegawai sa1 = new StafAkademik("2111", "Bambang", "Batu", 20, false);
        Pegawai sa2 = new StafAkademik("2112", "Romi", "Lamongan", 22, true);

        Pegawai sk1 = new StafKebersihan("3111", "Doni", "Lamongan", 5);
        Pegawai sk2 = new StafKebersihan("3112", "Dona", "Lamongan", 0);

        DaftarPegawai daftarPegawai = new DaftarPegawai();
        daftarPegawai.addPegawai(d1);
        daftarPegawai.addPegawai(d2);
        daftarPegawai.addPegawai(sa1);
        daftarPegawai.addPegawai(sa2);
        daftarPegawai.addPegawai(sk1);
        daftarPegawai.addPegawai(sk2);

        daftarPegawai.tampilkan();

        System.out.println("\nNomor 2");
        for (Pegawai p: daftarPegawai.getPegawaiList()) {
            if (p instanceof Sertifikasi) {
                System.out.println(p.getNama());
            }
        }

        System.out.println("\n Nomor 3");
        double totalGajiSertifikasi = 0;
        for (Pegawai p: daftarPegawai.getPegawaiList()) {
            if (p instanceof Sertifikasi) {
                if (!((Sertifikasi) p).isCertified()) {
                    System.out.println("gak oleh duek : " + p.getNama());
                } else {
                    System.out.println(p.getNama());
                    totalGajiSertifikasi += 2000000;
                }
            }
        }

        System.out.println(totalGajiSertifikasi);
    }

}
