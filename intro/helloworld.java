import java.util.Scanner;

public class helloworld {
    private static Scanner keyboardReader = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("What is your name?");
        String yourName = keyboardReader.nextLine();
        System.out.print("Hello " + yourName + "!");
    }
}