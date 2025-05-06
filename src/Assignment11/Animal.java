package Assignment11;

public class Animal {

    protected String animal;
    protected double population;
    protected int ageExpectancy;

    public Animal(String name, double population, int ageExpectancy) {
        this.animal = name;
    }

    protected void setAnimal(String name, double population, int ageExpectancy) {
        this.animal = name;
        this.population = population;
        this.ageExpectancy = ageExpectancy;
    }

    protected String getName() {
        return this.animal;
    }

    protected double getPopulation (){
        return this.population;
    }

    protected int getAgeExpectancy (){
        return this.ageExpectancy;
    }

    protected boolean isVariation(Animal animal){
        return this.animal.equalsIgnoreCase(animal.getName());
    }
}