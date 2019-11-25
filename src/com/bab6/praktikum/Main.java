package com.bab6.praktikum;public class Main {
    public static void main(String[] args) {
        System.out.println("KELAS MANUSIA");
        Manusia m1 = new Manusia ("Mahmud","123",true,true);
        System.out.println(m1.toString()+"\n");
        Manusia m2 = new Manusia ("Ninda","213",false,true);
        System.out.println(m2.toString()+"\n");
        Manusia m3 = new Manusia ("Raisul","235",true,false);
        System.out.println(m3.toString()+"\n");

        System.out.println("KELAS MAHASISWAFILKOM");
        MahasiswaFILKOM maha1 = new MahasiswaFILKOM("145150300111100", 2.8, "Baim", "764",true, false);
        System.out.println(maha1.toString()+"\n");
        MahasiswaFILKOM maha2 = new MahasiswaFILKOM("185150200111100", 3.4, "Firli", "632",false, false);
        System.out.println(maha2.toString()+"\n");
        MahasiswaFILKOM maha3 = new MahasiswaFILKOM("165150600111100", 3.9, "Firman", "935",true, true);
        System.out.println(maha3.toString()+"\n");

        System.out.println("KELAS PEKERJA");
        Pekerja p1 = new Pekerja(1000, 2017, 2, 5, 2, "Faishal", "984", true, true);
        System.out.println(p1.toString()+"\n");
        Pekerja p2 = new Pekerja(1000, 2010, 1, 4, 0, "Sinda", "715", false, false);
        System.out.println(p2.toString()+"\n");
        Pekerja p3 = new Pekerja(1000, 1999, 11, 3, 10, "SoeWadi", "888", true, true);
        System.out.println(p3.toString()+"\n");

        System.out.println("KELAS MANAGER");
        Manager mn1 = new Manager("HRD", 7500, 2004, 3, 5, 3, "Annisa", "984", false,true);
        System.out.println(mn1.toString()+"\n");
    }
}