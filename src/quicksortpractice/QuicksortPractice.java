/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksortpractice;

import java.util.Random;

/**
 *
 * @author DaTho7561
 */
public class QuicksortPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] toAdd = new int[100];
        Random rng = new Random();
        
        for(int i:toAdd) {
            i = rng.nextInt(1000000);
        }
        
        IntegerList il = new IntegerList(toAdd);
        
        System.out.println(il.toString());
        
        il.sort();
        
        System.out.println(il.toString());
        
    }
    
}
