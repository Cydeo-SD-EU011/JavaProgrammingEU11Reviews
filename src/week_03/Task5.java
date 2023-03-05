package week_03;

public class Task5 {

    /*
    write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
     */

    public static void main(String[] args) {

        //create a variable for given minutes

        int givenMinutes = 3456789;

        //we need to find how many years we have in that minutes

        int howManyMinutesHaveInYear = 60 * 24 * 365;
        System.out.println(givenMinutes / howManyMinutesHaveInYear);
        int years = givenMinutes / howManyMinutesHaveInYear;

        //we need to find how many days we left
        int leftMinutes = givenMinutes % howManyMinutesHaveInYear;
        System.out.println(leftMinutes);

        System.out.println(givenMinutes - 6 * howManyMinutesHaveInYear);


        int howManyMinutesWeHaveInADay = 24 * 60;
        System.out.println(leftMinutes / howManyMinutesWeHaveInADay);
        int howManyDaysWeLeft = leftMinutes / howManyMinutesWeHaveInADay;
//  3456789 minutes is approximately 6 years and 210 days
        System.out.println(givenMinutes + " minutes is approximately " + years + " years and " + howManyDaysWeLeft + " days");





    }
}
