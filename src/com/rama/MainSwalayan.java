package com.rama;


import java.util.ArrayList;
import java.util.Scanner;

public class MainSwalayan {
    static Scanner baca = new Scanner(System.in);
    static ArrayList<Swalayan> daftar = new ArrayList();
    public static void main(String[] args) {


        tampilan();
//        do {!= member[3].getNoPelanggan() && pin != member[3].getPinPelanggan()));
    }

    static void tampilan(){
        String pil;
        do{
            System.out.println("\nSelamat Datang di Swalayan Tiny");
            System.out.println("--------------------------------");
            System.out.println();
            System.out.println("Silahkan masuk dengan akun anda");
            System.out.println("1. Masuk");
            System.out.println("2. Daftar");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pil = baca.next();
            switch(pil){
                case "1" :
                    masuk();
                    break;
                case "2" :
                    daftar();
                    break;
                default :
                    return;
            }
        }while(pil != "0");
    }

    static void daftar(){
        System.out.println();
        System.out.println("DAFTAR AKUN");
        System.out.println("------------\n");
        System.out.print("Masukkan nama anda : ");
        baca.nextLine();
        String nama = baca.nextLine();
        System.out.println("Jenis Rekening : ");
        System.out.println("1. Silver");
        System.out.println("2. Gold");
        System.out.println("3. Platinum");
        System.out.print("Masukkan pilihan anda : ");
        int pil = baca.nextInt();
        String no = new String();
        switch(pil){
            case 1 :
                no = "38";
                break;
            case 2 :
                no = "56";
                break;
            case 3 :
                no = "74";
                break;
        }
        int rdm = (int)(Math.random() * 100000000);
        no +=  String.valueOf(rdm);

        System.out.print("Masukkan pin 6 digit : ");
        String pin = baca.next();
        System.out.print("Masukkan saldo awal : ");
        int saldo = baca.nextInt();
        daftar.add(new Swalayan(nama,no,pin,saldo));
        System.out.println();
        daftar.get(daftar.size()-1).info();
    }
    static void masuk(){
        boolean keluar = false;
        int cnt = 0;
        baca.nextLine();
        while(!keluar){
            System.out.print("Masukkan No Rekening : ");
            String no = baca.nextLine();
            int ke = -1, i = 0;
            while(i < daftar.size()){
                if(daftar.get(i).getNoRekening().equals(no)){
                    ke = i; break;
                }else i++;
            }
            if(ke == -1){
                System.out.println("No Rekening tidak tersedia");
            }else{
                System.out.print("Masukkan Pin : ");
                String pin = baca.nextLine();
                Swalayan now = daftar.get(ke);
                if(now.getPin().equals(pin)){
                    masukSwalayan(ke);
                }else{
                    if(++cnt == 3) {
                        daftar.remove(ke);
                        keluar = true;
                    }
                    else{
                        System.out.println("Pin Salah!! Kesempatan mencoba "+(3-cnt)+" kali");
                    }
                }
            }
        }
    }

    static void masukSwalayan(int ke){
        System.out.println("\nSelamat Datang "+ daftar.get(ke).getNama() );
        System.out.println("-------------\n");
        System.out.println("1. Belanja");
        System.out.println("2. Top Up");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        int pil = baca.nextInt();
        switch(pil){
            case 1:

        }
    }
}
