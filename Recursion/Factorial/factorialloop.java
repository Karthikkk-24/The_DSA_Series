public class factorialloop {
    public static void main(String[] args) {
        int i;
        int factorial = 1;
        int num = 8;
        for (i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }

}
