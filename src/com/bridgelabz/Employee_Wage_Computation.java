package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    final static int check=1;
    final static int Daily_wage_per_hour=20;
    public static void main(String[] args) {
        int emp_hr=0;
        int emp_wage=0;
        Random r= new Random();
        int current=r.nextInt(2);
        if(check==current)
        {
            System.out.println("employee is present");
            emp_hr=8;

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
