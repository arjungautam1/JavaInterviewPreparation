package palindrome;

public class GFG {

    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;

        while (i<j){
            if(str.charAt(i)!=str.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="madam";
        if(isPalindrome(str))
            System.out.println(str+" is palindrome.");
        else
            System.out.println(str+" is not palindrome.");
    }
}
