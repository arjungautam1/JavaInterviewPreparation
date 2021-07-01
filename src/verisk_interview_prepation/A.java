package verisk_interview_prepation;

//Amazing interview question about inheritance
public class A {
    public A() {
        System.out.println("A is created");
    }
}

class B extends A {
    public B() {
        System.out.println("B is created");
    }
}

class MainClass {
    public static void main(String[] args) {
        B b = new B();
    }

}

