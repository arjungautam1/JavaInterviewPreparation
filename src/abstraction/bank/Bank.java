package abstraction.bank;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 8:45 AM
 */

public abstract class Bank {
    abstract int getRateOfInterest();
}

class NMB extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class NIC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new NMB();
        System.out.println("Rate of interest of NMB:" + b.getRateOfInterest()+ " Percent");
        b = new NIC();
        System.out.println("Rate of interest of NIC:"+ b.getRateOfInterest() + " Percent");


    }
}
