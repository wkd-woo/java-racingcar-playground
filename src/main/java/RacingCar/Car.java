package RacingCar;

public class Car {
    private final String name;
    private int position;

    public Car(String name){
        this.name = name; this.position = 0;
    }

    public Car(String name, int position){
        this.name = name; this.position = position;
    }

    public String getCarName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isWinner(int trackDistance) {

        return this.position == trackDistance;
    }
}
