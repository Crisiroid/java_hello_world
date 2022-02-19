import javax.swing.*;
import java.util.Random;
public class random {
    public static void rr(){
        //random number generator
        Random ra = new Random();
        int x = ra.nextInt(300) + 1;

        JOptionPane.showMessageDialog(null, "random number is: " + x);
    }
}
