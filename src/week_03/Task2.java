package week_03;

public class Task2 {


    /*
       Create a program that will define two double variables.
       Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
        ...
     */

    public static void main(String[] args) {

        //create first variable
        int num1=20;

        //create second variable
        int num2=5;
        //5 + 2 = 7
        //do the action
      //  int res=num1+num2;
        System.out.println(num1+"+"+num2 + " = " + (num1+num2));
        System.out.println(num1+"/"+num2 + " = " + (num1/num2));
        System.out.println(num1+"*"+num2 + " = " + (num1*num2));
        System.out.println(num1+"-"+num2 + " = " + (num1-num2));
        System.out.println(num1+"%"+num2 + " = " + (num1%num2));




    }
}
