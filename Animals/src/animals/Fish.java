package animals;

public class Fish extends Animals{
    private int finNum ; 

     public String abilityDescribe () {
               
        return abitility ;        
    }
     
    public int getFinNum() {
        return finNum;
    }

    public void setFinNum(int finNum) {
        this.finNum = finNum;
    }

    @Override
    public String toString() {
        return "Fish{" + "finNum=" + finNum + '}';
    }
    
    
    
    
}