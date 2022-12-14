import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class physicscalculator{
    private static Scanner kbR = new Scanner(System.in);
    private static int selection;
    private static String[]   operationSelection = {"Critical Velocity", "Centripetal Acceleration", "Speed Over Time 1", "Velocity using Mu", "Derivied Friction", "Coefficient of Friction", "Eq for Net Center", "Banking Angle"};
    public static void main(String[] args){
        System.out.println("What operation would you like to perform?");
        System.out.println("Critical Velocity   |   Centripetal Acceleration");
        System.out.println("Speed Over Time 1   |   Velocity Using Mu");
        System.out.println("Derivied Friction   |   Coefficient of Friction");
        System.out.println("Eq for Net Center   |   Banking Angle");
        System.out.print("Please type name of operation: ");
        String selectionChoice = kbR.nextLine();
        selection = Arrays.asList(operationSelection).indexOf(selectionChoice);
        while (selection == -1){
            System.out.println("Please check for typo.");
            System.out.println("Critical Velocity   |   Centripetal Acceleration");
            System.out.println("Speed Over Time 1   |   Velocity Using Mu");
            System.out.println("Derivied Friction   |   Coefficient of Friction");
            System.out.println("Eq for Net Center   |   Banking Angle");
            System.out.print("Please type name of operation: ");
            selectionChoice = kbR.nextLine();
            selection = Arrays.asList(operationSelection).indexOf(selectionChoice);
        }
        if (selection == 0){
            System.out.println("You have selcted Critical Velocity");
            System.out.print("Please input radius: ");
            int iO = kbR.nextInt();
            System.out.print("Please input gravity value: ");
            
        }
    }

    private static double criticalVelocity(double radius, double gravity){
        double critVelo;
        double critVelosqrd = (radius * gravity);
        critVelo = java.lang.Math.sqrt(critVelosqrd);
        return(critVelo);
    }

    private static double centripetalAcceleration(double velocitySquared, double radius){
        double centripAccel = (velocitySquared / radius);
        return centripAccel;
    }

    private static double speedoverTime1(double radius, double T){
        double velocity;
        velocity = ((2*(Math.PI))*radius)/T;
        return(velocity);
    }

    private static double velocityusingMU(double mu, double gravity, double radius){
        double velocity = Math.sqrt((mu) * (gravity * radius));
        return velocity;
    }

    private static double derivedFriction(double velocitysqrd, double mass, double radius){
        double Ff = (mass * velocitysqrd)/radius;
        return Ff;
    }

    private static double coefficientofFriction(double radius, double gravity, double velocitysqrd){
        double mu = (velocitysqrd)/(gravity * radius);
        return mu;
    }   

    private static double eefnetcenter(double ForceofG, double mass, double velocitysqrd, double radius){
        double netFsubn = ForceofG + ((mass * velocitysqrd)/radius);
        return netFsubn;
    }

    private static double bankingangle(double velocitysqrd, double radius, double gravity){
        double tannumSimple = velocitysqrd/(radius * gravity);
        return tannumSimple;
    }

}