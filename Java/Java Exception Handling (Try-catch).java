https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 