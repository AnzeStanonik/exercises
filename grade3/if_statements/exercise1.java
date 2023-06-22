package grade3.if_statements;

import java.util.Scanner;

class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a whole number");
        int a = sc.nextInt();

        if (Math.abs(a) < 10) {
            System.out.println("Entered: " + a + "\nThe number is a single digit.");
        }else {
            System.out.println("Entered: " + a + "\nThe number is a multi digit.");
        }
    } 
}