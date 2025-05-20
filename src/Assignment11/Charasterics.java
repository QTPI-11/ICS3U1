package Assignment11;

public class Charasterics extends Animal{

    protected String appearanceColor;
    protected double height;
    protected String terrestrialOrAquatic;
    protected String animalGroup;

    public Charasterics (String Animal, int population, int ageExpectancy, double centimeters, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        super(Animal, population, ageExpectancy);
        this.appearanceColor = colorOfSkin;
        this.height = centimeters;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public Charasterics(String Animal, int population, int ageExpectancy){
        super(Animal, population, ageExpectancy);
        this.height = 160;
        this.appearanceColor = "white or black or brown";
        this.terrestrialOrAquatic = "terrestrial";
        this.animalGroup = "mammals";
    }

    public void setCharasterics(double centimeters, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        this.appearanceColor = colorOfSkin;
        this.height = centimeters;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public String getAppearanceColor(){
        return this.appearanceColor;
    }

    public double getHeight(){
        return this.height;
    }

    public String getTerrestrialOrAquatic(){
        return this.terrestrialOrAquatic;
    }

    public String getAnimalGroup(){
        return this.animalGroup;
    }

    public boolean sameCharasteric(Charasterics animal, String trait){
        switch (trait.toLowerCase()) {
            case "appearanceColor": return this.appearanceColor.equalsIgnoreCase(animal.appearanceColor);
            case "size": return this.height == animal.height;
            case "terrestrialOrAquatic": return this.terrestrialOrAquatic.equalsIgnoreCase(animal.terrestrialOrAquatic);
            case "animalGroup": return this.animalGroup.equalsIgnoreCase(animal.animalGroup);
            default: return false; 
        }
    }

    public String describeAnimal() {
        return String.format("The %s is a %s meter tall %s animal in the %s group.", this.getName(), this.height/100, this.terrestrialOrAquatic, this.animalGroup);
    }

    public boolean isAlbino(Charasterics animal) {
        if (animal.appearanceColor.equalsIgnoreCase("white") && !this.appearanceColor.equalsIgnoreCase("white")){
            return this.isVariation(animal);
        } else {
            return false;
        }
    }
} 