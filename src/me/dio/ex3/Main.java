package me.dio.ex3;

public class Main {
    public static void main(String[] args) {
        Clock brClock = new BrClock();
        brClock.setSecond(0);
        brClock.setMinute(0);
        brClock.setHour(25);

        System.out.println(brClock.getTime());
        System.out.println(new UsClock().convert(brClock).getTime());
    }
}
