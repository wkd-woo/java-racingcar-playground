package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int position;

    public Car(String name){
        this.name = name;
    }
}

class Cars{
    private List<Car> carList = new ArrayList<>();


    public List<Car> getCars(){
        return carList;
    }

    public Cars (List<Car> cars){
        this.carList = cars;
    }
}