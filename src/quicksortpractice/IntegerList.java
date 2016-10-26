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
        
        list = new int[array.length];
        
        System.arraycopy(array, 0, list, 0, array.length);
    }
    
    public int get(int index) {
        return list[index];
    }
    
    public void set(int index, int value) {
        list[index] = value;
    }
    
    public void sort() {
        list = bSort(list);
    }
    
    public int[] bSort(int[] array) {
        
        int toSwap = checkSorted(array);
        if (-1==toSwap) return array;
        swap(array, toSwap, toSwap + 1);
        
        return bSort(array);
        
    }
    
    private void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    
    private int checkSorted(int[] array) {
        
        int index = -1;
        
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) index = i;
        }
        return index;
    }
    
    @Override
    public String toString() {
        
        String strRep = "{";
        
        for (int i = 0; i < list.length; i++) {
            strRep += " " + list[i] + ",";
        }
        
        strRep += "}";
        
        return strRep;
        
    }
    
}
