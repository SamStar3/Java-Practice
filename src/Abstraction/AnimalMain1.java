package Abstraction;

import SearchDSA.FindFloor;
import jdk.jfr.FlightRecorder;

import java.lang.annotation.Target;

public abstract class AnimalMain1 {

    public static void main(String[] args) {

        Bird1 bird = new Bird1();
        Animal1 animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        Trackable track = new Truck();
        track.track();

        double kms = 100;
        double miles = kms * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %2f miles%n", kms,miles);


    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

}
