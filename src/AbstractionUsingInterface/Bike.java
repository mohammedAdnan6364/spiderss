package AbstractionUsingInterface;

public class Bike implements Vehicle {
    @Override
    public int noOfWheels() {
        System.out.println("Bike Class ");
        return 2;
    }
}
