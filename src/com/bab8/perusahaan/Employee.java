package com.bab8.perusahaan;public class Employee implements Payable {
    private int regitrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;
    private double totalInvoicesPrice;

    public Employee(int regitrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.regitrationNumber = regitrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
        for (int i = 0; i < invoices.length; i++){
            totalInvoicesPrice += invoices[i].getPayableAmount();
        }
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - totalInvoicesPrice;
    }

    public void show() {
        if (invoices.length > 0){
            System.out.println("Regitration Number : " + regitrationNumber +
                    "\nName : " + name +
                    "\nSalary Per Month : Rp. " + salaryPerMonth +
                    "\nTotal Invoices Price : Rp. " + totalInvoicesPrice +
                    "\nDetail Invoice : ");
            for (int i = 0; i < invoices.length; i++){
                System.out.println((i+1) + ") " + invoices[i].toString());
            }
            System.out.printf("\nFinal Salary : Rp. %.1f",getPayableAmount());
        } else {
            System.out.println("Regitration Number : " + regitrationNumber +
                    "\nName : " + name +
                    "\nSalary Per Month : Rp. " + salaryPerMonth +
                    "\nTotal Invoices Price : Rp. " + totalInvoicesPrice +
                    "\nFinal Salary : Rp. 0");
        }
    }
}
