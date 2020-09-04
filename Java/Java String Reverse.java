https://github.com/Yashwanth-Chennu

Problem Statement:
https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen

Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = true;
        int len = A.length();
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i < len/2; i++){
            if(A.charAt(i) != A.charAt(len - i - 1))
                flag = false;
                break;
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}



 