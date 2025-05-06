package Assignment11;

public class Classification extends Animal{

    protected String domain;
    protected String kingdom;
    protected String phylum;
    protected String clazz;
    protected String order;
    protected String family;
    protected String genus;
    protected String species;

    public Classification (String Animal, double population, int ageExpectancy, String domain, String kingdom, String phylum, String clazz, String order, String family, String genus, String species){
        super(Animal, population, ageExpectancy);
        this.domain = domain;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.clazz = clazz;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
    }

    protected String getDomain(){
        return this.domain;
    }

    protected String getKingdom(){
        return this.kingdom;
    }

    protected String getPhylum(){
        return this.phylum;
    }

    protected String getClazz(){
        return this.clazz;
    }

    protected String getOrder(){
        return this.order;
    }

    protected String getFamily(){
        return this.family;
    }

    protected String getGenus(){
        return this.genus;
    }

    protected String getSpecies(){
        return this.species;
    }

    protected void setClassification(String domain, String kingdom, String phylum, String clazz, String order, String family, String genus, String species){
        this.domain = domain;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.clazz = clazz;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
    }

    protected boolean sameRank(Classification other, String rank) {
        switch (rank.toLowerCase()) {
            case "domain": return this.domain.equalsIgnoreCase(other.domain);
            case "kingdom": return this.kingdom.equalsIgnoreCase(other.kingdom);
            case "phylum": return this.phylum.equalsIgnoreCase(other.phylum);
            case "clazz": return this.clazz.equalsIgnoreCase(other.clazz);
            case "order": return this.order.equalsIgnoreCase(other.order);
            case "family": return this.family.equalsIgnoreCase(other.family);
            case "genus": return this.genus.equalsIgnoreCase(other.genus);
            case "species": return this.species.equalsIgnoreCase(other.species);
            default: return false;
        }
    }
    protected String giveScientificName (Classification animal){
        return animal.getGenus() + " " + animal.getSpecies();
    }

    protected boolean isHuman(){
        return (this.species.equalsIgnoreCase("sapiens") && this.genus.equalsIgnoreCase("homo"));
    }
} // maybe change the isHuman method for something that would be inherited from the parent class ex. inVariation :]