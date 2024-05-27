package InheritanceAndPolymorphism;

public class Mercedes extends Car{

    @Override
    void speed() {
        System.out.println("This car's speed is 304mph");
    }

    @Override
    void color() {
        System.out.println("Color is white");

    }
}
