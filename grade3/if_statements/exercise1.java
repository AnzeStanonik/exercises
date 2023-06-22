package grade3.if_statements;

import java.util.Scanner;

class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        
        System.out.println("Enter a whole number");
        int a = sc.nextInt();

        if (Math.abs(a) < 10)  word = "single";
        else word = "multi";

        System.out.println("Entered: " + a + "\nThe number is a " + word + " digit.");
    } 
}