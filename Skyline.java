import javax.swing.*;
import java.awt.*;

/*****
 * Skyline --- program to display a skyline with five adjacent buildings with windows.
 * @authors Wanzin Yazar and Edward Stavick 
 * @version 1.0
 * @since September 26, 2016
*****/

public class Skyline
{
   /* Algorithm:
    * 1. Create the frame via the JFrame class.
    * 2. Draw the skyline on the panel.
    * 3. Use a constructor to initialize the specified values of the buildings.
    * 4. Set the dimensions, location, and color of the buildings.
    * 5. Draw the buildings.
    * 6. Draw two windows to each building.
    * 
    * @param args
    * @exception Any exception.
    * @return No return value.
   */
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());
      frame.pack();
      frame.setVisible(true);
   }
}
