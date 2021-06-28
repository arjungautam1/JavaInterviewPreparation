package verisk_interview_prepation;

public class ReverString {
    public static void main(String[] args) {
        String name="Arjun";
        int length=name.length()-1;

        System.out.print("Reversed String is :");
        for(int i=length;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }

    }
}
