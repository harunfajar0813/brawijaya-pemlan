package com.swalayan;
import java.util.Scanner;
import java.util.ArrayList;


public class Swalayan {
    static ArrayList<Pelanggan> pelangganList = new ArrayList();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("harun", "123456", "3812345678", 1500000);
        pelangganList.add(p1);
        Pelanggan p2 = new Pelanggan("ulum", "123456", "5612345678", 25300000);
        pelangganList.add(p2);
        Pelanggan p3 = new Pelanggan("fajar", "123456", "7412345678", 35300000);
        pelangganList.add(p3);
        String pilihanMenu1 = "";
        do {
            System.out.println("Selamat Datang ");
            System.out.println("1. Masuk");
            System.out.println("2. Keluar Sistem");
            System.out.print("Pilihan : ");
            pilihanMenu1 = in.next();
            switch (pilihanMenu1){
                case "1" :
                    boolean logOut = false, logOut2 = false;
                    int failedCounter = 0;
                    in.nextLine();
                    while (!logOut){
                        System.out.print("Nomer Rek : ");
                        String rekPelanggan = in.nextLine();
                        int indexData = -1, i = 0;
                        while (i < pelangganList.size()){
                            if (pelangganList.get(i).getNomerPelanggan().equals(rekPelanggan) && logOut2 == false) {
                                indexData = i;
                                System.out.print("PIN : ");
                                String PINPelanggan = in.next();
                                if (pelangganList.get(i).getPinPelanggan().equals(PINPelanggan)){
                                    while (!logOut2){
                                        System.out.println("toko");
                                        System.out.println("1. Belanja Iphone XS Max seharga Rp. 5.000.000");
                                        System.out.println("2. Top up");
                                        System.out.println("3. Log Out");
                                        System.out.print("Pilihan : ");
                                        String pilihanMenu2 = in.next();
                                        switch (pilihanMenu2){
                                            case "1":
                                                System.out.println("Iphone XS Max : Rp. 5.000.000");
                                                int harga = 5000000, saldoUser;
                                                if (pelangganList.get(i).getNomerPelanggan().substring(0,2).equals("38")){
                                                    if (harga >= 1000000){
                                                        if ((pelangganList.get(i).getSaldoPelanggan() - harga) + harga * 5/100 >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan((pelangganList.get(i).getSaldoPelanggan() - harga) + (harga * 5/100));
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    } else {
                                                        if (pelangganList.get(i).getSaldoPelanggan() - harga >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan(pelangganList.get(i).getSaldoPelanggan() - harga);
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    }
                                                    pelangganList.get(i).show();
                                                } else if (pelangganList.get(i).getNomerPelanggan().substring(0,2).equals("56")) {
                                                    if (harga >= 1000000){
                                                        if ((pelangganList.get(i).getSaldoPelanggan() - harga) + harga * 7/100 >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan((pelangganList.get(i).getSaldoPelanggan() - harga) + (harga * 7/100));
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    } else {
                                                        if ((pelangganList.get(i).getSaldoPelanggan() - harga) + harga * 2/100 >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan((pelangganList.get(i).getSaldoPelanggan() - harga) + + (harga * 2/100));
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    }
                                                    pelangganList.get(i).show();
                                                } else {
                                                    if (harga >= 1000000){
                                                        if ((pelangganList.get(i).getSaldoPelanggan() - harga) + harga * 10/100 >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan((pelangganList.get(i).getSaldoPelanggan() - harga) + (harga * 10/100));
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    } else {
                                                        if ((pelangganList.get(i).getSaldoPelanggan() - harga) + harga * 5/100 >= 10000){
                                                            System.out.println("Saldo Awal : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                            pelangganList.get(i).setSaldoPelanggan((pelangganList.get(i).getSaldoPelanggan() - harga) + + (harga * 5/100));
                                                            System.out.println("Transaksi berhasil, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        } else {
                                                            System.out.println("Transaksi dibatalkan, sisa saldo : \n" + pelangganList.get(i).getSaldoPelanggan());
                                                        }
                                                    }
                                                    pelangganList.get(i).show();
                                                }
                                                break;
                                            case "2":
                                                System.out.println("top up");
                                                System.out.print("Masukkan Nominal Top Up Anda : ");
                                                int uangTambahan = in.nextInt();
                                                pelangganList.get(i).setSaldoPelanggan(pelangganList.get(i).getSaldoPelanggan() + uangTambahan);
                                                pelangganList.get(i).show();
                                                break;
                                            case "3":
                                                logOut2 = true;
                                                break;
                                        }
                                    }
                                } else {
                                    System.out.println("pin salah");
                                    if (++failedCounter == 3){
                                        pelangganList.remove(i);
                                        System.out.println("Akun dihapus");
                                        logOut = true;
                                    } else {
                                        System.out.println("gagal masuk");
                                    }
                                }
                            } else if (pelangganList.get(i).getNomerPelanggan().equals(rekPelanggan) && logOut2 == true) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (indexData == -1 && logOut2 == false){
                            System.out.println("gagal menemukan rek");
                        } else if (indexData == -1 && logOut2 == true){
                            logOut2 = false;
                            break;
                        }
                    }
                    break;
                case "2" :
                    break;
            }
        }while (!pilihanMenu1.equals("2"));
    }
}
