package Assignments;

import java.util.Scanner;

class factorialRecursion {
    int recursion(int n){
        if(n==0)
            return 1;
        if(n<0)
            return -1;
        return n*recursion(n-1);
    }
    public static void main(String args[]){
        factorialRecursion obj = new factorialRecursion();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for factorial:");
        int n = s.nextInt();
        int value = obj.recursion(n);
        System.out.println("The factorial of "+n+" is "+value);
    }
}