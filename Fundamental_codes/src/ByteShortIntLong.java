public class ByteShortIntLong {
    public static void main(String[] args){
        //int myValue = 10_000; //same as 10000
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value : "+myMinIntValue);
        System.out.println("Integer maximum value : "+myMaxIntValue);
        System.out.println("Busted MAX value : " + (myMaxIntValue+1));
        System.out.println("Busted MIN value :" + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value :" + myMinByteValue);
        System.out.println("Byte Maximum value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value :" + myMinShortValue);
        System.out.println("Short Maximum value " + myMaxShortValue);

        //long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value :" + myMinLongValue);
        System.out.println("Long Maximum value " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647_342L;
        System.out.println("Big Long Literal Value :" + bigLongLiteralValue);


    }
}
