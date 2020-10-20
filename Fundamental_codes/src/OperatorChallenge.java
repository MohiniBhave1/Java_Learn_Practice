public class OperatorChallenge {
    public static void main(String[] args){
        double a = 20.00;
        double b = 80.00;
        double result1 = (a + b) * 100;
        System.out.println("(20+80)*100=" + result1);
        double remainder = result1 % 40.00;
        System.out.println(result1 + "%40.00=" + remainder);
        boolean bool = remainder == 0 ? true : false;
        if(bool){
            System.out.println("Remainder == 0");
        }else {
            System.out.println("Got some remainder !");
        }

    }
}
