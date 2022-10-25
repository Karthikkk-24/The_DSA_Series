public class fibonacciloop {
  public static void main(String[] args) {
    int firstNum = 0;
    int secondNum = 1;
    int count = 7;
    int fibo;
    
    System.out.println(firstNum);
    System.out.println(secondNum);
    
    for (int i = 2; i < count; ++i) {
      fibo = firstNum + secondNum;
      System.out.println(fibo);
      firstNum = secondNum;
      secondNum = fibo;
    }
  }
}
