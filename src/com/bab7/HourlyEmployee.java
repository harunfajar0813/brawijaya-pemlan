package com.bab7;

public class HourlyEmployee extends Employee {
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu
    public HourlyEmployee(String name, String noKTP, int tahun, int bulan, int tanggal, double hourlyWage, double hoursWorked, int produksiBarang, int hargaProduksiBarang) {
        super(name, noKTP, tahun, bulan, tanggal, produksiBarang, hargaProduksiBarang);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }
    public double getWage(){
        return wage;
    }
    public void setHours(double hoursWorked){
        hours = hoursWorked;
    }
    public double getHours(){
        return hours;
    }
    public double earnings(){
        if(getHours()<=40)return getWage() * getHours() + getBonusBulan() + getBonusProduksiBarang();
        else return 40 * getWage() + (getHours()-40) * getWage() * 1.5 + getBonusBulan() + getBonusProduksiBarang();
    }
    public String toString(){
        return String.format("Hourly employee : " + super.toString() + "\nhourly wage " + getWage() + "\nhours worked : " +  getHours());
    }
}
