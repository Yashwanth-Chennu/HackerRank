https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-negative-subarray/problem

Solution: 

import java.io.*;
import java.util.*;


public  class Solution {
    public static boolean negArr(int arr[], int l, int u){
        if(l > u)
            return false;
        int sum = 0;
        for(int i = l; i <= u; i++)
            sum += arr[i];
        if(sum >= 0)
            return false;
        else
            return true;
        
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int count = 0, k = 0;
        while(k < n){
            for(int i = k; i < n; i++){
                if(negArr(arr, k, i))
                        count++;
            }
            k++;
        }
        System.out.println(count);

    }
}

