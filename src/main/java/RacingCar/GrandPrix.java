package RacingCar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GrandPrix {
    private static int TRACK_DISTANCE;

    public static List<Car> separateName(String inputs) {
        String[] names = inputs.split(",");

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(names[0]));
        carList.add(new Car(names[1]));
        carList.add(new Car(names[2]));

        Cars cars = new Cars(carList);

        return cars.getCars();
    }

    public static void setTrackDistance(int distance) {

        TRACK_DISTANCE = distance;
    }

    public static int getTrackDistance() {

        return TRACK_DISTANCE;
    }
}
