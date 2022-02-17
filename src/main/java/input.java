import java.util.Scanner;

public class input {
    public static void input(){
        //creating input class
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your age; ");
        int age = scanner.nextInt();
        //clering scanner to avoid bugs
        scanner.nextLine();
        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name + " You have " + age + " Years old!" + "\n and your favourite food is "+ food);
    }
}
