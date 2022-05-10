package ru.nshi.learn.Work7;
import java.util.*;
public class CarMaker {
    private String carMakerName;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarMaker(String carMakerName) {
        this.carMakerName = carMakerName;
    }

    @Override
    public String toString() {
        return carMakerName;
    }

    public String getCarMakerName() {
        return carMakerName;
    }

    public void setCarMakerName(String carMakerName) {
        this.carMakerName = carMakerName;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
