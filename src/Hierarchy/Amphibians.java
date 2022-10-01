package Hierarchy;

import java.util.Objects;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String name, String livingEnvironment) {
        super(name);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No Data";
        }
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No Data";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){

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
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

}
