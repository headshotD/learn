package org.example.lesson4;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog spitz = new Dog();
        spitz.setName("Anna");
        spitz.setSize(15);

        Dog ovcharka = new Dog();
        ovcharka.setSize(65);
        ovcharka.setName("Oleg");
        System.out.println("One dog " + spitz.getSize());
        System.out.println("Two dog " + ovcharka.getSize());
        spitz.bark();
        ovcharka.bark();
    }

}
