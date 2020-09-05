https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/phone-book/problem

Solution: 

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Long> pb = new HashMap<String, Long>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            Long phone=in.nextLong();
            in.nextLine();
            pb.put(name, phone);
        }

      
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(pb.containsKey(s))
                System.out.println(s + "=" + pb.get(s));
            else
                System.out.println("Not found");
        }
    }
}



