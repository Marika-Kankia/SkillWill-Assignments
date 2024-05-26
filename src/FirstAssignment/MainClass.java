package FirstAssignment;

public class MainClass {

    public static void main(String[] args) {
            String str1 = "abbc";
            String str2 = "rtty";
            String str3 = "hagaa";
            //sumStringLength მეთოდი გამოვიძახოთ SecondAssignment.MyClass კლასიდან, რომ გამოვთვალოთ ზემოთ მოცემული  სტრინგების სიგრძეების ჯამი
            int totalLength = MyClass.sumStringLength(str1, str2, str3);
            // average მეთოდი გამოვიძახოთ SecondAssignment.MyClass კლასიდან, რომ გამოვთვალოთ ნებისმიერი 4 რიცხვის საშუალო არითმეტიკული
            double average=MyClass.average(13,14,16,18);
            System.out.println("The average is " + average);
            System.out.println("The total length of the strings is"+" "+totalLength);
        }

    }


