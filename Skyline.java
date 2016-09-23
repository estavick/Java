/*****
 * Skyline --- program to display five buildings right next to each other.
 * @authors Wanzin Yazar and Edward Stavick 
 * @version 1.0
 * @since September 23, 2016
*****/

import javax.swing.*;
import java.awt.*;

public class Skyline
{
   //-----------------------------------------------------------------
   //  Presents a collection of circles.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Splat");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
