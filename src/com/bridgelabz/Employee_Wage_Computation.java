package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    //varibles
    final static int full_time=1;
    final static int part_time=2;

   //creating  method to calculate total wage of employee
    public static int compute(String company,int empRatePerHour,int numberOfWorkingHours,int maxHoursPerMonth) {
        //declearing and initialising varibles with 0
        int empHr=0;
        //int empWwage=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        // 20 iterations for working days in month
        // iterations goes on tatal hours is 100 && total working days is 200;
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays< numberOfWorkingHours)
        {
            totalWorkingDays++;
            //creating object of random class
            Random r= new Random();
            int current=r.nextInt(3);
            //by random varibles calculating hours of employee
            switch (current) {
                case full_time:
                    System.out.println("employee is present full day");
                    empHr=8;
                    break;
                case part_time:
                    System.out.println("employee is present half day");
                    empHr=4;
                    break;

                default:
                    System.out.println("employee is absent");
                    empHr=0;
                    break;
            }
            totalEmpHrs+=empHr;


            //printing total working days on console with hours
            System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHr);

        }
        //calculating total employees wage
        int totalEmpWage=totalEmpHrs*empRatePerHour;
        // printing total wage 
        System.out.println("total employee wage for company :" +company+" is: " +totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {

        compute("relience",20,2 ,10);
        compute("tata",22,4 ,20);
    }
}
