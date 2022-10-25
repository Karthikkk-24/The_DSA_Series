public class fibonacci {
  public static void fibonacciSeries(int firstNum, int secondNum, int n) {
    
    //base case
    if (n==0) {
      return;
    }
    
    int fibo = firstNum + secondNum;
    System.out.println(fibo);
    fibonacciSeries(secondNum, fibo, n-1); 
  }
  
  public static void main(String[] args) {
    int firstNum = 0;
    int secondNum = 1;
    System.out.println(firstNum);
    System.out.println(secondNum);
    
    int n = 7;
    fibonacciSeries(firstNum, secondNum, n-2);
  }
}
