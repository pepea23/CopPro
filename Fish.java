package animals;

public class Fish extends Animals {

    private int finNum;

    public Fish(int finNum, String name, String abitility, String rarity, double Volum) {
        super(name, abitility, rarity, Volum);
        this.finNum = finNum;
    }

   

    public String abilityDescribe() {

        return abitility;
    }

    public int getFinNum() {
        return finNum;
    }

    public void setFinNum(int finNum) {
        this.finNum = finNum;
    }

    @Override
   public double getVolum() {
        return Volum*(finNum/10*0.25);
    }
    
    @Override
    public String toString() {
        return "Fish{" +super.toString()+ "finNum=" + finNum + '}';
    }

}
