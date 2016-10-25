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
public class IntegerList {
    
    private int[] list;
    
    public IntegerList(int[] array) {
        
    }
    
    public int get(int index) {
        return list[index];
    }
    
    public void set(int index, int value) {
        list[index] = value;
    }
    
    public void sort() {
        
    }
    
    public int[] bSort(int[] array) {
        
        int toSwap = -1;
        
        if (-1==checkSorted(array)=) return array;
        
        int lastOutOfOrder = -1;
        
        for (int i = 0; i < array.length; i++) {
            
        }
        
        return array;
        
    }
    
    private int checkSorted(int[] array) {
        
        int index = -1;
        
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) index = i;
        }
        return index;
    }
    
}
