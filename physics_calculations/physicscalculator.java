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

}