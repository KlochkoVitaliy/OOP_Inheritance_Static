package Hierarchy;

import java.util.Objects;

public class Birds extends Animals {
    private  String livingEnvironment;
    private Flightless flightless;
    private Flying flying;

    public Birds(String name, String livingEnvironment) {
        super(name);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No Data";
        }
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No Data";
        }
    }

    public String getLivingEnvironment() {
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
        return livingEnvironment.equals(birds.livingEnvironment) && flightless.equals(birds.flightless) && flying.equals(birds.flying);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, flightless, flying);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "flightless=" + flightless +
                ", flying=" + flying +
                '}';
    }
}


