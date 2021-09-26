package com.interview.java.solution;
import java.util.Scanner;

public class BitManipulation {

    /*
        Convert a number from Binary to Decimal
       e.g. number is 22 so binary number will be 01101

       2 |22 |0     ^
       2 |11 |1     |
       2 |5  |1     |
       2 |2  |0     |
       2 |1  |1     |

       In most right side write number one by one from bottom to up

     */

    static void binaryConversion(int num){
        int count = 0;
        int temp[] = new int[32];

        while (num>0){
            temp[count] = num % 2;
            num = num/2;
            count++;
        }

        for(int i=0;i<count;i++){
            System.out.print(temp[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to convert : ");
        int num = sc.nextInt();
        System.out.println("Your Binary Number After Conversion is : ");
        binaryConversion(num);
    }
}
