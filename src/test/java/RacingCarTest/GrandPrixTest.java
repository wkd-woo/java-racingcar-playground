package RacingCarTest;

import RacingCar.GrandPrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GrandPrixTest {

    @DisplayName("횟수설정_적용_테스트")
    @Test
    public void 횟수설정_확인_테스트(){

        GrandPrix test = new GrandPrix();
        test.setTrackDistance(1);
        assertThat(GrandPrix.getTrackDistance()).isNotNull();
    }

    @DisplayName("횟수설정_회차_확인_테스트")
    @Test
    public void 횟수설정_테스트(){

        GrandPrix test = new GrandPrix();

        test.setTrackDistance(1);
        assertThat(test.getTrackDistance()).isEqualTo(1);

        test.setTrackDistance(5);
        assertThat(test.getTrackDistance()).isEqualTo(5);

        test.setTrackDistance(10);
        assertThat(test.getTrackDistance()).isEqualTo(10);

    }

}