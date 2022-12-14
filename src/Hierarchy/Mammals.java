package Hierarchy;

import java.util.Objects;

public class Mammals extends Animals {

    private  final  String livingEnvironment;
    private  final  int speed;

    public Mammals(String name, String livingEnvironment, int speed) {
        super(name);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "No Data";
        }
        if (speed == 0) {
            this.speed = 1000000;
        } else {
            this.speed = speed;
        }
    }

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "No Data";
        }
        if (speed == 0) {
            this.speed = 1000000;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public  String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void walk() {
        System.out.println("Гуляю как млекопитающее");
    }

    @Override
    public void eat() {
        System.out.println("Ем что не в себя!");
    }

    @Override
    public void go() {
        System.out.println("Иду куда хочу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}