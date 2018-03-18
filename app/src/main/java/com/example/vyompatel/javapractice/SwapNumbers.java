package com.example.vyompatel.javapractice;

import java.util.Scanner;

/**
 * Created by vyompatel on 3/18/18.
 *
 * Input: take two integer inputs from user  ex: Number 1: 20 and Number 2: 20
 * 	 Output: Number 1: 20 and Number 2: 10
 *
 * 	 Step-1: Instantiate scanner class by passing System.in as parameter
 *
 * 	 Step-2: Take two inputs from user using scan.nextInt() and store them into x and y
 *
 *   Step-3: x = x + y [save total of x and y into x]
 *
 *   Step-4: y = x - y [ new value of y can be obtained by subtracting y from new total x]
 *
 *   Step-5: x = x - y [ new value of x can be obtained by subtracting new y from total x]
 *
 *   Step-6: Print results of new x and y.
 *
 *   Dry Run:
 *
 * Step   x         y
 *   1    10       20
 *   2    30(x+y)  -
 *   3    30       10(x-y)
 *   4    20(x-y)  10
 *
 *
 *
 *
 */

public class SwapNumbers {
    public static void main(String a[]){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int x = scan.nextInt();

        System.out.println("Enter number 2:");
        int y = scan.nextInt();


        x = x+y;  //x = x + y = 10 + 20 = 30

        y=x-y; //y = x - y = 30 - 20 = 10

        x=x-y;

        System.out.println("After swap:");
        System.out.println("Number 1: "+x);
        System.out.println("Number 2: "+y);
    }
}
