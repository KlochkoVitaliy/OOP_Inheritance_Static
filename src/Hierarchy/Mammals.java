package Hierarchy;

import java.util.Objects;

public class Mammals extends Animals {

    public static class Herbivores extends Animals {
        private String typeFood;

        public Herbivores(String name, String typeFood) {
            this(name,0,typeFood,"Earth",0);
            if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
                this.typeFood = typeFood;
            }else{
                this.typeFood = "No Data";
            }
        }

        public Herbivores(String name, int age, String typeFood, String livingEnvironment, int speed) {
            super(name, age);
            if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
                this.typeFood = typeFood;
            }else{
                this.typeFood = "No Data";
            }
            livingEnvironment=getLivingEnvironment();
            speed=getSpeed();
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

        public void graze() {                   //пастись
        }

        @Override
        public void eat() {

        }

        @Override
        public void go() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Herbivores that = (Herbivores) o;
            return Objects.equals(typeFood, that.typeFood);
        }

    }

    public static class Predators extends Animals{
        private String typeFood;

        public Predators(String name, String typeFood) {
            this(name,0,typeFood,"Eath",0);
            if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
                this.typeFood = typeFood;
            }else{
                this.typeFood = "No Data";
            }
        }

        public Predators(String name, int age, String typeFood,String livingEnvironment, int speed) {
            super(name, age);
            if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
                this.typeFood = typeFood;
            }else{
                this.typeFood = "No Data";
            }
            livingEnvironment=getLivingEnvironment();
            speed=getSpeed();
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
        }

        @Override
        public void eat() {

        }

        @Override
        public void go() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Predators predators = (Predators) o;
            return Objects.equals(typeFood, predators.typeFood);
        }

    }

    private static String livingEnvironment;
    private static int speed;

    private Herbivores herbivores;
    private Predators predators;

    public Mammals(String name, String livingEnvironment, int speed) {
        super(name);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
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
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No Data";
        }
        if (speed == 0) {
            this.speed = 1000000;
        } else {
            this.speed = speed;
        }
    }


    public static String getLivingEnvironment() {
        return livingEnvironment;
    }

    public static int getSpeed() {
        return speed;
    }

    public void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(herbivores, mammals.herbivores) && Objects.equals(predators, mammals.predators);
    }

}