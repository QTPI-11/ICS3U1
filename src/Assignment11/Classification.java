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

    public Classification (String Animal, int population, int ageExpectancy, String domain, String kingdom, String phylum, String clazz, String order, String family, String genus, String species){
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

    public String getDomain(){
        return this.domain;
    }

    public String getKingdom(){
        return this.kingdom;
    }

    public String getPhylum(){
        return this.phylum;
    }

    public String getClazz(){
        return this.clazz;
    }

    public String getOrder(){
        return this.order;
    }

    public String getFamily(){
        return this.family;
    }

    public String getGenus(){
        return this.genus;
    }

    public String getSpecies(){
        return this.species;
    }

    public void setClassification(String domain, String kingdom, String phylum, String clazz, String order, String family, String genus, String species){
        this.domain = domain;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.clazz = clazz;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.species = species;
    }

    public boolean sameRank(Classification other, String rank) {
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
    public String giveScientificName() {
        return String.format("this scientific name for %s is %s %s",this.getName(),this.getGenus(),this.getSpecies());
    }

    public String listFullClassification() {
        return String.format("Name: %s, Domain: %s, Kingdom: %s, Phylum: %s, Class: %s, Order: %s, Family: %s, Genus: %s, Species: %s", this.getName(), this.domain, this.kingdom, this.phylum, this.clazz, this.order, this.family, this.genus, this.species);
    }
}