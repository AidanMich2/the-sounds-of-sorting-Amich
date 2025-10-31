package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T>{
    List <Integer> arr = new  ArrayList <> ();

    public int i;
    public int j;


    public CompareEvent (int i, int j){
        arr.add (i);
        arr.add (j);
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr){
        
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
        return false;
    }
}
