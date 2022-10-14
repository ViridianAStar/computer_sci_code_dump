import java.util.Scanner;
/**
 * <h1>Ticatac<\h1>
 * The Tictac class implements a two-player game of Tic-tac-toe using
 * the turtle class to draw the game.
 * You will need to complete the code as indicated below. The file
 * Turtle.java must be located in the same directory as Tictac.java.
 */
public class TicTacToe {

    /*
    * These variables will keep track of the board state. If you are familiar with 
    * arrays and would like to replace these variables with an array, you may do so.
    * Use 0 to represent an empty square, 1 to represent an X and 2 to represent an O.
    */
    public static int[][] boardSquares = {
    {0, 0, 0},
    {0, 0, 0},
    {0, 0, 0}
    };
    public static int whoFirst = 0;
    //I feel like an Array would introduce complexity.... HOWEVER I like array's.

    // The Scanner is for reading in input from the keyboard
    private static Scanner keyboardReader = new Scanner(System.in);

    // Bob the Turtle will be used to draw 
    private static Turtle bob = new Turtle();

    /*
    * When you run the command 'java Tictac' the method named "main" is executed.
    * Hence, the code that starts your game should be located here.
    * The method starts by calling by reading some input from the user 
    * and then calling drawBoard(). You will need to replace the code here and in
    * the drawBoard() method.
    */ 

    public static void main(String[] args) {
        drawBoard();
        whoisgoingFirst();
        userPlay();
        drawO(); 
    }

    public static void whoisgoingFirst(){
        System.out.print("Who is going first 1 for you 0 for machine: ");
        whoFirst = keyboardReader.nextInt();
    }

    public static void askforPlay(){
        System.out.print("Please input desired square as a value of 1-9: "); //ask end user for desired square as a value of 1-9
        int userSquare = keyboardReader.nextInt(); //takes integer input
        System.out.println("Selected Square: " + userSquare + " is this your desired Square? Type 1 for yes and 0 for no."); //tells the user what they entered
        int yoRn = keyboardReader.nextInt();
        if (yoRn == 0){
        System.out.print("Please input desired square as a value of 1-9: "); //ask end user for desired square as a value of 1-9
        int squareSquare = keyboardReader.nextInt(); //takes integer input
        System.out.println("Playing square " + squareSquare);
        } 
        if (yoRn == 1) {
            System.out.println("Playing square " + userSquare);
            bob.up();
            bob.setPosition(userSquare / 3, userSquare % 3);
            drawXorO();
        }
     
    }

    private static void userPlay(){
        //This is the first thing I have ever written in Java. I am not joking.
        if(whoFirst == 1){
            askforPlay();
        } 
        if (whoFirst == 0){

        }
    }

    /** 
    * This function should draw a blank Tic-tac-toe board. Currently, it definitely does
    * not do that, but it does do something kind of cool. Take a look by compiling and 
    * running this code so you can get an idea of how it works. Then, delete the code 
    * and write some code that draws a board.
    */

    private static void drawSquare(){
        for (int i = 1; i < 5; i++) {
            bob.forward(150);
            bob.left(90);
        }
    }

    private static void drawBoard() {
        for (int i = 1; i < 2; i++){
            bob.setPosition(0, 0);
            drawSquare();
            bob.right(90);
            drawSquare();
            bob.forward(150);
            drawSquare();
            bob.right(90);
            drawSquare();
            bob.right(90);
            drawSquare();
            bob.forward(150);
            drawSquare();
            bob.forward(150);
            bob.left(90);
            bob.forward(150);
            drawSquare();
            bob.left(90);
            bob.forward(150);
            bob.right(90);
            drawSquare();
            bob.left(90);
            bob.forward(150);
            bob.right(90);
            drawSquare();

        }
    }

    /**
    * This function should draw an X or an O at the point specified by the x and y 
    * coordinates.
    *
    * @param markToDraw represents which mark to draw: use a value of 1 to represent an
    * X and a value of 2 to represent an O.
    * @param xCoord     the x-coordinate specifying the center of the X or O.
    * @param yCoord     the y-coordinate specifying the center of the X or O.
    */
    private static void drawXorO() {
        if (whoFirst == 1){
                drawX();
            } else {
                drawO();
            }
    }

    /** 
    * This function should draw an O centered at the specified point. 
    *
    * @param x_coord the x-coordinate specifying the center of the O.
    * @param y_coord the y-coordinate specifying the center of the O.
    */
    private static void drawO() {
        bob.up();
        bob.face(0, 0);
        bob.forward(5);
        bob.down();
        for (int i = 1; i < 360; i++){
            bob.forward(1);
            bob.left(1);
        }
    }
    private static void drawX() {

    }
    /**
     * This function allows a player to play through a turn. It should ask the player
     * where they would like to place their mark and allow the player to enter a number
     * 0 through 8, with 0 representing the left square, 1 the top middle, 2 the top
     * right, 3 the left square of the middle row, and so on. 
     * 
     * If the square is available, the appropriate X or O should be drawn there. If the 
     * selected square is already occupied, prompt the player to select a different 
     * square. 
     * 
     * @param markToDraw represents which mark to draw: use a value of 1 to represent an
     * X and a value of 2 to represent an O.
     */
    private void playTurn(int markToDraw) {
        // TODO: write this method!
    }

    /**
     * This method checks if there are lines of 3 Xs or lines of 3 Os based on the 
     * argument to the method.
     * 
     * @param markToFind represents which mark to search for 3 in a row of. If its values
     * is 1, look for Xs. If its value is 0, look for Os.
     * 
     * @return If there are 3 Xs/Os in a line somewhere on the board return true.
     *         Otherwise, return false.
     */
    private boolean find3InARow(int markToFind) {
        // TODO: write this method!
        return false;
    }

    /**
     * This function determines if the game is over, either by one player getting three
     * of their marks in a row, or by the board being filled.
     * 
     * @return If the game has not ended, return 0
     *         If player 1 (Xs) has won, return 1
     *         If player 2 (Os) has won, return 2
     *         If the game ends in a draw, return -1.
     */
    private int isGameOver() {
        // TODO: write this method!
        return 0;
    }
}
