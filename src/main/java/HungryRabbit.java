import java.util.*;

/**
 * Created by nbalkiss on 4/21/17.
 */
public class HungryRabbit {


    public int eatCarrots(int[][] field){

        Cell startingCell = calculateStartingCell(field);

        return eat(field, startingCell, 0);
    }

    public int eat(int[][] field, Cell cur, int eatenSoFar){

        //TODO check for edge case in which middle cell (first cell) is 0

        if(cur.getCarrots()==0){
            return eatenSoFar;
        }

        eatenSoFar+=cur.getCarrots();

        return eat(field, calculateNextCell(field, cur), eatenSoFar);

    }

    private Cell calculateNextCell(int[][] field, Cell cur){
        // up
        Cell upCell = new Cell(field,cur.row-1,cur.col);
        // down
        Cell downCell = new Cell(field,cur.row+1,cur.col);
        // right
        Cell rightCell = new Cell(field,cur.row,cur.col+1);
        // left
        Cell leftCell = new Cell(field,cur.row,cur.col-1);

        List<Cell> possibleNextCell = new ArrayList<Cell>();
        possibleNextCell.add(upCell);
        possibleNextCell.add(downCell);
        possibleNextCell.add(rightCell);
        possibleNextCell.add(leftCell);
        Collections.sort(possibleNextCell);

        return possibleNextCell.get(0);
    }

    private Cell calculateStartingCell(int[][] field){

        // if odd rows x odd cols -> 1 center
        // if even rows x odd cols -> 2 center across middle two rows
        // if odd rows x even cols -> 2 center across middle two cols
        // if even rows x even cols -> 4 center across middle two rows and cols

        List<Cell> possibleStartingCells = new ArrayList<Cell>();

        // always add topLeft
        Cell topLeft = new Cell(field, field.length/2, field[0].length/2);
        possibleStartingCells.add(topLeft);

        // even rows, need to add one more below topLeft
        if(field.length%2==0){
            Cell bottomLeft = new Cell(field, field.length/2 + 1, field[0].length/2);
            possibleStartingCells.add(bottomLeft);

            //even cols, need to add two more to the right of topLeft and bottomLeft
            if(field[0].length%2==0){
                Cell topRight = new Cell(field, field.length/2, field[0].length/2 + 1);
                Cell bottomRight = new Cell(field, field.length/2 + 1, field[0].length/2 + 1);
                possibleStartingCells.add(topRight);
                possibleStartingCells.add(bottomRight);
            }
        }
        Collections.sort(possibleStartingCells);
        return possibleStartingCells.get(0);
    }


    class Cell implements Comparable {
        int row;
        int col;
        private int[][] field;

        public Cell(int[][] field, int row, int col){
            this.row=row;
            this.col=col;
            this.field=field;
        }

        public int getCarrots(){

            // if this cell is outside of the field, return negative carrots
            if(row < 0 || row >= field.length || col < 0 || col >= field[0].length){
                return -1;
            }
            return field[row][col];
        }



        // cells with more carrots are considered 'greater' and should be placed earlier in list
        public int compareTo(Object o) {
            Cell cell = (Cell) o;
            if(this.getCarrots()>cell.getCarrots()){
                return -1;
            }
            if(this.getCarrots()<cell.getCarrots()){
                return 1;
            }
            return 0;

        }
    }
}
