package com.VarArgs;

public class Example2 {

    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        
        System.out.println("Sum: " + sum(1, 2));           
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));  
        System.out.println("Sum: " + sum());               
    }
}
