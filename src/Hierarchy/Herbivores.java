package Hierarchy;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeFood;

    public Herbivores(String name,int age,  String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No Data";
        }
    }

    public Herbivores(String name, String livingEnvironment, int speed, String typeFood) {
        super(name, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No Data";
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "Растительность";
        }
    }

    public void graze() {
        //пастись
        System.out.println("Пасусь на травке");
    }

    @Override
    public void eat() {
        System.out.println("Ем тавку");
    }

    @Override
    public void go() {
        System.out.println("Хожу по лугу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typeFood.equals(that.typeFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}
