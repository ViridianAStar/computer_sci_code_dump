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
    public static int userSquare = 0;
    public static int xfPos = (-225);
    public static int yfPos = (75);
    public static int xsPos = (-75);
    public static int ysPos = (-75);
    public static int xtPos  = (75);
    public static int ytPos = (-225);
    public static int win = 0;
    public static int gameOver = 0;
    public static int userhasPlayed = 0;

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
        while (gameOver == 0){
            if (whoFirst == 1){
                userPlay();
                aiPlay();
                isGameOver();
            }
            if (whoFirst == 0){
                aiPlay();
                userPlay();
                isGameOver();
            }
        }
    }

    public static void whoisgoingFirst(){
        System.out.print("Who is going first 1 for you 0 for machine: ");
        whoFirst = keyboardReader.nextInt();
    }

    public static void userPlay(){
        System.out.print("Please input desired square as a value of 1-9: "); //ask end user for desired square as a value of 1-9
        userSquare = keyboardReader.nextInt(); //takes integer input
            System.out.println("Playing square " + userSquare);
            bob.up();
            squareCalcuser();
            boardSquares[(userSquare - 1) / 3][(userSquare - 1) % 3] = 1;
            userhasPlayed = 1;
    }

    public static void squareCalcuser(){
       if (userSquare == 1){
        bob.setPosition(xfPos, yfPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 2){
        bob.setPosition(xsPos, yfPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 3){
        bob.setPosition(xtPos, yfPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 4){
        bob.setPosition(xfPos, ysPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.forward(50);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 5){
        bob.setPosition(xsPos, ysPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 6){
        bob.setPosition(xtPos, ysPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 7){
        bob.setPosition(xfPos, ytPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 8){
        bob.setPosition(xsPos, ytPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }
       if (userSquare == 9){
        bob.setPosition(xtPos, ytPos);
        if (whoFirst == 1){
            bob.down();
            drawX();
        }
        if (whoFirst == 0){
            bob.right(90);
            bob.forward(50);
            bob.left(90);
            bob.down();
            drawO();
        }
       }

    }
    private static void aiPlay(){
     if (whoFirst == 1) {

     }
     if (whoFirst == 0) {
        bob.up();
        bob.setPosition(xfPos, yfPos);
        bob.down();
        drawX();
        if (userhasPlayed == 1){
            playTurn();
            userhasPlayed = 0;
        }
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

    /** 
    * This function should draw an O centered at the specified point. 
    *
    * @param x_coord the x-coordinate specifying the center of the O.
    * @param y_coord the y-coordinate specifying the center of the O.
    */
    private static void drawO() {
        bob.down();
        for (int i = 1; i < 360; i++){
            bob.forward(1);
            bob.left(1);
        }
        bob.up();
    }
    private static void drawX() {
        bob.setDirection(270);
        bob.right(45);
        bob.forward(50);
        bob.backward(100);
        bob.forward(50);
        bob.left(90);
        bob.forward(50);
        bob.backward(100);
        bob.right(45);
        bob.up();
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
    private static void playTurn() {
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
    private static void find3InARow() {
        if (boardSquares[0][0] == 1){
            if (boardSquares[0][1] == 1){
                if (boardSquares[0][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[1][0] == 1){
            if (boardSquares[1][1] == 1){
                if (boardSquares[1][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[2][0] == 1){
            if (boardSquares[2][1] == 1){
                if (boardSquares[2][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 1){
            if (boardSquares[1][1] == 1){
                if (boardSquares[2][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][2] == 1){
            if (boardSquares[1][1] == 1){
                if (boardSquares[2][0] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 1){
            if (boardSquares[1][1] == 1){
                if (boardSquares[2][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 1){
            if (boardSquares[1][0] == 1){
                if (boardSquares[2][0] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][1] == 1){
            if (boardSquares[1][1] == 1){
                if (boardSquares[2][1] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][2] == 1){
            if (boardSquares[1][2] == 1){
                if (boardSquares[2][2] == 1) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 2){
            if (boardSquares[0][1] == 2){
                if (boardSquares[0][2] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[1][0] == 2){
            if (boardSquares[1][1] == 2){
                if (boardSquares[1][2] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[2][0] == 2){
            if (boardSquares[2][1] == 2){
                if (boardSquares[2][2] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 2){
            if (boardSquares[1][1] == 2){
                if (boardSquares[2][2] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][2] == 2){
            if (boardSquares[1][1] == 2){
                if (boardSquares[2][0] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 2){
            if (boardSquares[1][1] == 2){
                if (boardSquares[2][2] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][0] == 2){
            if (boardSquares[1][0] == 2){
                if (boardSquares[2][0] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][1] == 2){
            if (boardSquares[1][1] == 2){
                if (boardSquares[2][1] == 2) {
                    win = 1;
                }
            }
        }
        if (boardSquares[0][2] == 2){
            if (boardSquares[1][2] == 2){
                if (boardSquares[2][2] == 2) {
                    win = 1;
                }
            }
        }
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
    private static void isGameOver() {
        find3InARow();
        if (win == 1){
            System.out.print("User Wins!");
            gameOver = 1;
        } else {
            gameOver = 0;
        }
        if (win == 2){
            System.out.print("Computer Wins!");
            gameOver = 1;
        } else {
            gameOver = 0;
        }
    }
}
