import java.util.Scanner;

public class QuartsToGallonsinteraction {

        public static void main (String[] args) {
        int numberQuart;
        final int quartinGallon = 4;
        int reminderQuart;
        int numberGallons;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of quarts needed for painting job:");
        numberQuart = userInput.nextInt();
        numberGallons = numberQuart / quartinGallon;
        reminderQuart = numberQuart - quartinGallon * numberGallons;
        System.out.println("A job that needs" + numberQuart + " quarts requires " + numberGallons + " gallons plus " +
                reminderQuart + " quarts");
    }
    }
