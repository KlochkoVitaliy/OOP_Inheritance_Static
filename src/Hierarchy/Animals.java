package Hierarchy;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public Animals (String name) {
        this(name,0);
    }

    public Animals (String name, int age) {
        if (age >= 0) {
            this.age = LocalDate.now().getYear() - age;
        } else {
            this.age = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }else{
            this.name = "Животное";
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - age;
    }

    public abstract void eat();

    public void sleep(){

    }
    public abstract void go ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

}
