import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface switch_type{
    double[][] convert(int[][] intArrary);
}
class switch2square implements switch_type{
    @Override
    public  double[][] convert(int [][] intArray){
        int rows = intArray.length;
        int maxCols = 0 ;
        for (int i = 0; i < rows; i++) {
            int currentCols = intArray[i].length;
            if(currentCols > maxCols){
                maxCols =currentCols;
            }

        }
        double[][] doubleArray = new double[rows][maxCols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < maxCols; j++) {
                doubleArray [i][j] = (double)intArray[i][j]*0.5;

            }

        }

        return doubleArray;
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},
                {3,2,1},{6,5,4},{9,8,7},
                {1,1,1},{2,2,2},{3,3,3}
        };
        switch_type switchType = new switch2square();
        double[][] doubleArray = switchType.convert(intArray);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("{  ");
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "  ");
            }

            System.out.println("}");
        }
    }
}