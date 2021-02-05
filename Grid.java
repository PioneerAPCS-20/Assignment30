/**
 * This class represents a 6x6 grid of integers
 * which holds "hourglasses" as shown below.
 * 
 * EXAMPLE
 * 
 * 1 3 2 1 1 1
 * 2 3 3 -4 5 5
 * 3 -2 11 12 3 3
 * 2 2 1 1 2 2 
 * 1 1 2 1 1 11 
 * 2 3 22 21 1 1 1
 * 
 * There are 16 hourglasses that follow the pattern below:
 * 
 * a b c
 *   d
 * e f g
 * 
 * So few from above (top left and bottom left) include:
 * 
 * 1 3 2
 *   3
 * 3 -2 11
 * 
 * 2 2 1
 *   1
 * 2 3 22
 *
 * @author 
 * @version 
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Grid
{
    private int[][] grid;
    private final int NUM_ROWS = 6;
    private final int NUM_COLS = 6;
    
    /**
     * @param fileName - name of file to be read
     */
    public Grid(String fileName)
    {
        /* DO NOT EDIT THIS CONSTRUCTOR */

        grid = new int[NUM_ROWS][NUM_COLS];
        readFile(fileName);
    }
    
    /**
     * @return value of largest hourglass (sum) in grid
     */
    public int largestHourglass()
    {
        // add your implementation
        
        
        
    }
    
    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * Populates grid with values from text file
     *
     * @param fileName - name of file to be read
     */ 
    private void readFile(String fileName)
    {   
        int r = 0;
        int c = 0;
        Scanner inFile = null;
        
        try
        {
            inFile = new Scanner(new File(fileName));
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return;
        }
        
        while(inFile.hasNext())  // stop parsing file when there are no more values
        {
            grid[r][c++] = inFile.nextInt();  // populate our 2D array with integers from file
            
            if(c > NUM_COLS - 1)
            {
                r++;
                c = 0;
            }
        }
    }
}
