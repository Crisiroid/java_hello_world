import javax.swing.JOptionPane;
public class gui_masic {
    public static void gui_basic(){
        //using JOptionPane library to use GUi
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        //using integer.parseInt to convert to integer
        int age =Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
        JOptionPane.showMessageDialog(null, "Your name is "+ name + " and you have " + age +" years old");
        //using JOption to get height
        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Your name is "+ name + " and you have " + age +" years old" + " and your height is " + height + " cm");
    }
}
