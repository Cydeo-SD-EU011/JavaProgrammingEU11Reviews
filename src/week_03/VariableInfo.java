package week_03;

public class VariableInfo {

    public static void main(String[] args) {

        //1 Primitive

        // -- numerical primitives
        //double
        //dataType variableName=variableValue
        double pi = 3.14;
        double num = 10;
        //float
        float floatVar = 12.5f;
        float floatVar2 = (float) 14.5; // explicit casting
        //long
        long l = 111_111_111_110L;
        //int
        int i = 12;

        //short
        short s = 2;
        //byte
        byte b = 127; // -128 127

        //char
        char ch = '½';
        char ch1 = 'd';
        char ch2 = '2';
        //boolean

        boolean bool = true;
        boolean boo1l = false;

        //2 Non-Primitive

        String str = "Adam";

        //===================================
        //implicit vs explicit

        double dd = 10;
        long ll = 10;
        int ii = 10;
        short ss = 10;

        //implicit casting
        dd=ss;  //we are able to put smaller to bigger directly it is done by compiler

        ll=ii;

        //explicit casting

        ii=(int)dd; // if we want to put bigger to smaller we have to do aht action as a developer






    }
}
