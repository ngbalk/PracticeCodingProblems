import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class SpiralPrint {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int remainingRows = scanner.nextInt();
        int remainingColumns = scanner.nextInt();

        int[][] myGrid = new int[remainingRows][remainingColumns];

        for(int i=0;i<remainingRows;i++){
            for(int j=0;j<remainingColumns;j++){
                myGrid[i][j] = scanner.nextInt();
            }
        }


        int startingRowIndex = 0;
        int startingColumnIndex = 0;

        while (startingRowIndex < remainingRows && startingColumnIndex < remainingColumns)
        {

        /* Print top row */
            for (int i = startingColumnIndex; i < remainingColumns; ++i)
            {
                System.out.print(myGrid[startingRowIndex][i] + " ");
            }
            // move down the starting row
            startingRowIndex++;

        /* Print end column */
            for (int i = startingRowIndex; i < remainingRows; ++i)
            {
                System.out.print(myGrid[i][remainingColumns-1] + " ");
            }
            // target column one to the left
            remainingColumns--;

        /* Print bottom row */
            // check to see if there are still any rows left to print
            if ( startingRowIndex < remainingRows)
            {
                for (int i = remainingColumns-1; i >= startingColumnIndex; --i)
                {
                    System.out.print(myGrid[remainingRows-1][i] + " ");
                }
                // move up the last row to print next
                remainingRows--;
            }

        /* Print left column */
            if (startingColumnIndex < remainingColumns)
            {
                for (int i = remainingRows-1; i >= startingRowIndex; --i)
                {
                    System.out.print(myGrid[i][startingColumnIndex]+ " ");
                }
                // move over the first column to print next
                startingColumnIndex++;
            }
        }
    }

}
