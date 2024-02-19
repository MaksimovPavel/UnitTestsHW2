package second.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import second.hw.Car;
import second.hw.Motorcycle;
import second.hw.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {
    Car car;
    Motorcycle harley;

    @BeforeEach
    public void setUp(){
        car = new Car("Volkswagen","Jetta", 2018 );
        harley = new Motorcycle("Harley Davidson", "T1000",2023);
    }
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleHasTwoWheels(){
        assertThat(harley.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarTestDriveSpeed(){
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleTestDriveSpeed(){
        harley.testDrive();

        assertThat(harley.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCorrectParkingSpeed(){
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testCorrectMotorcycleParkingSpeed(){
        harley.testDrive();
        harley.park();

        assertThat(harley.getSpeed()).isEqualTo(0);
    }

}