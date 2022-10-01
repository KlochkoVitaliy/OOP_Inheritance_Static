package Hierarchy;

public  class Predators extends Mammals {
    private String typeFood;

    public Predators(String name, String livingEnvironment, int speed, String typeFood) {
        super(name, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No Data";
        }
    }

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
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

    public void hunting() {
        System.out.println("Охочусь на добычу");
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо и плоть");
    }

    @Override
    public void go() {
        System.out.println("Я невидим перед прыжком");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeFood.equals(predators.typeFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}
