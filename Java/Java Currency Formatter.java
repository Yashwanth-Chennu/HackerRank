https://github.com/Yashwanth-Chennu

Problem Statement: https://www.hackerrank.com/challenges/java-currency-formatter/problem

Solution: 

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double payment = s.nextDouble();
        s.close();
        Locale ind = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(ind);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }


}