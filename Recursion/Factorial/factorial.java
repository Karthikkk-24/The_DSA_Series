public class factorial {
    public static int factorialOfNum(int num) {
        //base case
        if (num == 1) {
            return 1;
        } else {
            return (num * factorialOfNum(num - 1));
        }
    }

    public static void main(String[] args) {
        int num = 8;
        int factorial = factorialOfNum(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
