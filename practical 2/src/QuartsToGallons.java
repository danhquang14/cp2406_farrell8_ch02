public class QuartsToGallons {
    public static void main(String[] args){
        int numberQuart=18;
        final int quartinGallon=4;
        int reminderQuart;
        int numberGallons;

        numberGallons=numberQuart/quartinGallon;
        reminderQuart=numberQuart-quartinGallon*numberGallons;
        System.out.println("A job that needs " +numberQuart+ " quarts requires "+ numberGallons+ " gallons plus "+
                reminderQuart+ " quarts"  );
    }
}