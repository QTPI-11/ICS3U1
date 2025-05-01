package Assignment11;

public class Animal {

    protected String animal;

    public Animal(String name) {
        this.animal = name;
    }

    protected void setName(String name) {
        this.animal = name;
    }
    
    protected String getName(){
        return this.animal;
    }

    protected double population (double population){
        return population;
    }

    protected int ageExpectancy (int ageExpectancy){
        return ageExpectancy;
    }

    protected boolean isVariation(Animal animal){
        return this.animal.equalsIgnoreCase(animal.getName());
    }
}