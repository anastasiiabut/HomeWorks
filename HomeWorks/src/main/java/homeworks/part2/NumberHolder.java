package homeworks.part2;

public class NumberHolder {

    public int anInt;

    public float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(1, 1.1f);
        System.out.println(numberHolder.anInt + " " + numberHolder.aFloat);
    }

}
