package homeworks.part1;

public class Task5 {

    public static void main(String[] args) {
        int[] myArray = new int[]{5, 6, 7, 12, -5, 32, 43, 6, 12};

        for (int i = 0; i < myArray.length; ++i) {
            for (int j = i + 1; j < myArray.length; ++j) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                }
            }
        }
    }
}
