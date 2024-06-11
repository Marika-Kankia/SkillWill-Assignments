package NinthAssignment;

public class MyClass {
    public static int stringToInteger(String number){
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        String input = "34";
        int result = stringToInteger(input);
        System.out.println(result);
    }
}
