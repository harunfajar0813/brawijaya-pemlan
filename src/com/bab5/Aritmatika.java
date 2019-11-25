package com.bab5;

public class Aritmatika {
    static int a;
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
    }

    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }

    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }

    public double hitungPembagian(String nil1, String nil2){
        double A = Double.parseDouble(nil1);
        double B = Double.parseDouble(nil2);
        return A/B;
    }
}
