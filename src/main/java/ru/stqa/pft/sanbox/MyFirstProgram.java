package ru.stqa.pft.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {


        hello("User");
        hello("User2");
        hello("User3");
        hello("User4");
        hello("User5");

        double l = 5;

        System.out.println("Площадь квадрата со стороной " + l + " = " + area (l));


        double a = 4;
        double b = 6;

        System.out.println("Площадь треугольника со сторонами  " + a + " и " + b + " = " + area (a, b));

    }


    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + " !");

    }

    public static double area (double len) {

        return len * len;

    }

        public static double area (double a, double b) {


        return a * b;

}
}







