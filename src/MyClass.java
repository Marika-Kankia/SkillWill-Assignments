public class MyClass {

    // 1. დაწერე მეთოდი, რომელსაც გადაეცემა 4 რიცხვი და აბრუნებს ამ 4 რიცხვის საშუალოს;
    // 2. დაწერე მეთოდი, რომელსაც გადაეცემა 3 სტრინგი და აბრუნებს ამ სტრინგების სიგრძეების ჯამს;;


    //დავწეროთ 2 static მეთოდი, რომლებსაც შემდეგ გამოვიძახებთ MainClass კლასში.
    public static  double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    public static int sumStringLength(String s1, String s2, String s3) {
        return s1.length() + s2.length() + s3.length();
    }



}


