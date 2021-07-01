package verisk_interview_prepation;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;

        System.out.println(c = ++a + b++);
        System.out.println(b);

        /*
         * a=5
         * ++a=6 a=6
         * a++=5 a=6
         *
         * --a=4 a=4
         * a--=5 a=4
         *
         *
         * */

    }
}
