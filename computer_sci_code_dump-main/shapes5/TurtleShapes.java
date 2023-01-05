import java.util.Scanner;

public class TurtleShapes {
    private static Scanner kbR = new Scanner(System.in);
    private static Turtle bob = new Turtle();
    public static int sL;
    public static boolean exit;
    public static boolean bonk;
    public static int deterministc = 0;

    public static void main(String[] args) {

        starBurst(20, 60);
               
    }

    public static void bananas(){
        System.out.println("Please input initial sidelength: ");
        sL = kbR.nextInt();
        System.out.println("Please input number of squares: ");
        int sN = kbR.nextInt();
        nestedSquares(sN);

        System.out.println("Please input a side length: ");
        sL = kbR.nextInt();
        triangle(sL);   

        
        System.out.println("Please input a side length");
        sL = kbR.nextInt();
        rectangle(sL);

        System.out.println("Please input a radius");
        sL = kbR.nextInt();
        circle(sL);

        System.out.println("Please input a side length: ");
        sL = kbR.nextInt();
        bob.right(180);
        triangle(sL);
        triforce();

        System.out.println("Please input a side length: ");
        sL = kbR.nextInt();
        System.out.println("Please input an iteration count: ");
        int iter = kbR.nextInt();

        spiral(sL, iter);

    }

    /**
     * Draws a square at the current position of a specified side length.
     *
     * @param sideLength the length of the square to be drawn.
     */
    public static void square(int sideLength) {
        for (int i=1; i<5; i++) {    // Repeat the following block of code 4 times
            bob.forward(sideLength); // Move bob forward by the specified side length
            bob.right(90);     // Rotate bob 90 degrees clockwise
        }
        bonk = false;
    }

    /**
     * Draws 3 squares within one another of different colors.
     */
    public static void nestedSquares(int sN) {
       int multi = 0;
       for (int i=1; i<(sN + 1); i++){
        bob.down();
        square(sL + multi);
        multi = multi + 20;
        bob.up();
        bob.left(135);
        bob.forward(sL/2);
        bob.right(135);
       }
       bonk = false;
    }

    /**
     * Draws an equilateral triangle at the current position of a specified length.
     *
     * @param sideLength the side length of the triangle to be drawn.
     */
    public static void triangle(int sideLength) {
        bob.down();
       for (int i = 1; i < 4; i++){
        bob.forward(sideLength);
        bob.right(120);
       }
       bob.up();
       bonk = false;
    }

    /**
     * Draws a triforce at the current position.
     */
    public static void triforce() {
        bob.up();
        bob.forward(sL / 2);
        int bOpp = sL / 2;
        bob.right(60);
        bob.down();
        for (int i = 0; i < 4; i++){
            bob.forward(bOpp);
            bob.right(120);
        }
        bob.up();
        bonk = false;
    }

    /**
     * Draws a rectangle with a specified length and width.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle.
     */
    public static void rectangle(int red) {
       for (int i = 1; i < 3; i++){
        bob.down();
        bob.forward(red);
        bob.right(90);
        bob.forward(red * 2);
        bob.right(90);
       }
       bonk = false;
    }

    /**
     * Draws a circle at the current position of a specified length.
     *
     * @param radius the radius of the circle to be drawn.
     */
    public static void circle(int r) {
        bob.up();
        bob.left(90);
        bob.forward(r);
        bob.right(90);
        for (int i = 1; i < 361; i++){
            bob.down();
            bob.forward((2 * 3.1415926) * r);
            bob.right(1);
            bob.up();
        }
        bonk = false;
    }

    /**
     * Draws a spiral at the current position.
     */
    public static void spiral(int isL, int iters) {
        int tR = 1;
        bob.speed(100.0);
       for (int i = 0; i <= iters; i++){
            bob.forward(isL);
            bob.left(tR);
            isL = isL + (isL/4);
            tR = tR + 1;
            if (tR >= 360){
                bob.forward(isL);
                bob.right(tR);
                isL = isL + (isL/4);
                tR = tR + 1;
            }
       }
    }

    /**
     * Draws an 8 by 8 checkerboard at the current position.
     */
    public static void checkerBoard() {
        square(256);
        for (int i = 1; i <= 7; i++)
        {
            bob.forward(32);
            bob.right(90);
            bob.forward(256);
            bob.backward(256);
            bob.left(90);
        }  
        bob.forward(32);
        bob.right(90);
        for (int i = 1; i <= 7; i++)
        {
            bob.forward(32);
            bob.right(90);
            bob.forward(256);
            bob.backward(256);
            bob.left(90);
        }  
    }

    /**
     * Draws a 5-point star
     */
    public static void star(int lineLength) {

        for (int i = 0; i<5; i++){
            bob.forward(lineLength);
            bob.right(140);
        }
    }

    /**
     * Draw a radially symmetric star burst with the given number of lines and radius.
     *
     * @param numLines the number of lines emanating from the center.
     * @param radius   the length of each line.
     */
    public static void starBurst(int numLines, int radius) {
        int numofSides = numLines/ 2;
        if (2 % numLines == 1){
            numofSides = (numLines / 2) + 1;
        }
        int intAngle = ((numofSides - 2) * 180)/numofSides;
        for (int i = 0; i <= numLines; i++)
        {
            bob.forward(radius);
            bob.backward(radius);
            bob.left(intAngle);
        }
    }

    /**
     * Draws a spiral of shapes.
     *
     * @param sizeIncrease how much to increase the size of the shape by each iteration.
     * @param angleToTurn       how many degrees the turtle should turn after each iteration.
     */
    public static void shapeSpiral(double sizeIncrease, double angleToTurn) {
        // This is one of the tasks from section B. You only need to complete one of these tasks.
    }

    /**
     * Sends the turtle on random walk, drawing its path.
     *
     * @param yourParameter add one parameter of your choice. Rename it and describe what it does here.
     */
    public static void randomWalk() { // Add a parameter to this method!
        // This is one of the tasks from section B. You only need to complete one of these tasks.
    }

    /**
     * Plays a short animation by drawing each frame using the turtle.
     */
    public static void animation() {
        // This is one of the tasks from section B. You only need to complete one of these tasks.
    }
}
