package com.example.vyompatel.javapractice;

import java.util.Scanner;

/**
 * Created by vyompatel on 3/18/18.
 *  *   Algorithm:
 *
 *   Input: Take number of rows as n from user eg: 4 Consider: num = 1
 *   Output: 1
 *           2 3
 *           4 5 6
 *           7 8 9 10
 *
 *   Step-1: Initialize integers n, num = 1, c and d
 *
 *   Step-2: Initialize Scanner class by passing System.in as parameter
 *
 *   Step-3: save user input into n using n = scan.nextInt()
 *
 *   Step-4: In a for loop for row r and increment r till r<=n
 *
 *   Step-5: In a nested for loop for column c and increment c till c<=r
 *
 *   Step-6: print num and num++
 *
 *   Step-7: add a new line in for loop for r
 *
 *   Dry Run:
 *
 *    n  step   r   c    num
 *    4    1	1   1    1
 *    4    2    2   2    2 3
 *    4    3    3   3    4 5 6
 *    4    4    4   4    7 8 9 10
 *
 */

public class FloydsExample {


    public static void main(String[] args) {
        int n;
        int num = 1, r, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        n = scan.nextInt();
        System.out.println("Floyd's triangle");

        for(r=1;r<= n;r++) {
            for(c=1;c<=r;c++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
