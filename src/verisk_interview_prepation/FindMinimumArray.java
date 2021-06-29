package verisk_interview_prepation;

public class FindMinimumArray {

    public static void main(String[] args) {

        int array[] = new int[]{3, 4, 1, 2, 4, 5, 6};

        int min = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value is :" + min);
    }
}
