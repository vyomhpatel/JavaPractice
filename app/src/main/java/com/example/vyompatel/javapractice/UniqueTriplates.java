package com.example.vyompatel.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vyompatel on 3/18/18.
 *
 *    Algorithm:
 *
 *    Input: arr[] = {-1, 0, 1, 2, -1, -4}
 *    Output: -1  0  1
 *            -1 -1  2
 *
 *    Step-1: create a list of triplates which contains triplate with 3 integers
 *
 *    Step-2: Check if array.length is less than 3 if so return result
 *
 *    Step-3: Otherwise sort the array in ascending order
 *
 *    Step-4: loop through length of the array using i= 0 and increment till i< num.length
 *    			check if num[i]>0 if so then break
 *    Step-5: loop through length of the array using j = i + 1 and increment till j < num.length
 *    			check if num[i] + num[j] > 0 && num[j] > 0 if so then break
 *    Step-6: loop through length of the array using k = j + 1 and increment till k < num.length
 *    			check if num[i] + num[j] + num[j] = 0 if so then create a array list of integer
 *                    add num[i], num[j] and num[k] into list and add list to triplates list
 *
 *    Step-7: in for loop for k do k++ while k<num.length and num[k] = num[k+1]
 *    		  in for loop for j do j++ while j<num.length and num[j] = num[j+1]
 *    		  in for loop for i do i++ while k<num.length and num[i] = num[i+1]
 *
 *    Step-8: return list of triplates
 *
 *
 * 		Dry Run: arr[]= { -1, 0, 1, 2, -1, -4}
 *               Sorted arr[] = { -4, -1, -1, 0, 1, 2}
 *
 *               no   i   j   k   curr
 *               1	  0   1   2
 *               2    1   2   3
 *               3    2   3   4   -1  0  1
 *               4    3   4   5
 *               5    4   5   0
 *               6    5   0   1   -1 -1  2
 *
 *
 *
 */


public class UniqueTriplates {
    public static List<List<Integer>> sumZero(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(num.length<3)
        {
            return res;
        }

        Arrays.sort(num);

        for(int i=0;i<num.length;i++)
        {
            if(num[i]>0)
                break;

            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]>0 && num[j]>0)
                    break;

                for(int k=j+1;k<num.length;k++)
                {

                    if(num[i]+num[j]+num[k]==0)
                    {
                        List<Integer> curr=new ArrayList<Integer>();
                        curr.add(num[i]);
                        curr.add(num[j]);
                        curr.add(num[k]);
                        res.add(curr);
                    }
                    while(k+1<num.length && num[k]==num[k+1])
                        k++;
                }
                while(j+1<num.length && num[j]==num[j+1])
                    j++;
            }
            while(i+1<num.length && num[i]==num[i+1])
                i++;
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplates = UniqueTriplates.sumZero(arr);
        for(List<Integer> list: triplates) {
            for(Integer i: list) {
                System.out.print(i.intValue()+" ");
            }
            System.out.println();
        }


    }
}
