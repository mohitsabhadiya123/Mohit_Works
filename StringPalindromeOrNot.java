public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String name = "abcda";
        int left = 0;
        int right = name.length()-1;
        while (left<right) {
            if (name.charAt(left) == name.charAt(right)){
                left++;
                right--;
            }
            else {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
