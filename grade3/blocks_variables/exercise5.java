package grade3.blocks_variables;

import java.util.Scanner;

class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Firstly enter the price, secondy enter VAT");
        int price = sc.nextInt();
        int vat = sc.nextInt();
        int fullPrice = price + price * vat / 100;
        System.out.println("Price: " + price + " units" + "\nVAT: " + vat + "%" + "\n--------------" + "\nFull price: " + fullPrice + " units");
    }
}