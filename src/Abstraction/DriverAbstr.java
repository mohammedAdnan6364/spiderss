package Abstraction;

public class DriverAbstr {
    public static void main(String[] args){
        Mobile m = new samsung() {
            @Override
            public void model() {

            }

            @Override
            public void Processor() {

            }
        };
        m.call();
        m.camera();
        Mobile m1= new onePlus() {
            @Override
            public void call() {

            }

            @Override
            public void camera() {

            }
        };
        m1.model();
        m1.Processor();

    }
}
