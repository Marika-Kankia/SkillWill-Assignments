package InheritanceAndPolymorphism;

abstract class Car {
    abstract void speed();
    abstract void color();
    public  void numberOfWheels(int wheels){
        System.out.println("This car has"+ " "+wheels+ " "+ "Wheels");
    }

    public static void main(String[] args) {
        BMW bmw=new BMW();
        Mercedes mercedes=new Mercedes();
        bmw.speed();
        bmw.color();
        bmw.numberOfWheels(4);
        mercedes.speed();
        mercedes.color();
        mercedes.numberOfWheels(4);
    }

}
