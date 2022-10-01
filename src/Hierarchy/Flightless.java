package Hierarchy;

public class Flightless extends Birds {
    private String typeOfMovement;

    public Flightless(String name, String livingEnvironment, String typeOfMovement) {
        super(name, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "No Data";
        }
    }

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "No Data";
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void walk() {
        System.out.println("Хожу брожу");
    }

    @Override
    public void eat() {
        System.out.println("Ем подножный корм");
    }

    @Override
    public void go() {
        System.out.println("Стою на месте");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
