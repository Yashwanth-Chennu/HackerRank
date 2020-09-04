https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-string-tokens/problem

Solution: 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String word = "";
        List <String> l = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                word += s.charAt(i);
  
            else if(word != ""){
              l.add(word);
            
                word = "";
            }
        }
        if(word != "")
            l.add(word);
      System.out.println(l.size());
        Iterator<String> itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        scan.close();
    }
}



