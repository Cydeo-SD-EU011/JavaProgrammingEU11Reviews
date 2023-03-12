package week_04;

public class DifSingleAndOrDoubleAndOr {

    public static void main(String[] args) {
        int a=10;
                       //F    T
        boolean value=(4>5)&(a+5==10);  //false
        System.out.println("value = " + value);
        System.out.println(a);

/*
if you are using && ( double and &&) operators if the first one is F we wil not look at the second one
 */
        int b=10;      // T  |  T
        boolean valueOr=(4>3)|(--b==9);

        System.out.println("valueOr = " + valueOr);
        System.out.println("b = " + b);


    }
}
