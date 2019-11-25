package com.bab5.sub1;
public class Operasi {
    public static void penjumlahan(double a, double b){
        double hasilJumlah= a + b;
        System.out.println("Hasil penjumlahan : " + hasilJumlah);
    }
    public static void pengurangan(double a, double b){
        double hasilKurang = a - b;
        System.out.println("Hasil Pengurangan : " + hasilKurang);
    }
    public void pengalian(double a, double b){
        double hasilKali = a * b;
        System.out.println("Hasil Pengalian : " + hasilKali);
    }
    public void pembagian(int a, int b){
        int sederhana = sederhana(a,b);
        System.out.println("Hasil Bagi : " +  (a/sederhana) + " / " + (b/sederhana));
    }
    public int sederhana(int a, int b) {
        return b == 0 ? a : sederhana(b, a % b);
    }
}
