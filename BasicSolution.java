package com.interview.java.solution;

import java.util.Scanner;

public class BasicSolution {

    /*Finding the factorial in two different ways
    1. Normal Approach and
    2. Recursive Approach

    e.g. 5! = 5*4*3*2*1 = 120
         7! = 7*6*5*4*3*2*1 = 5040

    */

    //1. Normal Approach

    static int factorialNor(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

    //2. Recursive Approach

    static int factorialRec(int num){

        if(num<=1){
            return 1;
        }
        return num*factorialRec(num-1);
    }

    /* Check Year is leap year or not

    logic : if number is completely divided by 4 and not divided by 100 or completely divided by 400

     */

    static boolean leapYear(int year){

        boolean flag = false;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
            flag = true;
        }
        return flag;
    }


    //Main Function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which you want to find factorial : ");
        int num = sc.nextInt();

        //Calling Normal Function for Factorial
        int ansNor = factorialNor(num);

        //Printing Factorial using Normal Approach
        System.out.print("Factorial of "+num+" is "+ansNor);
        System.out.println();

        //Calling Recursive Function for Factorial
        int ansRec = factorialRec(num);

        //Printing Factorial using Recursive Approach
        System.out.print("Factorial of "+num+" is "+ansRec);

        //Calling Leap Year Function

        int year = sc.nextInt();
        boolean flag = leapYear(year);
        System.out.println("Given Year is Leap year or not : "+flag);
    }
}
