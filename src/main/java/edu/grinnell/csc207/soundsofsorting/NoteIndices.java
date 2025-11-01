package edu.grinnell.csc207.soundsofsorting;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
    /**
     * @param n the size of the scale object that these indices map into
     */

    private int n;
    private Integer [] arr;
    private boolean [] highlight;

    public NoteIndices(int n) {
        this.n = n;
        this.arr = new Integer [n];
        this.highlight = new boolean[n];
        //  Scale scaly = new Scale (arr);
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
       Integer [] newArr = new Integer [n];
       boolean [] newHighlight = new boolean [n];
       highlight = newHighlight;

       for (int i = 0; i < n; i++){
            int temp = (int) (Math.random() * (n));
            newArr [i] = temp;
       }
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return arr;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        highlight [index] = true;
    }
    
    /**
     * @param index the index to check
     * @return true if the given index is highlighted
     */
    public boolean isHighlighted(int index) {
        if (highlight [index]){
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        for (int i = 0; i < n; i++){
            highlight [i] = false;
        }
    }
}
