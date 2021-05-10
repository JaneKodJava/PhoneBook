public class TwoDimensionalArray {
    public static char symbol = 'X';
    public static char space = ' ';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] arr = new char[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (j == i || i == x) {
                   arr[i][j] = symbol;
                }
                else {
                    arr[i][j] = space;
                }
            }
        }

        return arr;
    }



}
