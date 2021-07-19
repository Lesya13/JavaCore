package lesson02;

public class Main {

    public static void main(String[] args) {

        String[][] myArray = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = method(myArray);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива выше, чем заданный");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверное значение массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int method(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (myArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    count = count + Integer.parseInt(myArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}