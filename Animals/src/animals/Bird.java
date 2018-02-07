package animals;

public class Bird extends Animals {

    private int wingNum;

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
        return "Bird{" + "wingNum=" + wingNum + '}';
    }
}
