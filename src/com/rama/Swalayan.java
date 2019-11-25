package com.rama;

public class Swalayan {
    private String nama;
    private String noRekening;
    private String pin;
    private int saldo;

    public Swalayan(String nama, String no, String pin, int saldo) {
        this.nama = nama;
        this.noRekening = no;
        this.pin = pin;
        this.saldo = saldo;
    }
    public String getPin(){
        return pin;
    }
    public String getNoRekening(){
        return noRekening;
    }
    public String getNama(){
        return nama;
    }

    public int cashback(int harga) {
        String no = noRekening.substring(0, 2);
        switch (no) {
            case "38":
                if (harga > 1000000) {
                    saldo = (saldo - harga) + harga * 5 / 100;
                } else {
                    saldo = saldo - harga;
                }   break;
            case "56":
                if (harga > 1000000) {
                    saldo = (saldo - harga) + harga * 7 / 100;
                } else {
                    saldo = (saldo - harga) + harga * 2 / 100;
                }   break;
            case "74":
                if (harga > 1000000) {
                    saldo = (saldo - harga) + harga * 10 / 100;
                } else {
                    saldo = (saldo - harga) + harga * 5 / 100;
                }   break;
            default:
                break;
        }
        return saldo;
    }

    public int topUp(int uang) {
        return saldo = saldo + uang;
    }

    public void info(){
        System.out.println("Nama        : " + nama);
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Saldo anda  : " + saldo);
    }
}
