package grade3.new_to_java;

class exercise4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = a;

        System.out.println("Before change: number 1: " + a + ", number 2: " + b);
        a = b;
        b = c;
        System.out.println("After change: number 1: " + a + ", number2: " + b);
    }
}