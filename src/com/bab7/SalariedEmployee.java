package com.bab7;

public class SalariedEmployee extends Employee{
    private double weeklySalary; //gaji/minggu
    public  SalariedEmployee(String  name,  String  noKTP,  int tahun, int bulan, int tanggal, double salary, int produksiBarang, int hargaProduksiBarang) {
        super(name, noKTP, tahun, bulan, tanggal,produksiBarang, hargaProduksiBarang);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary() + getBonusBulan()+ getBonusProduksiBarang();
    }
    public String toString() {
        return String.format("Salaried employee : " + super.toString() + "\nweekly salary : " + getWeeklySalary());
    }
}
