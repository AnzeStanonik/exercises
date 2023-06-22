package grade3.blocks_variables;

import java.util.Scanner;

class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two whole numbers");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        //Use the character map to find: ², use the math class methods to always get a positive substraction
        System.out.println("a = " + a + ", a² = " + a * a + "\nb = " + b + ", b² = " + b * b + "\n----------\nSubtraction: " + Math.max(a * a, b * b) + " - " + Math.min(a * a, b * b) + " = " + Math.abs(a * a - b * b));
    }
}