package week_04;

public class MultiBranchIf {

    public static void main(String[] args) {
        int number=0;

        //if the number is positive print positve
        //if the number is neagtive print negative
        //else print 0

        if (number>0) { //if the number is positive
            System.out.println("positive");             ///print positve
        } else if (number<0) { //if the number is negative
            System.out.println("negaitive");  //print negative
        }else {

            System.out.println("zero");
        }


    }
}
