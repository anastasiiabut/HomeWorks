package homeworks.part1;

public class Task4 {

    public static void main(String[] args) {
        int[] myArray = new int[]{5, 6, 7, 12, -5, 32, 43};
        int sum = 0;

        for (int i = 0; i < myArray.length; ++i) {
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}
