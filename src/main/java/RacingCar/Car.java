package RacingCar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private static final int CARS_SIZE = 3;

    private final List<Car> carList;

    public Cars(List<Car> cars) {

        validateSize(cars);
        validateDuplicate(cars);
        this.carList = cars;
    }

    public List<Car> getCars() {

        return carList;
    }

    private void validateSize(List<Car> cars){
        if(cars.size() != CARS_SIZE){
            throw new IllegalArgumentException("차는 3개만 설정 가능합니다");
        }
    }

    private void validateDuplicate(List<Car> cars){
        Set<Car> nonDuplicateCars = new HashSet<>(cars);
        if(nonDuplicateCars.size() != CARS_SIZE){
            throw new IllegalArgumentException("차 이름은 중복될 수 없습니다.");
        }
    }

}