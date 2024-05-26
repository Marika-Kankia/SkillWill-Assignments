package SecondAssignment;

public class Exercise2 {
    /* 1. დაწერე მეთოდი, რომელსაც გადაეცემა ცხოველის სახელი (სტრინგად). ამ მეთოდმა ძაღლის, კატის, ლომის, ღორის შემთხვევაში უნდა დაწეროს შესაბამისი სიტყვა.
     მაგალითად ძაღლის შემთხვევაში "I am the dog" და ა.შ. ხოლო სხვა ცხოველების შემთხვევაში "I Am an Animal" */
    public static void animalName(String animal) { // მეთოდი animalName იღებს ცხოველის სახელს  და ბეჭდავს შესაბამის ტექსტს
        switch (animal) {
            case "dog":
                System.out.println("I am the dog");
                break;
            case "cat":
                System.out.println("I am the cat");
                break;
            case "pig":
                System.out.println("I am the pig");
                break;
            case "lion":
                System.out.println("I am the lion");
                break;
            default: //სხვა ცხოველები
                System.out.println("I am an animal");
        }
    }


    /* 2. დაწერე მეთოდი, რომელსაც გადაეცემა ორი რიცხვი და დააბრუნე პირველი რიცხვი მეორე რიცხვის ხარისხში.
        მაგალითად თუ გადმოგვეცა 2 და 3 უნდა დავაბრუნოთ 8(2*2*2) (გამოიყენეთ loop ები). */
    public static long calculatePower(int base, int exponent) {
        long result = 1; //ამ სტრიქონში result ინიციალიზებულია 1-ით, რადგან ნებისმიერი რიცხვი აყვანილი 0 ხარისხში, უდრის 1-ს.
        // for ციკლი base-ს იმდენჯერ ამრავლებს საკუთარ თავზე, რამდენჯერაც i არ აღემატება exponent-ის მნიშვნელობას.
        for (int i = 1; i <= exponent; i++) {
            result *= base; //result  მრავლდება base-ზე ყოველი ციკლის გამნეორებისას
        }
        return result; // აბრუნებს საბოლოო შედეგს
    }


    public static void main(String[] args) {
        // ცხოველების სახელების დაბეჭდვა
        animalName("dog");
        animalName("cat");
        animalName("pig");
        animalName("lion");
        animalName("cow");

        //რიცხვის ხარისხში აყვანის გამოთლა
        int base = 2;
        int exponent = 3;
        long result = calculatePower(base, exponent);
        System.out.println(base + " to the power of " + exponent + " is " + result);

    }

}
