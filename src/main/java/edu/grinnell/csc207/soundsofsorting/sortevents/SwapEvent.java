package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T>{
    List <Integer> arrList = new  ArrayList <> ();


    // public int i;
    // public int j;

    public SwapEvent (int i, int j){
        arrList.add (i);
        arrList.add (j);
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr){
        Sorts.swap(arr, arrList.get(0), arrList.get(1));
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices(){
        return arrList;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized(){
        return true;
    }
}
