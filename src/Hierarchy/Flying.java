package Hierarchy;

public class Flying extends Birds {
    private String typeOfMovement;

    public Flying(String name, String livingEnvironment, String typeOfMovement) {
        super(name, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        } else {
            this.typeOfMovement = "No Data";
        }
    }

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
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

    public void fly() {
        System.out.println("Лечу кайфую");
    }

    @Override
    public void eat() {
        System.out.println("Ммм, мошки...");
    }

    @Override
    public void go() {
        System.out.println("Летаю как боженька");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return typeOfMovement.equals(flying.typeOfMovement);
    }

    @Override
    public String toString() {
        return "Flying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
