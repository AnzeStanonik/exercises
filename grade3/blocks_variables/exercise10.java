package grade3.blocks_variables;

import java.util.Scanner;

class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Firstly enter the length (m), secondly enter the width (m), lastly enter the price per m²");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int pricePerSquareMeter = sc.nextInt();
        System.out.println("Length: " + length + " m\nWidth: " + width + " m\nPrice per square meter: " + pricePerSquareMeter + " units\n--------------------\nFull price of the room: " + length * width * pricePerSquareMeter + " units");
    }
}
