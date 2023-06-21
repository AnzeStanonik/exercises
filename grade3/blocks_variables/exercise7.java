package grade3.blocks_variables;

import java.util.Scanner;

class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Firstly enter time (h), secondy enter the distance (km)");
        double t = sc.nextDouble();
        int s = sc.nextInt();
        int v = (int) (s / t); //If you dont use (int) (...), you get: error: incompatible types: possible lossy conversion from double to int
        System.out.println("Distance: " + s + " km\nTime: " + t + " h\n ----------\nAverage speed: " + v + " km/h");
    }
}