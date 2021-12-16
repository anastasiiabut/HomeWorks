package homeworks.part2;

import java.io.Serializable;

public class Computer {

    private String brand;
    private double screenSize;
    private int numberOfCores = 8;
    private String type = "laptop";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {

        Computer firstComputer = new Computer();
        firstComputer.setBrand("Omen");
        firstComputer.setScreenSize(16.1);

        System.out.println(firstComputer.getBrand());
        System.out.println(firstComputer.getScreenSize());
        System.out.println(firstComputer.getNumberOfCores());
        System.out.println(firstComputer.getType());

        Computer secondComputer = new Computer();
        secondComputer.setBrand("Dell");
        secondComputer.setScreenSize(14.9);

        System.out.println(secondComputer.getBrand());
        System.out.println(secondComputer.getScreenSize());
        System.out.println(secondComputer.getNumberOfCores());
        System.out.println(secondComputer.getType());

    }
}
