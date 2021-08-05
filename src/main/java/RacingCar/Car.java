package RacingCar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {
    private String name;
    private int position = 0;
    private double velocity = 0;

    public Car(String name) {
        this.name = name;
        getAccelerate();
    }

    public void showPosition() {
        System.out.print(name + " : ");
        for (int distance = 0; distance < position; distance++) {
            System.out.print("-");

        }
        System.out.println("");
    }


    public void runTrack(double accelerate) {
        if (accelerate >= 0.5){
            this.position++;
            this.showPosition();
        }
    }

    public int getPosition() {
        return this.position;
    }

    public double getAccelerate() {
        double dValue = Math.random();
        this.velocity = dValue;
        return this.velocity;
    }

    public boolean isFinished(int trackDistance) {
        if(this.position == trackDistance)
            return true;

        return false;
    }
}


class Cars {
    private static final int CARS_SIZE = 3;

    private final ArrayList<Car> carList;

    public Cars(ArrayList<Car> cars) {

        validateSize(cars);
        validateDuplicate(cars);
        this.carList = cars;
    }

    public ArrayList<Car> getCars() {

        return carList;
    }

    private void validateSize(ArrayList<Car> cars) {
        if (cars.size() != CARS_SIZE) {
            throw new IllegalArgumentException("차는 3개만 설정 가능합니다");
        }
    }

    private void validateDuplicate(ArrayList<Car> cars) {
        Set<Car> nonDuplicateCars = new HashSet<>(cars);
        if (nonDuplicateCars.size() != CARS_SIZE) {
            throw new IllegalArgumentException("차 이름은 중복될 수 없습니다.");
        }
    }

    public void showPosition(){
        carList.get(0).showPosition();
        carList.get(1).showPosition();
        carList.get(2).showPosition();
    }

    public void runTrack(){
        carList.get(0).runTrack(carList.get(0).getAccelerate());
        carList.get(1).runTrack(carList.get(1).getAccelerate());
        carList.get(2).runTrack(carList.get(2).getAccelerate());
    }

    public void Finally(Car car, int trackDistance) {
        if (car.getPosition() == trackDistance){

        }


    }
}