package com.bab7;public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 2000,2,3,800.00,1,2);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 2000,2,3,16.75, 40,1,2);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 2000,2,3,10000, .06, 1,2);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan",  "234",  5000,  .04, 2000,2,3,300, 1,2);

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s : $%,.2f\n\n", salariedEmployee, "pendapatan", salariedEmployee.earnings());
        System.out.printf("%s\n%s : $%,.2f\n\n", hourlyEmployee, "pendapatan", hourlyEmployee.earnings());
        System.out.printf("%s\n%s : $%,.2f\n\n", commissionEmployee, "pendapatan", commissionEmployee.earnings());
        System.out.printf("%s\n%s : $%,.2f\n\n", basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n",employee.getBaseSalary());
            }
            System.out.println("Bonus bulan : " + Employee.getBonusBulan());
            System.out.printf("pendapatan : $%,.2f \n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }

        SalariedEmployee e1 = new SalariedEmployee("Daniel", "135", 2000,2,3,800.00, 2,10000);
        HourlyEmployee e2 = new HourlyEmployee("Karina", "234", 2000,2,3,16.75, 40, 2,10000);
        CommissionEmployee e3 = new CommissionEmployee("Keanu", "145", 2000,2,3,10000, .06, 2,10000);
        BasePlusCommissionEmployee e4 = new BasePlusCommissionEmployee("Bondan",  "234",  5000,  .04, 2000,2,3,300, 2,10000);
    }
}
