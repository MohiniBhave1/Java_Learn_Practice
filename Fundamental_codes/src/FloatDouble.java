public class FloatDouble {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value :" + myMinFloatValue);
        System.out.println("Float Maximum Value :" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Float Minimum Value :" + myMinDoubleValue);
        System.out.println("Float Maximum Value :" + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        //float myFloatValue = (float) 5.25;
        //float myFloatValue = 5.25f;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3d;
        System.out.println("MyIntValue :" + myIntValue);
        System.out.println("MyFloatValue :" + myFloatValue);
        System.out.println("MyDoubleValue +" + myDoubleValue);

        double pounds = 45.5;
        double kilo = pounds * 0.45359237;
        System.out.println(pounds + " pounds to kilogram is = " + kilo);

    }
}
