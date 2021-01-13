package model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int vin;
    private String name;
    private String color;
    public    ArrayList<Car> carList = new ArrayList();

    public ArrayList<Car> getCarList() {

        carList.add(new Car(1111,"BMW1","Black"));
        carList.add(new Car(2222,"BMW2","VeryBlack"));
        carList.add(new Car(3333,"BMW3","LightBlack"));
        carList.add(new Car(4444,"BMW4","Yellow"));
        carList.add(new Car(5555,"BMW5","White"));

        return carList;
    }
    public Car(){}

    public Car(int vin, String name, String color) {
        this.vin = vin;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
