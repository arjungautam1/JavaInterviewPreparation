package verisk_interview_prepation;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> abstractList=new LinkedList<>();
        abstractList.add("Ram");
        abstractList.add("Hari");
        abstractList.add("Pooja");
        abstractList.add("Arjun");
        Iterator<String> iterator=abstractList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
