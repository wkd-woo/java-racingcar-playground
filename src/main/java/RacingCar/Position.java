package RacingCar;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        if (position < 0){
            throw new IllegalArgumentException("포지션 값은 양의 정수여야 합니다.");
        }

        this.position = position;
    }

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public Position move() {    // 가변 객체
        position = position + 1;
        return this;
    }

    public Position move2(){    // 불변 객체, 서비스가 커지면 성능이슈

        return new Position(position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
