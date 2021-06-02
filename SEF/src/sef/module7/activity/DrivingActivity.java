package sef.module7.activity;



public class DrivingActivity {

    public static void main(String arg[]){



        Moving m1 = new Car();
        Moving m2 = new Motorcycle();

        Driver d = new Driver(" John SuperDriver");


        d.setMoving(m1);
        d.driverStartsDriving();

        d.setMoving(m2);
        d.driverStartsDriving();


    }
}
