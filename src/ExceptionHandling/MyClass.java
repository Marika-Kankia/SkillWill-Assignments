package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
    public static void createAndReadFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("ფაილი '" + filePath + "' წარმატებით შეიქმნა.");


            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("ფაილში '" + filePath + "' არსებული ინფორმაცია:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("ექსეფშენი: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("უცნობი ექსეფშენი: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
