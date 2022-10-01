package Hierarchy;

import java.util.Objects;

public class Birds extends Animals {
    public static class Flightless extends Animals {
        private String typeOfMovement;

        public Flightless(String name, String typeOfMovement) {
            this(name, 0, "Type of movement", "Eath");
            if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
                this.typeOfMovement = typeOfMovement;
            } else {
                this.typeOfMovement = "No Data";
            }
        }

        public Flightless(String name, int age, String typeOfMovement, String livingEnvironment) {
            super(name, age);
            if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
                this.typeOfMovement = typeOfMovement;
            } else {
                this.typeOfMovement = "No Data";
            }
            livingEnvironment = getLivingEnvironment();
        }

        public String getTypeOfMovement() {
            return typeOfMovement;
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
            Flightless that = (Flightless) o;
            return Objects.equals(typeOfMovement, that.typeOfMovement);
        }

    }

    public static class Flying extends Animals {
        private String typeOfMovement;

        public Flying(String name, String typeOfMovement) {
            this(name, 0, typeOfMovement, "Eath");
            if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
                this.typeOfMovement = typeOfMovement;
            } else {
                this.typeOfMovement = "No Data";
            }
        }

        public Flying(String name, int age, String typeOfMovement, String livingEnvironment) {
            super(name, age);
            if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
                this.typeOfMovement = typeOfMovement;
            } else {
                this.typeOfMovement = "No Data";
            }
            livingEnvironment = getLivingEnvironment();
        }

        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void fly() {

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
            Flying flying = (Flying) o;
            return Objects.equals(typeOfMovement, flying.typeOfMovement);
        }

    }

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
        Birds birds = (Birds) o;
        return Objects.equals(flightless, birds.flightless) && Objects.equals(flying, birds.flying);
    }

}


