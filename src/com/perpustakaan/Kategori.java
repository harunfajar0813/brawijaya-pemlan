package com.perpustakaan;

public class Kategori {
//     start bab2 pemlan
    private Buku[] buku;

    public Kategori(Buku buku[]) {
        this.buku = buku;
    }

    public void tampilkan(int pilihan) {
        if (pilihan == 1) {
            for (int i = 0; i <= 1; i++) {
                buku[i].displayMessage();
            }
        } else if (pilihan == 2) {
            for (int i = 2; i <= 3; i++) {
                buku[i].displayMessage();
            }
        } else if (pilihan == 3) {
            for (int i = 4; i <= 5; i++) {
                buku[i].displayMessage();
            }
        }
    }

    public void tampilanPilihan() {
        System.out.println("\tKategori Buku");
        System.out.println("\t1. Teknologi");
        System.out.println("\t2. Sejarah");
        System.out.println("\t3. Filsafat");
    }
//     end bab2 pemlan
}
