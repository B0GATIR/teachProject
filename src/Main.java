import java.util.*;


public class Main {

    static public int[][] getMatrix(){
        int[][] matrix = new int[4][4];
        Random rnd = new Random();


        for (int i = 0; i < 4; i++){
            matrix[i][0] = 1;
            for (int j = 1; j < 4; j++){
                matrix[i][j] = rnd.nextInt(2);
            }
        }

        return matrix;
    }

    //LeetCode
    static public int[] getWeakestRows(int[][] mat, int k){
        int[] resoultArray = new int[k];

        for (int i = 0; i < mat.length; i++){
            for (int j = 1; j < mat[i].length; j++){
                mat[i][0] += mat[i][j];
            }
            mat[i][1] = i;
        }

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length - 1; j++){
                if (mat[j][0] > mat[j + 1][0]){
                    int[] mem = mat[j];
                    mat[j] = mat[j + 1];
                    mat[j + 1] = mem;
                }
            }
        }

        int c = 0;
        for (int i = 0; i < mat.length && c < resoultArray.length; i++){
            resoultArray[c] = mat[i][1];
            c++;
        }

        return resoultArray;
    }
    public static void main(String[] args) {
        int[][] matrix = getMatrix();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        int[] resoultArray = getWeakestRows(matrix, 4);

        for (int i = 0; i < resoultArray.length; i++){
            System.out.print(resoultArray[i] + " ");
        }
    }
}