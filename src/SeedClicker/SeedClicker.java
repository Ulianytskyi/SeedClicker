package SeedClicker;

public class SeedClicker {
    int _score = 0;

    public static void main(String[] args) {
        Person hero = new Person();

    }

}

class Person {
    int rateTake = 1;
    int _level = 1;

    public void setRate(int newRate) {
        this.rateTake = newRate;
    }
    public int getRate() {
        return rateTake;
    }

}