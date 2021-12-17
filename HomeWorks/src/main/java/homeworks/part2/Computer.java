package homeworks.part2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@ToString
@Setter
@Getter
public class Computer {

    private String brand;
    private double screenSize;
    private final int numberOfCores = 8;
    private final String type = "laptop";


    public static void main(String[] args) {

        Computer firstComputer = new Computer();
        firstComputer.brand = "Omen";
        firstComputer.screenSize = 16.1;

        System.out.println(firstComputer);

        Computer secondComputer = new Computer();
        secondComputer.brand = "Dell";
        secondComputer.screenSize = 16.1;
        System.out.println(secondComputer);



    }
}
