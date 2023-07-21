package AbstractionUsingInterface;

public class Car implements Vehicle {
    @Override
    public int noOfWheels() {
        System.out.println("Car Class");
        return 4;
    }
}
