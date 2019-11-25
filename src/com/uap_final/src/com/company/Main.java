package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pegawai manager1 = new Manager("Harun", "1112", 12000000, 2019, 1, 1);
        Pegawai manager2 = new Manager("Ulum", "1113", 15000000, 2016, 1, 1);
        Pegawai manager3 = new Manager("Fajar", "1114", 19000000, 2012, 1, 1);
        Pegawai sales1 = new Sales("Bambang", "1115", 7000000, 2013, 1,1, 11);
        Pegawai programmer1 = new Programmer("Dion", "1116", 10000000, 2018,1,1,4);

        ArrayList<Pegawai> pegawaiList = new ArrayList<>();
        pegawaiList.add(manager1);
        pegawaiList.add(manager2);
        pegawaiList.add(manager3);
        pegawaiList.add(sales1);
        pegawaiList.add(programmer1);

        System.out.println(manager1.toString());
        System.out.println();
        System.out.println(manager2.toString());
        System.out.println();

        System.out.println(manager3.toString());
        System.out.println();

        System.out.println(sales1.toString());
        System.out.println();

        System.out.println(programmer1.toString());
        System.out.println();

        System.out.println("soal terakhir");
        double totalBayaranPoPay = 0;
        for (int i=0; i<pegawaiList.size(); i++){
            if (pegawaiList.get(i) instanceof PoPay){
                System.out.println(pegawaiList.get(i).getNama());
                totalBayaranPoPay += ((PoPay) pegawaiList.get(i)).totalUang();
            }
        }

        System.out.println("Popay : " + totalBayaranPoPay);
    }
}
