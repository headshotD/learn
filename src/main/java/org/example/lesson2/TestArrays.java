package org.example.lesson2;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] index = new int[4];
        for (int x = 0; x < index.length; x++) {
            index[x] = x;
        }

        System.out.println(Arrays.toString(index));

        String[] islands = new String[4];
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

//        for(int y=0;y< index.length;y++){
//            ref=index[y];
//            System.out.println("Острова = " + islands[ref]);
//        }

        for (int i : index) {
            int ref;
            ref = i;
            System.out.println("Острова = " + islands[ref]);
        }

    }
}

