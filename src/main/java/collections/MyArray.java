package collections;

import java.util.Arrays;

public class MyArray {
    private int[] array;

    /**
     * create new int (for this moment) array with n length
     * */
    public MyArray(int n) {
        this.array = new int[n];
    }

    /**
     * function void set(int position, int value) - set value on particular position in array
     * */
    public void set(int position, int value){
        array[position] = value;
    }

    /**
     * function void get(int position) - return particular value from array
     * */
    public int get(int position){
        return array[position];
    }


}
