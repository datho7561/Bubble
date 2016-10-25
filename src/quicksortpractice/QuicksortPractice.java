/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksortpractice;

/**
 *
 * @author DaTho7561
 */
public class QuicksortPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntegerList il = new IntegerList(new int[]{4,2,4});
        
        System.out.println(il.toString());
        
        il.sort();
        
        System.out.println(il.toString());
        
    }
    
}
