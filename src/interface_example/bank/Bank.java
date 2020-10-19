package interface_example.bank;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 7:32 PM
 */

public interface Bank {
    float rateOfInterest();
}

class NMB implements Bank {
    public float rateOfInterest() {
        return 9;
    }
}

class NIC implements Bank {
    public float rateOfInterest() {
        return 7;
    }
}

class TestInterface {
    public static void main(String[] args) {
//        Bank b;
//                b=new NMB();
//        System.out.println(b.rateOfInterest());
//                b=new NIC();
//        System.out.println(b.rateOfInterest());
        System.out.println(new NMB().rateOfInterest());
        System.out.println(new NIC().rateOfInterest());

    }
}
