https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/java-end-of-file/problem

Solution: 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int lineCount = 1;
        while(s.hasNext()){
            System.out.println(lineCount++ + " " + s.nextLine());
        }
    }
}