https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-string-compare/problem

Solution:

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String arr[] = new String[s.length() + 1 - k];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.substring(i, i + k);
        }
        String smallest = arr[0];
        String largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(smallest) < 0)
                smallest = arr[i];
            if(arr[i].compareTo(largest) > 0)
                largest = arr[i];
        }
    
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
} 