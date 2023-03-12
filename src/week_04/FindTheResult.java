package week_04;

public class FindTheResult {
    /*
    Task 6: Create a class which is "FindTheResult" create a variable
        int a=15;
             if a is divisable by 3 add 20
             if a is divisable by 5 add 25
             if a is divisable by 15 add 50


             input: a=15
             output: 65
     */
    public static void main(String[] args) {
        int a = 5;
       //if (a%15==0)  //also we can use that condition
        if (a%5==0 && a%3==0) {// we are checking the number is divisible by 15
        a+=50;
        } else if (a%5==0) {
            a+=25;
        } else if (a%3==0) {
            a+=20;
        }
        System.out.println("a = " + a);


/*

//this is not correct
        if (a%3==0) {// we are checking the number is divisible by 15
            a+=20;
        } else if (a%5==0) {
            a+=25;
        } else if (a%3==0 & a%5==0 ) {
            a+=50;
        }


        System.out.println("a = " + a);

 */
    }
}
