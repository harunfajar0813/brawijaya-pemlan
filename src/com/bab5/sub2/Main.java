package com.bab5.sub2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu1 = 1;
        do {
            System.out.println("1. Beli jaket");
            System.out.println("2. Exit");
            System.out.print("Pilihan Anda : ");
            menu1 = in.nextInt();
            switch (menu1){
                case 1:
                    System.out.println("Daftar harga");
                    System.out.println("1. Jaket A : " + Jaket.hargaA);
                    System.out.println("2. Jaket B : " + Jaket.hargaB);
                    System.out.println("3. Jaket C : " + Jaket.hargaC);
                    System.out.print("Pilih jenis jaket : ");
                    int pilihanJaket = in.nextInt();
                    System.out.print("Jumlah jaket yang hendak dibeli : ");
                    int jumlahJaket = in.nextInt();
                    Jaket.transaksi(pilihanJaket, jumlahJaket);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
            }
        } while (menu1 != 2);
    }
}
