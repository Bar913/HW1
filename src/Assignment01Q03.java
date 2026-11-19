public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int num1 = 1;
        int num2 = 0;
        int temp;

        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(num1 + num2);
            if ((num1 + num2) % 2 == 1) {
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            temp = num1;
            num1 = num2;
            num2 = num2 + temp;
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
