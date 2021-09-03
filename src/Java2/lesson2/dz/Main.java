package Java2.lesson2.dz;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "2"},
                {"23", "45", "29", "35"},
                {"2", "4", "6", "8"},
        };
        System.out.println(sum(arr));

    }

    static int sum(String[][] arr) throws IndexOutOfBoundsException {
        if (arr.length > 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (IndexOutOfBoundsException e) {
                    throw new MyArraySizeException();
                }
            }
        }
        return sum;
    }
}
