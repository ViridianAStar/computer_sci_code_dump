import java.util.Scanner;
import javax.swing.*;  
import java.io.*;

public class Variables {
    static JFrame f;
    static JLabel potato;
    public static int myNumber = 0;
    private static Scanner keyboardReader = new Scanner(System.in);
    public void main(String[] args){
        setjlabel();
        System.out.println("Please set myNumber: ");
        myNumber = keyboardReader.nextInt();
        System.out.println(myNumber + " This is your number.");
        System.out.println("Congratulations! You have set variable myNumber to " + myNumber + "!");
    }
    public void setjlabel(){
        InputStream in = getClass().getResourceAsStream("resources/R.jpg");
        JFrame f= new JFrame("The Irish Potato Famine");  
        ImageIcon i = new ImageIcon("i:/R.jpg");
        File imageFile = new File("resources/R.jpg");
        potato = ;
        f.add(potato);
        f.setSize(1920,1080);  
        f.setVisible(true);  
    }
}