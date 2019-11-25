package com.bab8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Membuat objek Manusia");
        System.out.print("Masukkan nama Anda : ");
        String nama = input.next();
        System.out.print("Masukkan umur Anda : ");
        int umur = input.nextInt();
        Manusia m1 = new Manusia(nama, umur);
        System.out.println("Hasil dari Objek Manusia");
        m1.tampilakanNama();
        m1.tampilakanUmur();
        m1.makan();
        m1.bersuara();
        m1.berjalan();

        System.out.println("\n\nMembuat objek Hewan");
        System.out.print("Masukkan nama hewan Anda : ");
        String namaHewan = input.next();
        System.out.print("Masukkan umur hewan Anda : ");
        int umurHewan = input.nextInt();
        Hewan h1 = new Hewan();
        System.out.println("Hasil dari Objek Manusia");
        System.out.println("Nama Hewan : " + namaHewan);
        System.out.println("Umur Hewan : " + umurHewan);
        h1.makan();
        h1.bersuara();
        h1.berjalan();
    }
}
