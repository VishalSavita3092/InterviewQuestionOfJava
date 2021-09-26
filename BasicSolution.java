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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which you want to find factorial : ");
        int num = sc.nextInt();
        int ansNor = factorialNor(num);
        System.out.print("Factorial of "+num+" is "+ansNor);
        System.out.println();
        int ansRec = factorialRec(num);
        System.out.print("Factorial of "+num+" is "+ansRec);
    }
}
