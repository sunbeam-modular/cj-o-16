class Program {
    public static void main(String[] args) {
        // add two given numbers
        // numbers will be passed through command line
        System.out.println("Hello World");
        System.out.println("args[0]- " + args[0]);
        System.out.println("args[1]- " + args[1]);
        int num1 = Integer.parseInt(args[0]); // unboxing
        int num2 = Integer.parseInt(args[1]); // unboxing
        System.out.println("Result - " + (num1 + num2));
    }
}
