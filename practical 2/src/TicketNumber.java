import javax.swing.*;

public class TicketNumber {

        public static void main(String[] args){
        int tickerNumber,removeNumber,remainderNumber,lastDigit;
        boolean Valid;

        tickerNumber=Integer.parseInt( JOptionPane.showInputDialog(null,"Enter the ticket number"));
        lastDigit=tickerNumber%10;
        removeNumber=(tickerNumber-lastDigit)/10;
        remainderNumber=removeNumber%7;
        Valid= remainderNumber==lastDigit;
        JOptionPane.showMessageDialog(null,"Valid ticket: "+Valid);
    }
}
