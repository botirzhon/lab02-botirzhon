package exercise;

import java.awt.Color;
import java.awt.Graphics;

public class MainProgram {

    public static void testDrawable(Display display, Drawable circles) throws Exception {

        // TODO : Move to location and draw Yellow Circles

        // TODO : Move to location and draw RED Circles

        // TODO : Move to location and draw Circles with Fillable AQUA

        display.pause(500);
    }

    public static void testFillable(Display display, Fillable filledCircles) throws Exception {

        //TODO: Set Location back to location (50, 50)

        display.pause(500);

        // TODO : Draw fillable  RED, WHITE and BLUE Circles

        // TODO : Draw circles with Fillable AQUA Color
        display.pause(500);
    }

    public static void main(String[] args) throws Exception{

        Display display = new Display(600, 500);
        display.setBackground(Color.DARK_GRAY);

        // Get Graphics Pen Object for Drawing in Window
        Graphics pen = display.getGraphics();

        // TODO : Create Circles of a Drawable Type

        // TODO : Draw Drawable  Circles

        // clear display if needed (uncomment)
        // display.clear();

        // TODO : Create Circles of a Fillable Type

        // TODO : Draw Fillable Circles
    }
}
