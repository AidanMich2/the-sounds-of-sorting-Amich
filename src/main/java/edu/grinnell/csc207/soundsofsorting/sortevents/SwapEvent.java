package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T>{
    List <Integer> arr = new  ArrayList <> ();


    public int i;
    public int j;

    public SwapEvent (int i, int j){
        arr.add (i);
        arr.add (j);
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr){
        T temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices(){
        return arr;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized(){
        return true;
    }
}
