interface Playable {
    void play();
}

abstract class MusicDevice {
    String brand;

    void info() {
        System.out.println("Music Device Brand: " + brand);
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {

    void connect() {
        System.out.println("CD Player connected.");
    }

    public void play() {
        System.out.println("Playing music from CD.");
    }
}

class Smartphone extends MusicDevice implements Playable {

    void connect() {
        System.out.println("bluetooth connected.");
    }

    public void play() {
        System.out.println("Playing music from spodify.");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.brand = "Sony";
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();

        System.out.println("----------------");

        Smartphone smartphone = new Smartphone();
        smartphone.brand = "Samsung";
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}