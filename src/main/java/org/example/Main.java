package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- HEALTHPLAN İŞLEMLERİ ---");
        Healthplan plan1 = new Healthplan(1,"Basic Plan",Plan.BASIC);
        Healthplan plan2 = new Healthplan(2,"Premium Plan", Plan.PREMIUM);
        System.out.println(plan1);
        System.out.println(plan2);

        System.out.println("--- EMPLOYEE İŞLEMLERİ ---");
        String [] employeeHealthPlans = new String[3];
        Employee employee = new Employee(1,"Ali Paşa Yıldırım","alipasa@mail.com","12345678",employeeHealthPlans);
        employee.addHealthPlan(0,"Axa Sigorta Basic");
        employee.addHealthPlan(1,"Allianz Premium");
        employee.addHealthPlan(2,"Acıbadem Standart");

        System.out.println(employee);

        System.out.println("--- COMPANY İŞLEMLERİ ---");
        String [] developers = new String[4];
        Company company = new Company(1,"Patient.ai",-100.0,developers);
        company.addEmployee(0,"Ali Paşa Yıldırım");
        company.addEmployee(1,"Ali Yıldırım");
        company.addEmployee(2,"Enis Gayretli");
        company.addEmployee(3,"Yıldırım Paşa");

        System.out.println(company);

    }
}