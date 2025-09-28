package org.example.lesson2;

public class MassivObject {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Anna";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Andrey";
        myDogs[1].name = "Oleg";

        System.out.print("Имя последней собачки - ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}

class Dog {
    String name;
    Byte age;

    Dog bark() {
        System.out.println(name + " сказал гав!");
        return this;
    }

}
