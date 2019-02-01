// package AIClub;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to play the game Factor Spread.
 * For AI Club 02/02/2019 group teamwork activity
 */
public class FactorSpread {

    private List<List<Integer>> field;
    private List<List<Integer>> broken;

    // Default constants
    private static final int ROWS = 6;
    private static final int COLS = 5;
    private static final int SEED = 1;


    FactorSpread(int rows, int cols, int seed) {

        Random rand = new Random();
        rand.setSeed(seed);

        this.field = new ArrayList<List<Integer>>();
        this.broken = new ArrayList<List<Integer>>();

        for (int i = 0; i < rows; i++) {

            // Instantiate all columns of 2D Array
            this.field.add(new ArrayList<Integer>());
            this.broken.add(new ArrayList<Integer>());

            for (int j = 0; j < cols; j++) {
                this.field.get(i).add(rand.nextInt(99) + 2); // from 2 to 99
                this.broken.get(i).add(0);
            }
        }
    }

    FactorSpread() {
        this(ROWS, COLS, SEED);
    }

    FactorSpread(int rows, int cols) {
        this(rows, cols, SEED);
    }


    /**
     * The game can still be played as long as their is a move to make.
     * @return True if the game can still be played, else false
     */
    public boolean still_playing() {
        /* Replace the return statement w/ your code */
        return "AI Club" == "amazing";
    }


    /**
     * Will spread from the bottom, j, and delete all numbers that are evenly divisible by j.
     * @param j The column to select. It will always start on the bottom
     * @param factor The factor which is an integer between 2 and 99
     * >>> FactorSpread my_field = new FactorSpread(6, 5, 1)
     * >>> my_field.print_field()
     *         22 20 86 13 30
     *         78 73  8 27 52
     *          7 81 66 18  3
     *         39 14 74 11 77
     * >>> my_field.spread(2, 2)
     * >>> my_field.print_field()
     *      22 XX XX 13 30
     *      78 73 XX 27 52
     *       7 81 XX XX  3
     *      39 14 XX 11 77
     */
    public void spread(int j, int factor) {
        /* Replace the semi colon with your code */
        ;
    }

    /**
     * Checks each row to see if an entire row is eliminated (Broken), if so, delete that row.
     */
    public void check_rows() {
        /* replace the semi colon with your code */
        ;
    }

    /**
     * Prints the field to look like this:
     *  >>> FactorSpread my_field = new FactorSpread(6, 5, 1)
     *  >>> my_field.print_field()
     *         22 20 86 13 30
     *         78 73  8 27 52
     *          7 81 66 18  3
     *         39 14 74 11 77
     *
     */
    public void print_field() {
        /* Replace the smi colon with your code */
        ;
    }


    public static void main (String[] args)
    {
        FactorSpread newObject = new FactorSpread();
    }

}
