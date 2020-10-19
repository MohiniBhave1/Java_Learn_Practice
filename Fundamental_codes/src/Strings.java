public class Strings {
    public static void main(String[] args){
        String myString = "This is my string";
        System.out.println("My string :" + myString);
        myString = myString + ". This is more string !";
        System.out.println("My string :" + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("My string :" + myString);

        String numberString = "523.638";
        numberString = numberString + "258.396";
        //String appended to previous string not added
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        

    }
}
