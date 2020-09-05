https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-arraylist/problem?h_r=next-challenge&h_v=zen

Solution:

import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            int size = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j < size; j++){
                Integer value = scan.nextInt();
                row.add(value);
            }
            a.add(row);
        }
        int query = scan.nextInt();
            for(int i = 0; i < query; i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                try{
                    System.out.println(a.get(x -1).get(y - 1));
                }catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
    }
} 