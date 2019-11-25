package com.perpustakaan;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
//        // start bab3 pemlan
//        Buku buku1 = new Buku();
//        buku1.bacaFile("/home/harun/Documents/UniBraw/2/PemLan/pemlan/bufferRW/buku1.txt");
//        buku1.hitungRoyalti(5000, 3);
//        buku1.show();
//        Buku buku2 = new Buku("siap kuy", "atta");
//        buku2.simpan("/home/harun/Documents/UniBraw/2/PemLan/pemlan/bufferRW/buku2.txt");
//        buku2.hitungRoyalti(15000, 10, 2);
//        buku2.show();
//        // end bab3 pemlan

        // start bab2 pemlan
        Scanner in = new Scanner(System.in);
        int pilihan;
        Buku tek_ti = new Buku("Panduan Jurusan TI", "Gagas Media", "Malang", "Buku tentang apa saja yang ada di jurusan ini.", new String[]{"Sutrisno"}, 2000, 100);
        Buku tek_tif = new Buku("Panduan Jurusan TIF", "Ulum Media", "Jakarta", "Buku tentang apa saja yang ada di jurusan ini.", new String[]{"Sutrisno", "Wahyu"}, 2000, 200);
        Buku sej_candi = new Buku("Sejarah Candi Nusantara", "Harun Media", "Surabaya", "Bercerita tentang sejarah terbentuknya candi yang elit.", new String[]{"Ilam", "lukas", "Aldo"}, 2002, 200);
        Buku sej_papua = new Buku("Sejarah Bumi Papua", "Xiaomi Media", "Papua", "Bercerita tentang sejarah terbentuknya papua yang indah nan elok.", new String[]{"Yuke", "wildan"}, 2002, 200);
        Buku fil_perang = new Buku("Ilmu Filsafat Perang", "Ubuntu Media", "Bekasi", "Ilmu yang mempelajrai mengenai Filsafat Perang.", new String[]{"Wando", "wildan"}, 2004, 400);
        Buku fil_politik = new Buku("Ilmu Filsafat Politik", "Windows Media", "Cirebon", "Ilmu yang mempelajrai mengenai Filsafat Politik.", new String[]{"Wando", "kenji"}, 2004, 100);

        Kategori tempatBuku = new Kategori(new Buku[]{tek_ti, tek_tif, sej_candi, sej_papua, fil_perang, fil_politik});
        do {
            System.out.println("+=+=+=+=+=+=WELCOME TO SMART LIBRARY+=+=+=+=+=+=");
            System.out.println("1. Pilih Buku");
            System.out.println("2. Cek kesamaan buku Panduan Jurusan TI dan buku Ilmu Filsafat Politik");
            System.out.println("3. Cek kesamaan Sejarah Candi Nusantara dan Ilmu Filsafat Perang");
            System.out.println("4. Copy Buku Sejarah Bumi Papua dan Panduan Jurusan TIF");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    tempatBuku.tampilanPilihan();
                    System.out.print("\tPilih Kategori : ");
                    int kategori = in.nextInt();
                    System.out.print("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    tempatBuku.tampilkan(kategori);
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    break;
                case 2:
                    System.out.print("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    tek_ti.cekKesamaan(fil_politik);
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    break;
                case 3:
                    System.out.println("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    sej_candi.cekKesamaan(fil_perang);
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    break;
                case 4:
                    Buku pilihBuku1 = sej_papua.copy();
                    System.out.println("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    System.out.println("Buku Sejarah Bumi Papua berhasil di copy");
                    pilihBuku1.displayMessage();
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    Buku pilihBuku2 = tek_tif.copy();
                    System.out.println("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    System.out.println("Buku Panduan Jurusan TIF berhasil di copy");
                    pilihBuku2.displayMessage();
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    System.out.println("\n+=+=+=+=+=+=+=+=+=+=+=+=");
                    pilihBuku1.cekKesamaan(pilihBuku2);
                    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    break;
                case 5:
                    System.out.println("+=+=+=+=+=+=See You+=+=+=+=+=+=");
                    break;
            }
        } while (pilihan != 5);
        // end bab2 pemlan
    }
}
