package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }


    // Проверить, что объект Car создается с 4-мя колесами
    @Test
    public void testCarIsCreatedWith4Wheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car.getNumWheels() == 4);
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleIsCreatedWith2Wheels() {
        Motorcycle moto = new Motorcycle("arr", "rrrrr", 2010);
        assertTrue(moto.getNumWheels() == 2);
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void CarTestDriveIsSpeed60() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    public void MotorcycleTestDriveIsSpeed75() {
        Motorcycle moto = new Motorcycle("arr", "rrrrr", 2010);
        moto.testDrive();
        assertTrue(moto.getSpeed() == 75);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void CarTestParkIsSpeed0() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void MotorcycleTestParkIsSpeed0() {
        Motorcycle moto = new Motorcycle("arr", "rrrrr", 2010);
        moto.testDrive();
        moto.park();
        assertTrue(moto.getSpeed() == 0);
    }
}