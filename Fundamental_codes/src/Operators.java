public class Operators {

    public static void main(String[] args){

        int result = 1 + 2; //value evaluated and saved
        // = : assignment operator ; + : addition operators
        System.out.println("1 + 2 = " + result);
        int prevResult = result;
        System.out.println("Previous Result = " + prevResult);
        result -= 1;
        System.out.println("Result - 1 = " + result);

        result *= 10;
        System.out.println("2 * 10 = " + result);

        result /= 5;
        System.out.println("20 / 5 = " + result);

        result %= 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

    }
}
