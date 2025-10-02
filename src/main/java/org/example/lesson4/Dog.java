package org.example.lesson4;

public class Dog {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
    }

    void bark() {

        if (size > 60) {
            System.out.println("GAV GAV!");
        } else if (size > 14) {
            System.out.println("WOOF WOOF");
        } else {
            System.out.println("tyav tyaf");
        }


    }
}


