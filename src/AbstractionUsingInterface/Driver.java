package AbstractionUsingInterface;

import javax.sound.midi.Soundbank;

public class Driver {
    public static void main(String[] args){
        Vehicle v= new Bike();
        System.out.println(" wheels "+v.noOfWheels());
        Vehicle v1 = new Car();
        System.out.println(" wheels "+v1.noOfWheels());
    }
}
