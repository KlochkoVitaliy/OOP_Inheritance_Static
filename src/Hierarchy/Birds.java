package Hierarchy;

import java.util.Objects;

public class Birds extends Animals {
    private static String livingEnvironment;
    private Flightless flightless;
    private Flying flying;

    public Birds(String name, String livingEnvironment) {
        super(name);
        if (livingEnvironment == null) {
            this.livingEnvironment = "Нет значений";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null) {
            this.livingEnvironment = "Нет значений";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public static String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt() {
        System.out.println("Охочусь на насекомых и меских зверей");
    }

    @Override
    public void eat() {
        System.out.println("Ем что в рот положат");
    }

    @Override
    public void go() {
        System.out.println("Летаю как Орель");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return flightless.equals(birds.flightless) && flying.equals(birds.flying);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "flightless=" + flightless +
                ", flying=" + flying +
                '}';
    }
}


