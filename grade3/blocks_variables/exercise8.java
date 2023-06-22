package grade3.blocks_variables;

import java.util.Scanner;

class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Firstly enter years of work, secondy enter the number of kids");
        int years = sc.nextInt();
        int kids = sc.nextInt();
        int pay = 400 + years * 20 + kids * 30;  
        System.out.println("Full pay of the employee: " + pay + " units\n-----------\nBase pay: 400 units\nAddition for years: " + years * 20 + " units for " + years + " years of employment\nKids: " + kids * 30 + " units for " + kids + " kids");
    }
}