public class palindromeloop {
    public static void main(String[] args) {
        String str = "madam";
        String str_reverse = "";

        for (int i = (str.length() - 1); i >= 0; --i) {
            str_reverse += str.charAt(i);
        }

        if (str.equals(str_reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
