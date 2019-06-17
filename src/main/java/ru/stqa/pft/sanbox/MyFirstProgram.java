package ru.stqa.pft.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {


        hello("User");
        hello("User2");
        hello("User3");
        hello("User4");
        hello("User5");


Square s = new Square (5);

s.l = 5;

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area ());


        Rectangle r = new Rectangle (4, 6 );


        System.out.println("Площадь треугольника со сторонами  " + r.a + " и " + r.b + " = " + r.area ());

    }


    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + " !");

    }




}







