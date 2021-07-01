package verisk_interview_prepation;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hi");

        stringList.stream()
                .map(s -> "There")
                .forEach(System.out::print);
    }
}
