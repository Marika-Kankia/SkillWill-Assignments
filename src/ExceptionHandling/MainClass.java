package ExceptionHandling;

import static ExceptionHandling.MyClass.createAndReadFile;

public class MainClass {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\us store plus\\IdeaProjects\\SkillwillExercises\\Assignment.txt";
        String content="assignment";
        createAndReadFile(filePath, content);
    }
}
