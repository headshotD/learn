package org.example.lesson1;

public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("бах бах ба-бах");
    }

    void playTopHat() {
        System.out.println("динь динь ди-динь");
    }

    static class DrumKitTestDrive {
        public static void main(String[] args) {
            DrumKit d = new DrumKit();
            d.playSnare();
            d.playTopHat();
            d.snare =false;
            if (d.snare == true) {
                d.playSnare();
            }

        }
    }
}


