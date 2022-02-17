import java.util.Scanner;

public class input {
    public static void input(){
        //creating input class
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
