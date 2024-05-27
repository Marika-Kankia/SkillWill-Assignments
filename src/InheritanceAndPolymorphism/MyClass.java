package InheritanceAndPolymorphism;

 public class MyClass implements MyInterface{
     @Override
    public void hello(String message){
        System.out.println(message);
    }
    @Override
    public void hello(String message,int digit){
        for (int i=1;i<digit;i++){
            System.out.println(message);
        }
    }
     public static void main(String[] args) {
         MyClass myclass = new MyClass();
         myclass.hello("No to the Russian law!");
         myclass.hello("No to the Russian law!", 99);
     }

}
