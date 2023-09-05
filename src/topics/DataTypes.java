package topics;

public class DataTypes {
    /*
        Data Types are divided into two group -

        Primitive - byte,short,int,long,float,double,boolean and char
        Non-Primitive - String, Arrays and Classes

        if we change the type of data to bigger capacity type then is know as conversion.
        if we change the type of data to smaller capacity type then is know as type casting.
    */
    //This is instance variables
    public boolean isUsed;

    /*
        byte (1 byte)
        short (2 bytes)
        int (4 bytes)
        long (8 bytes)
    */
    public byte createTrue(){
        //This is a variable declaration
        //This is a local variable
        byte testOne;

        //This is a variable initialization
        testOne = 1;
        return testOne;
    }

    /*
        float (4 bytes)
        double (8 bytes)
    */
    public float createInt(){
        float testTwo = 100;
        testTwo = testTwo/50;
        return testTwo;
    }

    /*
        char (2 bytes)
    */
    public char myLetter(){
        return 'm';
    }

    /*
        boolean (1 byte)
    */
    public boolean bool(){
        return false;
    }
}
