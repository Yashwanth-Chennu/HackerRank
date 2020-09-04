https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-datatypes/problem

Solution: 
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while(test > 0){
            try{
                long number = s.nextLong();
                System.out.println(number + " can be fitted in:");
                if(number >= -Math.pow(2, 7) && number <= Math.pow(2, 7) - 1)
                    System.out.println("* byte");
                if(number >= -Math.pow(2, 15) && number <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if(number >= -Math.pow(2, 31) && number <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if(number >= -Math.pow(2, 63) && number <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
                
            }catch(Exception e){
                System.out.println(s.next() + " can't be fitted anywhere.");
            }



            test--;
        }
    }
}
