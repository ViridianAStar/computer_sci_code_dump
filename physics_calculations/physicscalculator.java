import java.math.*;


public class physicscalculator{

    public static void main(String[] args){
        
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

}