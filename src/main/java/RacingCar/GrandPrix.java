package RacingCar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GrandPrix {
    private static int TRACK_DISTANCE;
    private static Cars cars;

    public static List<Car> separateName(String inputs) {
        String[] names = inputs.split(",");

        ArrayList<Car> carList = new ArrayList<>();
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

    public void setCars(String one, String two, String three) {
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car(one));
        carList.add(new Car(two));
        carList.add(new Car(three));

        cars = new Cars(carList);
        
    }


    public int getNumOfCars() {

        return cars.getCars().size();
    }
}
