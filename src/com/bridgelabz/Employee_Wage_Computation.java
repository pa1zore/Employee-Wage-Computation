package com.bridgelabz;

import java.util.Random;

public class Employee_Wage_Computation {
    final static int check=1;
    public static void main(String[] args) {
        System.out.println("Welcom to Employee Wage Computation");
        Random r= new Random();
        int current=r.nextInt(2);
        if(check==current)
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
