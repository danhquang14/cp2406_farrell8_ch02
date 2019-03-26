import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        int minutes;
        double hours;
        double days;

        Scanner useInput=new Scanner(System.in);
        System.out.print("Enter the number of minutes you want to convert:");
        minutes=useInput.nextInt();
        hours=minutes/60.0;
        days=minutes/1440.0;
        System.out.printf(minutes+"minutes equals " +hours +" hours and equals %.3f days ",days);
    }
}
