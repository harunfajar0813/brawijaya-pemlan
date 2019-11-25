package com.bab8.perusahaan;import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> database = new ArrayList<Employee>();
        Invoice i1 = new Invoice("Minyak", 5, 10000);
        Invoice i2 = new Invoice("Beras", 10, 130000);
        Employee e1 = new Employee(123, "Harun", 15000000, new Invoice[]{i1,i2});
        database.add(e1);
        for (Employee i : database){
            i.show();
        }
    }
}
