package Assignment11;

public class Charasterics extends Animal{

    protected String appearanceColor;
    protected double height;
    protected String terrestrialOrAquatic;
    protected String animalGroup;

    public Charasterics (String Animal, double height, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        super(Animal);
        this.appearanceColor = colorOfSkin;
        this.height = height;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public Charasterics(String Animal){
        super(Animal);
        this.height = 1.8;
        this.appearanceColor = "white or black or brown";
        this.terrestrialOrAquatic = "terrestrial";
        this.animalGroup = "mammals";
    }

    public void setCharasterics(double height, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        this.appearanceColor = colorOfSkin;
        this.height = height;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public String getAppearanceColor(){
        return this.appearanceColor;
    }

    public double getSize(){
        return this.height;
    }

    public String getTerrestrialOrAquatic(){
        return this.terrestrialOrAquatic;
    }

    public String getAnimalGroup(){
        return this.animalGroup;
    }
}
