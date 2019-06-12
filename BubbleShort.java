/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onurhizlan;

/**
 *
 * @author onur_
 */
public class BubbleShort {
    
    static void bubbleShort(int[] array){
        
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int array[] = {5,2,0,3,9,6};
        bubbleShort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    
}
