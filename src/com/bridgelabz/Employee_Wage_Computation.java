package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    final static int full_time=1;
    final static int part_time=2;
    final static int Num_of_working_day=20;
    final static int Daily_wage_per_hour=20;
    final static int Max_hrs_in_month=100;
    public static void main(String[] args) {
        //variables
        int empHr=0;
        //int empWwage=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        // 20 iterations for working days in month
        while(totalEmpHrs<=Max_hrs_in_month && totalWorkingDays< Num_of_working_day)
        {
            totalWorkingDays++;
            Random r= new Random();
            int current=r.nextInt(3);
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

            System.out.println("Day#: "+totalWorkingDays+"Emp Hr: "+empHr);

        }
        int totalEmpWage=totalEmpHrs*Daily_wage_per_hour;
        System.out.println("total employee wage :" + totalEmpWage);
    }
}
