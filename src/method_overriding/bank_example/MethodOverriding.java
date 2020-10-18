package method_overriding.bank_example;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 7:35 PM
 */

public class MethodOverriding {
    public static void main(String[] args) {
        NMB nmb=new NMB();
        NIC nic=new NIC();
        Nabil nabil=new Nabil();

        System.out.println("Rate of interest of NMB :"+nmb.getRateOfInterest());
        System.out.println("Rate of interest of nic :"+nic.getRateOfInterest());
        System.out.println("Rate of interest of Nabil:"+ nabil.getRateOfInterest());
    }
}
