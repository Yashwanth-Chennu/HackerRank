https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-list/problem

Solution: 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> l = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0; i < n; i++){
            l.add(s.nextInt());
        }
       
       int query = s.nextInt();
       while(query > 0){
           String operation = s.next();
           if(operation.equals("Insert")){
               int x = s.nextInt();
               int y = s.nextInt();
               l.add(x, y);
            }
            if(operation.equals("Delete"))
                l.remove(s.nextInt());
           
           query--;
       }
       Iterator itr = l.iterator();
       while(itr.hasNext())
        System.out.print(itr.next()+ " ");
    }
}