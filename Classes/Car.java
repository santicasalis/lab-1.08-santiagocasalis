package Classes;


abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

class Sedan extends Car {

}

class UtilityVehicle extends Car {
    protected boolean fourWheelDrive;

}

class Truck extends Car {
    protected int towingCapacity;

}
