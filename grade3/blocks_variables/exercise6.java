package grade3.blocks_variables;

import java.util.Scanner;

class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Firstly enter the basic price, secondy enter VAT");
        int fullPrice = sc.nextInt();
        int vat = sc.nextInt();
        int basicPrice = fullPrice * 100 / (100 + vat);
        System.out.println("Full price: " + fullPrice + " units" + "\nVAT: " + vat + "%" + "\n--------------" + "\nBasic price: " + basicPrice + " units");
    }
}