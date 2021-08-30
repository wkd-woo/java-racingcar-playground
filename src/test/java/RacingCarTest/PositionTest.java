package RacingCarTest;

import RacingCar.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void createTest(){
        Position test1 = new Position(2);
        Position test2 = new Position();

        assertThat(test1.getPosition()).isEqualTo(2);
        assertThat(test2.getPosition()).isEqualTo(0);
    }

    @DisplayName("Move_Test")
    @Test
    void moveTest(){
        Position position = new Position(3);

        assertThat(position.move()).isEqualTo(new Position(4));

    }
}