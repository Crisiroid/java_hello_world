import javax.swing.*;

public class math {
    public static void m(){
        //a simple program to calculate the hypotenuse triangle
        double x = Double.parseDouble(JOptionPane.showInputDialog("Please enter side x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Please enter side y: "));
        double z = Math.sqrt((x*x)+(y*y));
        JOptionPane.showMessageDialog(null, "your z side is: " + z);
    }

}
