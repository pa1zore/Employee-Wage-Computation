package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    //varibles
    public static final int full_time=1;
    public static final int part_time=2;
private final String company;
private  final int empRatePerHour;
private final int numberOfWorkingDays;
private final int maxHoursPerMonth;
 private int totalEmpWage;
//constructor for initialising values
  public  Employee_Wage_Computation(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth)
   {
       this.company=company;
       this.empRatePerHour=empRatePerHour;
       this.maxHoursPerMonth=maxHoursPerMonth;
       this.numberOfWorkingDays = numberOfWorkingDays;

   }
    public void compute() {
        //declearing and initialising varibles with 0
        int empHr=0;
        //int empWwage=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        // 20 iterations for working days in month
        // iterations goes on tatal hours is 100 && total working days is 200;
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays< numberOfWorkingDays)
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
            System.out.println("Day: "+totalWorkingDays+" Emp Hr: "+empHr);

        }
        //calculating total employees wage
         totalEmpWage=totalEmpHrs*empRatePerHour;
        // printing total wage 
      //  System.out.println("total employee wage for company :" +company+" is: " +totalEmpWage);


    }
    public String toString()
    {
        return "total employee wage for company"+company+" is "+totalEmpWage;
    }

    public static void main(String[] args) {

       Employee_Wage_Computation dmart= new Employee_Wage_Computation("dmart",20,2,10);
        Employee_Wage_Computation tata= new Employee_Wage_Computation("tata",10,4,20);
        dmart.compute();
        System.out.println(dmart);
        tata.compute();
        System.out.println(tata);

    }
}
