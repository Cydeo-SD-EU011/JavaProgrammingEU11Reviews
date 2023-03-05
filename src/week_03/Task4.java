package week_03;

public class Task4 {
    /*
    - Write a Java program to convert temperature from Fahrenheit to Celsius degree
		- Input a degree in Fahrenheit: 212

							Formula : 		C = (5(F-32))/9

		- Expected Output:
							212.0 degree Fahrenheit is equal to 100.0 in Celsius


     */

    public static void main(String[] args) {

        //get the value inside the variable
        double fah=212;

        //write the formula and calculate
        double cel=(5*(fah-32))/9;

      //  System.out.println(30.0/5);

        //and print the result

        System.out.println(cel);






    }
}
