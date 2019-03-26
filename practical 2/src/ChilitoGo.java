import java.util.Scanner;

public class ChilitoGo {

        public static void main (String[]args){
        final int adultMeal = 7;
        final int childMeal = 4;
        int numberAdult;
        int numberChild;
        int costAdult;
        int costChild;
        int costTotal;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of adult meal:");
        numberAdult = userInput.nextInt();
        System.out.print("Enter the number of child meal");
        numberChild = userInput.nextInt();
        costAdult = adultMeal * numberAdult;
        costChild = childMeal * numberChild;
        costTotal = costAdult + costChild;
        System.out.print(numberAdult + " adult meal cost " + costAdult + " and " + numberChild + " child meal cost " + costChild +
                " so the total money is " + costTotal);
    }

    }
