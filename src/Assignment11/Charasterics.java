package Assignment11;

public class Charasterics extends Animal{

    protected String appearanceColor;
    protected String size;
    protected String terrestrialOrAquatic;
    protected String animalGroup;

    public Charasterics (String Animal, double population, int ageExpectancy, String size, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        super(Animal, population, ageExpectancy);
        this.appearanceColor = colorOfSkin;
        this.size = size;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public Charasterics(String Animal, double population, int ageExpectancy){
        super(Animal, population, ageExpectancy);
        this.size = "moderate";
        this.appearanceColor = "white or black or brown";
        this.terrestrialOrAquatic = "terrestrial";
        this.animalGroup = "mammals";
    }

    protected void setCharasterics(String size, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        this.appearanceColor = colorOfSkin;
        this.size = size;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    protected String getAppearanceColor(){
        return this.appearanceColor;
    }

    protected String getSize(){
        return this.size;
    }

    protected String getTerrestrialOrAquatic(){
        return this.terrestrialOrAquatic;
    }

    protected String getAnimalGroup(){
        return this.animalGroup;
    }

    protected boolean sameCharasterics(Charasterics animal, String trait){
        switch (trait.toLowerCase()) {
            case "appearanceColor": return this.appearanceColor.equalsIgnoreCase(animal.appearanceColor);
            case "size": return this.size.equalsIgnoreCase(animal.size);
            case "terrestrialOrAquatic": return this.terrestrialOrAquatic.equalsIgnoreCase(animal.terrestrialOrAquatic);
            case "animalGroup": return this.animalGroup.equalsIgnoreCase(animal.animalGroup);
            default: return false; 
        }
    }

    protected void comparePopulations (Charasterics animal){
        System.out.println(((this.population > animal.population) ? this : animal) + " has the bigger population.");
    }

    protected void compareAgeExpectancy (Charasterics animal){
        System.out.println(((this.ageExpectancy > animal.ageExpectancy) ? this : animal) + " has longer life expectancies.");
    }
} // need two more methods maybe use the methods inherited from the parent class ex. population and age which i think need to be fixed