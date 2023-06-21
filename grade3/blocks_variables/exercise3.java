package grade3.blocks_variables;

import java.util.Scanner;

class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two decimal numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a + b;
        System.out.println("Number 1: " + a + "\nNumber 2: " + b + "\nSum: " + c);
    }
}