package week_03;

public class Task3 {
    /*
    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

     */

    public static void main(String[] args) {

        //get the number inside the variable

        int number = 561;

        //get the digit in ones
        int firstDigit = number % 10;

        //get the digit in tens
       // System.out.println(number / 10 % 10); //6
        int secondDigit = number / 10 % 10;


        //get the digit from hundreds
        int thirdDigit = number / 100;

        //find the sum of digits

        System.out.println(firstDigit+secondDigit+thirdDigit);


    }


}
