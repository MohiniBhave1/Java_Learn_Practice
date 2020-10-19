public class CharBoolean {
    public static void main(String[] args){
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrueBool = true;
        boolean myFalseBool = false;
        System.out.println("MyTrueBool " + myTrueBool + " \nMyFalseBool" + myFalseBool);

    }
}
