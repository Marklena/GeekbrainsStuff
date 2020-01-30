package ru.geekbrains.lesson_a;
//ru.geekbrains.Homework1

import com.sun.tools.corba.se.idl.StructEntry;

public class HomeWork1 {
    public static void main(String[] args) {
        float p = GetExpression(4,5,7,3);
        System.out.println(p);
        CheckNumber(15,6);
        CheckSign (56);
        SayHi("George");
    }

    public static float GetExpression(int a, int b, int c, int d) {
        float a1 = (float) a;
        float b1 = (float) b;
        float c1 = (float) c;
        float d1 = (float) d;

        if(d1==0){
            System.out.println("Нельзя делить на ноль.");
            return 0;
        }else {
            float Result = a1 * (b1 + (c1 / d1));
            return Result;
        }

    }

    public static boolean CheckNumber(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("Your result is between 10 and 20.");
            return true;
        } else {
            System.out.println("Your number is NOT between 10 and 20.");
            return false;
        }
    }

    public static String CheckSign(int num){
        if(num>=0){
            System.out.println("Number is positive.");
            return "positive";
        } else{
            System.out.println("Number is negative.");
            return "negative";
        }
    }

    public static void SayHi(String name){
        System.out.println("Hello, "+name+"!");
    }



}


