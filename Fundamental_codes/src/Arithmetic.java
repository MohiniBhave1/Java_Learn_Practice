public class Arithmetic {
    public static void main(String[] args){
        int myTotal = (Integer.MIN_VALUE/2);
        byte myByteValue = (Byte.MIN_VALUE/2);
        System.out.println(myTotal);
        System.out.println(myByteValue);
        // Type cast is required as it treats it as Integer so we type cast as byte
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println(myNewByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println(myNewShortValue);
    }
}
