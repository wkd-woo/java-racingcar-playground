package RacingCar;

public class Car {
    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = new Position(0);
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = new Position(position);
    }

    public String getCarName() {
        return this.name;
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public boolean isWinner(int trackDistance) {

        return this.position.getPosition() == trackDistance;
    }


    public void runTrack(int velocity)  {
        if (velocity > 4) {
            position.move();
        }

    }
}
