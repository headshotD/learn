package org.example.lesson2;

public class Again {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Анюта";
        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Cat();

        cats[0].name = "Oleg";
        cats[1].name = "Andrey";
        cats[2] = cat1;
        System.out.print("Как зовут последнего котика? ");
        System.out.println(cats[2].name);

        int x = 0;
        while (x < cats.length) {
            cats[x].meow();
            x = x + 1;
        }
    }
}

class Cat {
    String name;
    Byte Age;

    void meow() {
        System.out.println(name + " сказала мяу");
    }
}
