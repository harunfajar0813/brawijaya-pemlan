package com.bab7;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;//gaji pokok tiap minggu
    public BasePlusCommissionEmployee(String   name,   String noKTP, double sales, double rate, int tahun, int bulan, int tanggal, double salary, int produksiBarang, int hargaProduksiBarang) {
        super(name, noKTP, tahun, bulan, tanggal, sales, rate, produksiBarang, hargaProduksiBarang);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings() + getBonusBulan() + getBonusProduksiBarang()  ;
    }
    public String toString() {
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary() + getBonusBulan());
    }
}
