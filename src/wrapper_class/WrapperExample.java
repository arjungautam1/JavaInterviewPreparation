package wrapper_class;

//Wrapper class in Java provides the mechanism to convert primitive into object and object into primitive

public class WrapperExample {
    public static void main(String[] args) {

        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a); //Converting int into Integer explicitly
        Integer j=a;
        System.out.println(a+" "+i+" "+j);

        //Converting Integer into int
        Integer b=new Integer(3);
        int c=b.intValue();
        int d=b;
        System.out.println(b+" "+c+" "+d);

    }
}
