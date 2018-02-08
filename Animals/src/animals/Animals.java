package animals;

public class Animals {

    private String name;
    protected String abitility;
    protected String rarity;
    protected double Volum;

    public Animals() {
        this(null,null,null,0);
    }

    public double getVolum() {
        return Volum;
    }

    public void setVolum(double Volum) {
        this.Volum = Volum;
    }

    public double Volum() {
        return Volum;
    }
   

    public Animals(String name, String abitility, String rarity, double Volum) {
        this.name = name;
        this.abitility = abitility;
        this.rarity = rarity;
        this.Volum = Volum;
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
