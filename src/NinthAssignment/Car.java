package NinthAssignment;

public class Car extends Vehicle{
   private int wheelCount;

    public Car(String brand, String modelName, String releaseYear,int wheelCount) {
        super(brand, modelName, releaseYear);
        this.wheelCount=wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wheel Count: " + wheelCount;
    }


    public static void main(String[] args) {
        Car car=new Car("BMW","A-CLASS","2018",4);
        System.out.println(car.toString());
    }

}
