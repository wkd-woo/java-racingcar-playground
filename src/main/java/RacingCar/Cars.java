package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars){
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> whoIsWinner(int trackDistance) {
        List<String> winners = new ArrayList<String>();

        for (Car car : cars) {
            if(car.isWinner(trackDistance)){
                winners.add(car.getCarName());
            };
        }

        return winners;
    }
}