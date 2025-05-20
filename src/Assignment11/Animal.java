package Assignment11;

public class Animal {

    protected String animal;
    protected int population;
    protected int ageExpectancy;

    public Animal(String name, int population, int ageExpectancy) {
        this.animal = name;
        this.population = population;
        this.ageExpectancy = ageExpectancy;
    }

    protected void setAnimal(String name, int population, int ageExpectancy) {
        this.animal = name;
        this.population = population;
        this.ageExpectancy = ageExpectancy;
    }

    protected String getName() {
        return this.animal;
    }

    protected int getPopulation (){
        return this.population;
    }

    protected int getAgeExpectancy (){
        return this.ageExpectancy;
    }

    protected int populationDifference(Animal animal){
        return this.population - animal.population;
    }

    protected boolean isVariation(Animal animal){
        return this.animal.equalsIgnoreCase(animal.getName());
    }

    protected boolean similarAgeExpectancy(Animal animal){
        return this.ageExpectancy - animal.ageExpectancy <= 5;
    }
}