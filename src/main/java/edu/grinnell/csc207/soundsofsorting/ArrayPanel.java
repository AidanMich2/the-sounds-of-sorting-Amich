package edu.grinnell.csc207.soundsofsorting;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    @SuppressWarnings("unused")
    private NoteIndices notes;
   
    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * @param notes the note indices 
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
       int WIDTH = 400;
       int HEIGHT = 300;

       int len = notes.getNotes ().length;

       int barWidth = WIDTH / len;
       int barHeight = HEIGHT / len;
       g.setColor (Color.WHITE);
       g.fillRect(0, 0, WIDTH, HEIGHT);
       for (int i = 0; i < len; i++){
            if (i % 4 == 0){
                g.setColor (Color.RED);
            }
            else if(i % 4 == 1){
                g.setColor (Color.GREEN);
            }
            else if(i % 4 == 2){
                g.setColor (Color.BLUE);
            }
            else if(i % 4 == 3){
                g.setColor (Color.YELLOW);
            }
            g.fillRect (i * barWidth, notes.getNotes () [i] * barHeight, barWidth, barHeight);
       }
    }
}