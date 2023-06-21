package grade3.blocks_variables;

import java.util.Scanner;

class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Hello " + username + " :)");
    }
}