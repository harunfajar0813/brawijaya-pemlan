package com.bab7;

public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    public CommissionEmployee(String name, String noKTP, int tahun, int bulan, int tanggal , double sales, double rate, int produksiBarang, int hargaProduksiBarang){
        super(name, noKTP, tahun, bulan, tanggal, produksiBarang, hargaProduksiBarang);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate()*getGrossSales() + getBonusBulan() + getBonusBulan() + getBonusProduksiBarang();
    }
    public String toString(){
        return String.format("Commision employee : " + super.toString() + "\ngross sales : " + getGrossSales() + "\ncommission rate " + getCommissionRate());
    }
}
