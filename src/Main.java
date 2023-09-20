interface Mapping {
    double[][] transform (int[][] intArray);
}



class Map implements Mapping {
    @Override
    public double[][] transform(int[][] intArray) {
        double[][] doubleArray = new double[intArray.length][];
        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = new double[intArray[i].length];
            for (int j = 0; j < intArray[i].length; j++) {
                doubleArray[i][j] = intArray[i][j] * 0.5;
            }
        }
        return doubleArray;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {4, 5},
                {3, 2, 1}, {6, 5, 4}, {9, 8, 7},
                {1, 1, 1}, {2, 2}, {3, 3, 3}};

        Mapping map = new Map();

        double[][] doubleArray = map.transform(intArray);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("{  ");
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println(" }");
        }
    }
}
