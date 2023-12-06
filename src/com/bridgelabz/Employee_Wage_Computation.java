package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    final static int full_time=1;
    final static int part_time=2;
    final static int Num_of_working_day=20;
    final static int Daily_wage_per_hour=20;
    public static void main(String[] args) {
        //variables
        int empHr=0;
        int empWwage=0;
        int totalEmpWage=0;
        // 20 iterations for working days in month
        for(int day = 0;day<Num_of_working_day;day++)
        {
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
            empWwage=empHr*Daily_wage_per_hour;
            totalEmpWage+=empWwage;
            System.out.println("wage of employee is "+empWwage);

        }
        System.out.println("total employee wage :" + totalEmpWage);
    }
}
