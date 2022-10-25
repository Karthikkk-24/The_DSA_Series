public class palindrome {
    static boolean inRecursion(String str, int start, int end){
        if(start == end){
            return true;
        }

        if((str.charAt(start)) != (str.charAt(end))){
            return false;
        }

        if(start < end + 1){
            return inRecursion(str, start + 1, end - 1);
        }

        return true;
    }

    static boolean isPalindrome(String str) {
        if(str.length() == 0){
            return true;
        }
        return inRecursion(str, 0, str.length() - 1);
    }

    public static void main(String args[]) {
        String str = "madam";

        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }

}
