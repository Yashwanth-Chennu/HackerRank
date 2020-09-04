https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while(test > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int sum = a;
            for(int i = 0; i < n; i++){
                sum += b*(Math.pow(2, i));
                System.out.print((int)sum +" ");
            }
            test--;
            System.out.println();

        }
    }
}