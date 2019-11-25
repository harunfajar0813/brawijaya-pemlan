package com.bab7.praktikum;public class MainPraktikum7 {
    public static void main(String[] args) {
        Kue[] kues = new Kue[20];

        kues[0] = new KuePesanan("Astor", 1000, 11);
        kues[1] = new KuePesanan("Crimi", 2000, 12);
        kues[2] = new KuePesanan("Taichan", 3000, 13);
        kues[3] = new KuePesanan("Cookies", 4000, 14);
        kues[4] = new KuePesanan("Brownies", 5000, 15);
        kues[5] = new KuePesanan("Croisant", 10000, 20);
        kues[6] = new KuePesanan("Stick", 7000, 17);
        kues[7] = new KuePesanan("Roti", 8000, 18);
        kues[8] = new KuePesanan("Biskuit", 9000, 19);
        kues[9] = new KuePesanan("Lumpia", 6000, 16);

        kues[10] = new KueJadi("Pia Bali", 11000, 31);
        kues[11] = new KueJadi("Pie Susu", 12000, 32);
        kues[12] = new KueJadi("Krupuk", 13000, 33);
        kues[13] = new KueJadi("Better", 14000, 34);
        kues[14] = new KueJadi("Kue Lapis", 20000, 40);
        kues[15] = new KueJadi("Chips", 16000, 36);
        kues[16] = new KueJadi("Tortila", 17000, 37);
        kues[17] = new KueJadi("Kebab", 18000, 38);
        kues[18] = new KueJadi("Burger", 19000, 39);
        kues[19] = new KueJadi("Milo Cube", 15000, 35);

        for (Kue currentKue : kues){
            System.out.println(currentKue);
            if (currentKue instanceof KuePesanan){
                System.out.println("\nHarga Total Kue : Rp. " + KuePesanan.getTotalHargaKue());
                System.out.println("\nBerat Total Kue : " + KuePesanan.getTotalBeratKue());
                System.out.println("\nKue Termahal : Rp. " + KuePesanan.getDetailKueTermahal());
            } else {
                System.out.printf("%s%.1f","\nHarga Total Kue Jadi : Rp. ", KueJadi.getTotalHargaKue());
                System.out.println("\nJumlah Total Kue Jadi : " + KueJadi.getTotalJumlahKue());
                System.out.println("\nKue Termahal : Rp. " + KueJadi.getDetailKueTermahal());
            }
        }
        System.out.printf("%s%.1f","\nTotal Harga Semua Kue : Rp. ", (KuePesanan.getTotalHargaKue() + KueJadi.getTotalHargaKue()));
//        System.out.println("Kue Pesanan");
//        for (int i = 0; i < 10; i++){
//        }
//        System.out.println("\nHarga Total Kue Pesanan : Rp. " + KuePesanan.getTotalHargaKuePesanan());
//        System.out.println("\nBerat Total Kue Pesanan : " + KuePesanan.getTotalBeratKuePesanan());
//        System.out.println("\nKue Termahal : Rp. " + KuePesanan.getDetailKueTermahal());
//
//        System.out.println("\nKue Jadi");
//        for (int i=10; i < 20; i++){
//            System.out.println(kues[i]);
//        }
//        System.out.printf("%s%.1f","\nHarga Total Kue Jadi : Rp. ", KueJadi.getTotalHargaKueJadi());
//        System.out.println("\nJumlah Total Kue Jadi : " + KueJadi.getTotalJumlahKueJadi());
//        System.out.println("\nKue Termahal : Rp. " + KueJadi.getDetailKueTermahal());

        System.out.printf("%s%.1f","\nTotal Harga Semua Kue : Rp. ", (KuePesanan.getTotalHargaKue() + KueJadi.getTotalHargaKue()));
    }
}