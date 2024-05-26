package ClassesandObjects;

public class Students {
    private String name;
    private int age;
    private String major;
    private double gpa;
    private boolean isInternational;

    public Students() {
        // არა არგუმენტიანი კონსტრუქტორი
    }

    public Students(String name, int age, String major, double gpa, boolean isInternational) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.isInternational = isInternational;
    }  //კონსტრუქტორი ყველა არგუმენტით

    // ყველა ფილდისთვის გეთერი და სეთერი
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public static void main(String[] args) {
        // კლასის ობიექტი ყველა არგუმენტიანი კონსტრუქტორით და თითოეული ფილდის დაბეჭდვა გეთერის გამოყენებით
        Students student1 = new Students("Marika", 24, "Mathematics", 3.9, false);

        System.out.println("My Name Is : " + student1.getName());
        System.out.println("I am: " + student1.getAge()+" "+"Years old");
        System.out.println("My Major is: " + student1.getMajor());
        System.out.println("My GPA is: " + student1.getGpa());
        System.out.println("International: " + student1.isInternational());


        // კლასის ობიექტი უარგუმენტო კონსტრუქტორით და ყველა ფილდის შეყვანა  სეთერის გამოყენებით
        Students student2 = new Students();
        student2.setName("Sam");
        student2.setAge(44);
        student2.setMajor("Computer Science");
        student2.setGpa(3.2);
        student2.setInternational(true);

        System.out.println("My Name is: " + student2.name);
        System.out.println("I am: " + student2.age+" "+ "Years old");
        System.out.println("My Major is: " + student2.major);
        System.out.println("My GPA is: " + student2.gpa);
        System.out.println("International: " + student2.isInternational);
    }

    }



