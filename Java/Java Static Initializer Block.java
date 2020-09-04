https://github.com/Yashwanth-Chennu

Problem Statement:

Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B, H;
static boolean flag = true;
static{
    
    
    try{
        Scanner s = new Scanner(System.in);
    B = s.nextInt();
    H = s.nextInt();
    if(B <= 0 || H <= 0) throw new Exception("Breadth and height must be positive");
    }
    catch(Exception e){
        flag = false;
        System.out.println(e);
    }
}




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

 