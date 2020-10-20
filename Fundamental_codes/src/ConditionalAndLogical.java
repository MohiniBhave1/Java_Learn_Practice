public class ConditionalAndLogical {
    public static void main(String[] args){
        boolean isAlien = true ;
        if(!isAlien){
            System.out.println("It is not an alien !!");
        }else {
            System.out.println("RUN!! It is an alien !!");
        }

        int topScore = 80;
        if(topScore >= 100){
            System.out.println("You have got the highest score !!🤩");
        }else{
            System.out.println("You don't have high score. Try again!😥");
        }

        // Logical AND operator
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score but less than 100!!");
        }

        // Logical OR operator
        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the conditions are true !");
        }

        // Logical NOT operator
        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not a CAR!");
        }

        // Ternary operator
        boolean wasNotCar = isCar ? false : true;
        if(wasNotCar){
            System.out.println("wasNotCar is true!");
        }

    }
}
