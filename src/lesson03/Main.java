package lesson03;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sortAllFruits();
        taskTwo();
        taskThree();
    }

    public static void sortAllFruits() {

        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};
        try {
            swapTwoElementsInArray(iArray, 0, 2);
            swapTwoElementsInArray(dArray, 0, 2);
            swapTwoElementsInArray(sArray, 0, 2);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Sort result in integer array: " + Arrays.toString(iArray));
        System.out.println("Sort result in double array: " + Arrays.toString(dArray));
        System.out.println("Sort result in string array: " + Arrays.toString(sArray));
    }

    public static void taskTwo() {
        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] sArray = {"one", "two", "three", "four", "five"};
        arrayToArrayList(iArray);
        arrayToArrayList(dArray);
        arrayToArrayList(sArray);
        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(dArray));
        System.out.println(Arrays.toString(sArray));
    }

    public static void taskThree() {
        Box<Apple> boxWithApples = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> firstBoxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> secondBoxWithOranges = new Box<>();
        System.out.println("Weight of box with apples " + boxWithApples.getWeight());
        System.out.println("Weight of box with oranges " + firstBoxWithOranges.getWeight());
        System.out.println(boxWithApples.compare(firstBoxWithOranges));
    }

    private static void swapTwoNumbersInArray(int[] array, int firstNumberPosition, int secondNumberPosition) throws WrongPositionException {
        if (firstNumberPosition < 0 || firstNumberPosition > array.length ||
                secondNumberPosition < 0 || secondNumberPosition > array.length || firstNumberPosition == secondNumberPosition) {
            throw new WrongPositionException("The positions of the elements to be replaced are indicated incorrectly");
        }
        array[firstNumberPosition] ^= array[secondNumberPosition];
        array[secondNumberPosition] ^= array[firstNumberPosition];
        array[firstNumberPosition] ^= array[secondNumberPosition];
    }

    private static void swapTwoElementsInArray(Object[] array, int firstNumPosition, int secondNumPosition) throws WrongPositionException {
        if (firstNumPosition < 0 || firstNumPosition > array.length ||
                secondNumPosition < 0 || secondNumPosition > array.length || firstNumPosition == secondNumPosition) {
            throw new WrongPositionException("The positions of the elements to be replaced are indicated incorrectly");
        }
        Object temp = array[firstNumPosition];
        array[firstNumPosition] = array[secondNumPosition];
        array[secondNumPosition] = temp;
    }

    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
