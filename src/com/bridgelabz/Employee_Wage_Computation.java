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
        if(full_time==current)
        {
            System.out.println("employee is present full day");
            emp_hr=8;

        }
        else if(part_time==current)
        {
            System.out.println("employee is present part time");
            emp_hr=4;
        }
        else
        {
            System.out.println("employee is absent");
            emp_hr=0;
        }
        emp_wage=emp_hr*Daily_wage_per_hour;
        System.out.println("total wage of employee is "+emp_wage);

    }
}
