https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-stack/problem

Solution: 


import java.util.*;
public class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s=sc.next();
            //Complete the code
            boolean flag = true;
            Stack<Character> st = new Stack<Character>();
            for(int i = 0; i < s.length(); i++){
              if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) ==']') && st.empty() == true)
                    {
                        flag = false;
                        break;
                    }
                
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                    st.push(s.charAt(i));
                else if (s.charAt(i) == ')' && st.peek() == '(')
                    st.pop();
                else if (s.charAt(i) == ']' && st.peek() == '[')
                    st.pop();
                else if (s.charAt(i) == '}' && st.peek() == '{')
                    st.pop();
                else {
                    flag = false;
                    break;
                }
            }
            if(flag == false)
                System.out.println(false);
                
            else if(st.empty())
                System.out.println(true);
            else
                System.out.println(false);
        }
        
    }
}



