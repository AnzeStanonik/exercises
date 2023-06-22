
package grade3.if_statements;

import java.util.Scanner;

class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Enter a whole number");
        int a = sc.nextInt();
        a = Math.abs(a); //if(a < 0) a *= -1;

        if (a < 10) word = "single";
        else if (a < 100) word = "double";
        else if (a < 1000) word = "triple";
        else if (a < 10000) word = "quadruple";
        else if (a < 100000) word = "quintuple";
        else if (a < 1000000) word = "sextuple";
        else word = "mluti";

        System.out.println("Entered: " + a + "\nThe number is a " + word + " digit.");
    } 
}