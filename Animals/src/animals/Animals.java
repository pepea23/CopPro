package animals;

public class Animals {

    private String name;
    protected String abitility;
    protected String rarity;

    public Animals() {
    }

    public Animals(String name, String abitility, String rarity) {
        this.name = name;
        this.abitility = abitility;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbitility() {
        return abitility;
    }

    public void setAbitility(String abitility) {
        this.abitility = abitility;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String AbirityDescribe() {

        return abitility;
    }

    @Override
    public String toString() {
        return "Animals{" + "name=" + name + ", abitility=" + abitility + ", rarity=" + rarity + '}';
    }

    
    
}