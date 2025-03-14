package Assignments;

import java.util.Scanner;

class factorialLoops {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int n = s.nextInt();
        int value = 1;
        for ( int i = 1; i<=n; i++) {
            value *= i;
        }
        System.out.println("The factorial of the given number is "+value);
    }
}