package com.bab5;
import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        Aritmatika.hitungPengurangan(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        nil1  = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        Aritmatika.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int value1  = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);
        System.out.print("masukkan nilai 1 : ");
        // pembagian
        String angka1 = in.next();
        System.out.print("masukkan nilai 2 : ");
        String angka2= in.next();
        Aritmatika pembagian = new Aritmatika();
        System.out.println("nilai pembagian adalah : " + pembagian.hitungPembagian(angka1,angka2));
    }
}
