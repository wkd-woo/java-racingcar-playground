package RacingCar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class GrandPrix {
    private static int TRACK_DISTANCE;
    private static Cars cars;
    private static boolean areRunning = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Cars cars = new Cars(separateName(sc.nextLine()));

        System.out.println("시도할 횟수는 몇회인가요?");
        setTrackDistance(sc.nextInt());

        while(areRunning){
            cars.runTrack();
            areRunning = false;

        }

        System.out.println("실행 결과");

    }


    public static ArrayList<Car> separateName(String inputs) {
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


    public int getNumOfCars() {

        return cars.getCars().size();
    }

    public int isGoing() {
        ArrayList<Car> carList = cars.getCars();
        Car one = carList.get(1);
        Car two = carList.get(2);
        Car three = carList.get(3);


        return 1;
    }
}
