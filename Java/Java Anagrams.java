https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-anagrams/problem

Solution: 

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        if(a.length() != b.length()){
            return false;
        }else{
            
            for(int i = 0; i < a.length(); i++){
                int count = 0;
                for(int j = 0; j < a.length(); j++){
                    if(a.charAt(j) == a.charAt(i))
                        count++;
                    if(b.charAt(j) == a.charAt(i))
                        count--;
                }
                if(count != 0)
                    return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
