package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T>{

    List <Integer> arr = new  ArrayList <> ();

    public int index;
    public T value;

    public CopyEvent (int index, T value){
        arr.add (index);
        this.value = value;
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr){
        arr[index] = value;
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
