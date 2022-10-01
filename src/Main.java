import Hierarchy.*;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель",5 ,"Savanna", 50,"трава");
        printHerbivores(gazelle);
        gazelle.walk();
        gazelle.eat();
        gazelle.go();
        gazelle.graze();
        Herbivores giraffe = new Herbivores("Жираф", 2, "Africa", 10,"зелень");
        Herbivores horse = new Herbivores("Лошадь", 15, "Siria", 150,"сено");

        System.out.println();

        Predators hyena = new Predators("Гиена", 10, "Africa", 30, "meat");
        Predators tiger = new Predators("Тигр", 6, "Africa", 130, "mammals & predators");
        Predators bear = new Predators("Медведь", 16, "Russia", 80, "mammals & predators & honey");
        printPredators(bear);
        bear.walk();
        bear.eat();
        bear.go();
        bear.hunting();

        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 1, "England");
        Amphibians grassSnake = new Amphibians("Уж", 3, "Asia");
        printAmphibians(grassSnake);
        grassSnake.eat();
        grassSnake.go();
        grassSnake.hunt();

        System.out.println();

        Flightless peacock = new Flightless("Павлин", 4, "Russia", "не летает");
        Flightless penguin = new Flightless("Пингвин", 14, "The North Pole", "не летает");
        Flightless dodoBird = new Flightless("Птица ДоДо", 12, "Africa", "ходит");
        printFlightless(peacock);
        peacock.eat();
        peacock.go();
        peacock.walk();

        System.out.println();

        Flying seagull = new Flying("Чайка", 5, "Russia", "летит");
        Flying albatross = new Flying("Альбатрос", 15, "Russia", "летит");
        Flying falcon = new Flying("Сокол", 3, "China", "парит");
        printFlying(falcon);
        falcon.eat();
        falcon.go();
        falcon.fly();

    }

    public static void printHerbivores(Herbivores herbivores) {
        System.out.println("Наименование " + herbivores.getName() +
                ", Возраст " + herbivores.getAge() + " лет. " +
                ", Среда обитания " + herbivores.getLivingEnvironment() +
                ", Скорость " + herbivores.getSpeed() + " км/ч. " +
                ", к какому классу относится - " + herbivores.getClass());
    }

    public static void printPredators(Predators predators) {
        System.out.println("Наименование " + predators.getName() +
                ", Возраст " + predators.getAge() + " лет. " +
                ", Среда обитания " + predators.getLivingEnvironment() +
                ", Скорость " + predators.getSpeed() + " км/ч. " +
                ", чем питается " + predators.getTypeFood() +
                ", к какому классу относится - " + predators.getClass());
    }

    public static void printAmphibians(Amphibians amphibians) {
        System.out.println("Наименование " + amphibians.getName() +
                ", Возраст " + amphibians.getAge() + " лет. " +
                ", Среда обитания " + amphibians.getLivingEnvironment() +
                ", к какому классу относится - " + amphibians.getClass());
    }

    public static void printFlightless(Flightless flightless){
        System.out.println("Наименование " + flightless.getName() +
                ", Возраст " + flightless.getAge() + " лет. " +
                ", Среда обитания " + flightless.getLivingEnvironment() +
                ", Тип движения "+ flightless.getTypeOfMovement()+
                ", к какому классу относится - " + flightless.getClass());
    }

    public static void printFlying(Flying flying){
        System.out.println("Наименование " + flying.getName() +
                ", Возраст " + flying.getAge() + " лет. " +
                ", Среда обитания " + flying.getLivingEnvironment() +
                ", Тип движения "+ flying.getTypeOfMovement()+
                ", к какому классу относится - " + flying.getClass());
    }
}