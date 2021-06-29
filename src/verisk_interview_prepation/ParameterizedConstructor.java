package verisk_interview_prepation;
//Demonstration of Parametrized constructor
public class ParameterizedConstructor {
    int x;
    public ParameterizedConstructor(int y){
        x=y;

    }

    public static void main(String[] args) {
        ParameterizedConstructor obj=new ParameterizedConstructor(5);
        System.out.println(obj.x);
    }
}
