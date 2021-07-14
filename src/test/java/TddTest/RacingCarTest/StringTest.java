package TddTest.RacingCarTest;

import RacingCar.GrandPrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringTest {

    @DisplayName("쉼표를_통해_차_이름_설정")
    @Test
    void 쉼표_구분_테스트(){

        assertThat(GrandPrix.separateName("0,1,2").size()).isEqualTo(3);
    }


}
