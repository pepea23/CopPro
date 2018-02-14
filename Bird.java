package animals;

public class Bird extends Animals {

    private int wingNum;

    public Bird(int wingNum, String name, String abitility, String rarity, double Volum) {
        super(name, abitility, rarity, Volum);
        this.wingNum = wingNum;
    }

    Bird() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getVolum() {
        return Volum+(wingNum*10/123);
    }

    public String abilityDescribe() {

        return abitility;
    }

    public int getWingNum() {
        return wingNum;
    }

    public void setWingNum(int wingNum) {
        this.wingNum = wingNum;
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + "wingNum=" + wingNum + '}';
    }
}
