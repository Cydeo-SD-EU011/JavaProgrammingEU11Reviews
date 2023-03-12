package week_04;

public class LogicalOperators {

    public static void main(String[] args) {

        // & - | - !

        /*

        first bool   operator    second bool       result

          T             &            T                T
          T             &            F                F
          F             &            F                F
          F             &            T                F


         */

        System.out.println((5<6)&(6==6)); //True
        System.out.println((5<6)&(6!=6)); //False


        /*
         first bool   operator    second bool       result

          T             |            T                T
          T             |            F                T
          F             |            F                F
          F             |            T                T


         */
        System.out.println((3==5)|(3<=10));  //True
        boolean value=5<9; //True

        System.out.println("value = " + value);  //True

        System.out.println("!value = " + !value); //False


    }
}
