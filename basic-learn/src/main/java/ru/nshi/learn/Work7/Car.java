package ru.nshi.learn.Work7;
import java.util.*;

public class Car {
    private String carModel;
    private CarMaker carMaker;
    private String modelYear;
    private String color;

    static Set<CarMaker> makersSet = new HashSet<CarMaker>();

    Car() { }
    Car(String model, CarMaker maker, String modelYear, String color) {
        this.carModel = model;
        this.carMaker = maker;
        this.modelYear = modelYear;
        this.color = color;

        this.carMaker.getCars().add(this);
    }

    public static Car stringToCar(String row) {
        String[] values = row.split(StreamAPI.DELIMITER);
        Car car = new Car();
        car.setCarModel(values[0]);
        car.setModelYear(values[2]);
        car.setColor(values[3]);

        makersSet.add(new CarMaker(values[1])); // Add maker if unique
        car.carMaker = makersSet.stream()
            .filter( maker -> maker.getCarMakerName().equals(values[1]) )
            .findAny().get();

        car.carMaker.getCars().add(car);
        return car;
    }

    @Override
    public String toString() {
        return this.carModel + ", "
            + this.carMaker.toString() + ", "
            + this.modelYear + ", "
            + this.color;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public CarMaker getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(CarMaker carMaker) {
        this.carMaker = carMaker;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
