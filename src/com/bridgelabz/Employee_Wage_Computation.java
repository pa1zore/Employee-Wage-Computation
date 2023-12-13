package com.bridgelabz;

import java.util.Random;

class CompanyEmpWage {
    //declearing  varibles to store value of employee
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;
    //constructor to initialised varibles of companyEmpWage class
    //this pointer is used to point current object

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
//methods to store value of totalEmpWage
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    //toString is override method of String class which is used to print information of objects
    @Override
    public String toString()
    {
        return "Total Emp Wage for Company: "+company+" is: "+totalEmpWage;
    }
}

public class Employee_Wage_Computation {
    // same through out program
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    // number of company can be added
    private int numOfCompany =  0;
    // declearing array to store value of different comapany
    private CompanyEmpWage[] companyEmpWageArray;

    public Employee_Wage_Computation() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    //sending parameters to companyEmpWage constructor
    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
                maxHoursPerMonth);
        numOfCompany++;
    }
//to print all company employee wage
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage computeEmpWage) {
        // variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // computation
        while (totalEmpHrs <= computeEmpWage.maxHoursPerMonth && totalWorkingDays < computeEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            Random r = new Random();
            int flip = r.nextInt(3);
            switch (flip) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs+=empHrs;
            System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
        }

        return totalEmpHrs * computeEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        //creating object of EmpWageBuilderArray and sending argument to constructor
        Employee_Wage_Computation empWageBuilder = new Employee_Wage_Computation();

        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Relience", 10, 4, 20);
        empWageBuilder.computeEmpWage();


    }

}
