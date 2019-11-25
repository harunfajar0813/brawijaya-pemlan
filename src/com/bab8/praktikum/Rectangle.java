package com.bab8.praktikum;

public class Rectangle {
    private String warna;
    private int kategori;

    public Rectangle() {
    }

    public Rectangle(String warna) {
        this.warna = warna;
    }

    public void howToColor() {
        if(this.warna == null){
            System.out.println("tidak ada warna, warna bangun kotak masih polos");
        }
        else{
            System.out.println("bangun kotak sudah diwarnai dengan warna "+this.warna);
        }
    }

    public void compareTo(Object obj) {
        this.kategori = (int) obj;
        if(this.kategori == 0){
            System.out.println("ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori "+
                    this.kategori+" yaitu 2.5L" );
        }
        else{
            System.out.println("ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori "+
                    this.kategori+" yaitu 6.5L" );
        }
    }
}
