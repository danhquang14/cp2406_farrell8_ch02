import java.util.Scanner;

public class InchesToFeetInteraction {
    public static void main(String[] args)

    {
        int feet;
        int inche;
        Scanner userinput= new Scanner(System.in);
        System.out.println("Enter the number of inches: ");
        inche= userinput.nextInt();
        feet = inche / 12;
        int reminderinches = inche % 12;
        System.out.println(inche + " inches = " + feet + " feet and " + reminderinches + " inches");
    }
}
