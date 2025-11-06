
class Vehicle {
    private String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void start() {
        System.out.println(this.brand + " is starting.");
    }
}

class Car extends Vehicle {
    void drive(){
        System.out.println(this.getBrand() + " is driving.");
    }
}

 public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Honda");
        myCar.start();
        myCar.drive();
    }
}