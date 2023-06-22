package grade3.if_statements;

import java.util.Scanner;

class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1, word2, word3;
        System.out.println("Enter two decimal numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a < b) {word1 = "Smaller"; word2 = "Bigger"; word3 = "different."; }
        else if (a > b) {word1 = "Bigger"; word2 = "Smaller"; word3 = "different.";}
        else {word1 = "Equal"; word2 = "Equal"; word3 = "the same.";}

        System.out.println("a = " + a + " <- " + word1 + "\nb = " + b + " <- " + word2 + "\n-------\nNumbers are " + word3);
    } 
}