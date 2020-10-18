package aggregation.address_example;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 6:42 PM
 */

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Kathmandu", "Bagmati", "Nepal");
        Address address2 = new Address("Butwal ", "Lumbini", "Nepal");

        Emp emp = new Emp(1, "Arjun", address1);
        Emp emp1 = new Emp(2, "Pooja", address2);

        emp.display();
        System.out.println("\n");
        emp1.display();

    }
}
