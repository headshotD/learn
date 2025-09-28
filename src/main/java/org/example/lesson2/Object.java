package org.example.lesson2;

public class Object {
    public static void main(String[] args) {
        Person human = new Person();
        human.name = "Oleg";
        human.age = 27;

        Person human2 = new Person();
        human2.name = "Anna";
        human2.age = 25;
        System.out.println("My name is " + human.name);
        System.out.println("My age is " + human.age);

        System.out.println("My name is " + human2.name);
        System.out.println("My age is " + human2.age);
        human.hello();
    }
}

class Person {
    String name;
    int age;

    void hello() {
        System.out.println("Hello guys!");
    }
}
