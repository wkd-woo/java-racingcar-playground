package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void showPosition() {
        System.out.print(name + " : ");
        for (int distance = 0; distance < position; distance++) {
            System.out.print("-");

        }
        System.out.println("");
    }


    public void runTrack() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}

class Cars {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getCars() {
        return carList;
    }

    public Cars(List<Car> cars) {
        this.carList = cars;
    }
}