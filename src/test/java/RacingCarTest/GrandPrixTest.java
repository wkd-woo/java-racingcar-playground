package RacingCarTest;

import RacingCar.Car;
import RacingCar.GrandPrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GrandPrixTest {

    @DisplayName("횟수설정_적용_테스트")
    @Test
    public void 횟수설정_확인_테스트() {

        GrandPrix test = new GrandPrix();
        test.setTrackDistance(1);
        assertThat(GrandPrix.getTrackDistance()).isNotNull();
    }

    @DisplayName("getName_테스트")
    @Test
    void 이름_확인(){
        Car test = new Car("test");
        assertThat(test.getName()).isNotNull();
    }

    @DisplayName("횟수설정_회차_확인_테스트")
    @Test
    void 횟수설정_테스트() {

        GrandPrix test = new GrandPrix();

        test.setTrackDistance(1);
        assertThat(test.getTrackDistance()).isEqualTo(1);

        test.setTrackDistance(5);
        assertThat(test.getTrackDistance()).isEqualTo(5);

        test.setTrackDistance(10);
        assertThat(test.getTrackDistance()).isEqualTo(10);

    }

    @DisplayName("속도설정_확인_테스트")
    @Test
    void 속도설정_테스트() {
        Car test = new Car("test");
        assertThat(test.getAccelerate()).isNotZero();
    }

    @Test
    void 속도설정_0to1_확인() {
        Car test = new Car("test");
        assertThat(test.getAccelerate()).isBetween(0.0, 1.0);
    }

    @DisplayName("트랙길이와_포지션이같으면_완주")
    @Test
    void 완주_확인(){
        Car test = new Car("test");
        assertThat(test.isFinished(1)).isFalse();

        test.runTrack(1);
        assertThat(test.isFinished(1)).isTrue();

        test.runTrack(1);
        assertThat(test.isFinished(2)).isTrue();
    }

    @DisplayName("Car_이동_확인")
    @Test
    void 이동_확인() {
        Car test = new Car("Test");
        test.runTrack(.6);

        assertThat(test.getPosition()).isNotZero();
        assertThat(test.getPosition()).isEqualTo(1);
    }

    @DisplayName("차_이름설정")
    @Test
    void 게임_설정() {
        GrandPrix test = new GrandPrix();
        test.separateName("test1, test2, test3");

        assertThat(test.getNumOfCars()).isEqualTo(3);
    }

    @Test
    void 게임_진행() {

        GrandPrix test = new GrandPrix();
        test.separateName("test1, test2, test3");
        test.setTrackDistance(3);
        assertThat(test.isGoing()).isEqualTo(3);
    }


}











