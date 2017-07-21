/**
 * Created by nbalkiss on 6/8/17.
 * Works on NxN matrices
 */
public class RotateMatrix {

    public static int[][] rotate(int[][]M){
        int top = 0;
        int left = 0;
        int right = M[0].length-1;
        int bottom = M.length-1;



        while(true){

            int startTop = top;
            int startLeft = left;

            int temp = M[top][left];

            if(top>bottom){
                break;
            }

            // rotate across the top

            for(int i=left;i<=right;i++){
                int current = M[top][i];
                M[top][i]=temp;
                temp=current;
            }

            top++;

            if(right<left){
                break;
            }

            // rotate down right side

            for(int i=top;i<=bottom;i++){
                int current = M[i][right];
                M[i][right] = temp;
                temp = current;
            }

            right--;

            if(bottom<top){
                break;
            }

            // rotate along bottom

            for(int i=right;i>=left;i--){
                int current = M[bottom][i];
                M[bottom][i] = temp;
                temp = current;
            }

            bottom--;

            if(left>right){
                break;
            }

            // rotate up left

            for(int i=bottom;i>=top;i--){
                int current = M[i][left];
                M[i][left] = temp;
                temp = current;
            }

            left++;

            M[startTop][startLeft] = temp;
        }

        return M;
    }

    public static void printMatrix(int[][] M){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j] + " \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] M = {
                {1, 2, 3, 4,  5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,30},
                {21,22,23,24,25}
        };
        RotateMatrix.printMatrix(M);
        RotateMatrix.rotate(M);
        RotateMatrix.printMatrix(M);
    }
}
