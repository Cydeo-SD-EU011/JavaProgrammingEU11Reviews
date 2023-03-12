package week_04;

public class ShortHandOperators {

    public static void main(String[] args) {
        int a=10;
        int result=a+10;

        a=a+10; //20
        System.out.println(a);
        int b=0;
         b+=10; //b=b+10

        System.out.println("b = " + b); //10

        b*=2;  //20
        System.out.println("b after multiply with 2 = " + b);

        b/=4;

        System.out.println("b after division with 4= " + b);

        b-=5;

        System.out.println("b after substriction= " + b);

        int c=10;

        System.out.println(c+=10);

    }
}
