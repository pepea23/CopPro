/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author computer
 */
public class Test {

    public static void main(String[] args) {
        Bird br1 = new Bird(20, "Cherpang", "SuperZoom", "Rare",100);
        System.out.println(br1);
        System.out.print("\n Value of this is : "+br1.getVolum()+" Milion \n");
       
        
        Fish fh1 = new Fish(10, "Punpun", "SUperDriver", "uncommon",100);
        System.out.println(fh1);
        System.out.println("\n Vlue of this is : "+ fh1.getVolum()+" Milion \n");
        
        
       Animals br2 = new Animals();
        System.out.println(br2);
    }
}
