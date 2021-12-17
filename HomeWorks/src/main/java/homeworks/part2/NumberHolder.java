package homeworks.part2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NumberHolder {

    public int anInt;

    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(1, 1.1f);
        System.out.println(numberHolder.anInt + " " + numberHolder.aFloat);
    }

}
