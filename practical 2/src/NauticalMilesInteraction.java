import javax.swing.*;

public class NauticalMilesInteraction {
    public static void main(String[] args){
        double kilometers,miles,nauticalMiles;


        kilometers=Double.parseDouble( JOptionPane.showInputDialog(null,"Enter number of kilometers:"));
        miles= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter number of miless:"));
        nauticalMiles=kilometers*0.539956803;
        JOptionPane.showMessageDialog(null,kilometers+" kilometers = "+nauticalMiles+" nautical miles");
        nauticalMiles=miles*0.868976242;
        JOptionPane.showMessageDialog(null,miles+" miles = "+nauticalMiles+" nautical miles");

    }
}
