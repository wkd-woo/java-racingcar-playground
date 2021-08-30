package RacingCarTest;

import RacingCar.Car;
import RacingCar.Cars;
import RacingCar.GrandPrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GrandPrixTest {

    @DisplayName("get_the_car_name")
    @Test
    void getNameTest(){
        Car test = new Car("test");
        assertThat(test.getCarName()).isNotNull();

    }

    @DisplayName("getCarPosition")
    @Test
    void getCarPositionTest(){
        Car test = new Car("test", 3);
        assertThat(test.getPosition()).isEqualTo(3);
    }

    @Test
    void isWinnerTest(){
        Car test = new Car("test", 3);
        assertThat(test.isWinner(3)).isNotNull();
        assertThat(test.isWinner(4)).isFalse();
    }

    @DisplayName("")
    @Test
    void setAndGetNameTest(){

    }

    @DisplayName("get_cars")
    @Test
    void getCarsTest(){
        List<Car> Test = new ArrayList<Car>(Arrays.asList(
                new Car[] {new Car("test1"), new Car("test2"), new Car("test3")}));

        Cars tests = new Cars(Test);

        assertThat(tests.getCars()).isNotNull();
    }

    @DisplayName("TrackWasMaden")
    @Test
    void TrackMadenTest(){
        GrandPrix test1 = new GrandPrix(3);
        GrandPrix test2 = new GrandPrix(2);
        GrandPrix test3 = new GrandPrix(1);

        assertThat(test1.getTrackDistance()).isEqualTo(3);
        assertThat(test2.getTrackDistance()).isEqualTo(2);
        assertThat(test3.getTrackDistance()).isEqualTo(1);
    }

    @Test
    void whoIsWinnerTest(){
        GrandPrix track = new GrandPrix(3);
        List<Car> testCars = new ArrayList<Car>(Arrays.asList(
                new Car[] {new Car("test1", 3), new Car("test2", 3), new Car("test3", 2)}));

        Cars cars = new Cars(testCars);

        assertThat(cars.whoIsWinner(track.getTrackDistance())).isNotNull();

    }


    @Test
    void trackDistanceTest(){

    }

    @DisplayName("포지션_이동")
    @Test
    void isPositionMovableTest(){
        Car test = new Car("Test");

        test.runTrack(6);
        assertThat(test.getPosition()).isEqualTo(1);
        test.runTrack(4);
        assertThat(test.getPosition()).isEqualTo(1);


    }
}