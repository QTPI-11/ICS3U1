package Assignment11;

public class Charasterics extends Animal{

    protected String appearanceColor;
    protected String size;
    protected String terrestrialOrAquatic;
    protected String animalGroup;

    public Charasterics (String Animal, String size, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        super(Animal);
        this.appearanceColor = colorOfSkin;
        this.size = size;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public Charasterics(String Animal){
        super(Animal);
        this.size = "moderate";
        this.appearanceColor = "white or black or brown";
        this.terrestrialOrAquatic = "terrestrial";
        this.animalGroup = "mammals";
    }

    public void setCharasterics(String size, String colorOfSkin, String terrestrialOrAquatic, String animalGroup){
        this.appearanceColor = colorOfSkin;
        this.size = size;
        this.terrestrialOrAquatic = terrestrialOrAquatic;
        this.animalGroup = animalGroup;
    }

    public String getAppearanceColor(){
        return this.appearanceColor;
    }

    public String getSize(){
        return this.size;
    }

    public String getTerrestrialOrAquatic(){
        return this.terrestrialOrAquatic;
    }

    public String getAnimalGroup(){
        return this.animalGroup;
    }
}
