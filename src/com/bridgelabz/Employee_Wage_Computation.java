package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    final static int full_time=1;
    final static int part_time=2;

    final static int Daily_wage_per_hour=20;
    public static void main(String[] args) {
        int emp_hr=0;
        int emp_wage=0;
        Random r= new Random();
        int current=r.nextInt(3);
        switch (current) {
            case full_time:
                System.out.println("employee is present full day");
                emp_hr=8;
                break;
            case part_time:
                System.out.println("employee is present half day");
                emp_hr=4;
                break;

            default:
                System.out.println("employee is absent");
                emp_hr=0;
                break;
        }
        emp_wage=emp_hr*Daily_wage_per_hour;
        System.out.println("total wage of employee is "+emp_wage);

    }
}
