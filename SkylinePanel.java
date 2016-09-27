import javax.swing.*;
import java.awt.*;

/*****
 * @authors Wanzin Yazar and Edward Stavick 
 * @version 1.0
 * @since September 26, 2016
 * @
 * @
 * @exception Any exception.
*****/

public class SkylinePanel extends JPanel
{
   private Building building1, building2, building3, building4, building5;

   //-----------------------------------------------------------------
   //  Constructor: Creates five building objects.
   //-----------------------------------------------------------------
   public SkylinePanel()
   {
      building1 = new Building (5, 150, Color.black, 45, 50);
      building2 = new Building (70, 85, Color.green, 30, 115);
      building3 = new Building (120, 120, Color.red, 60, 80);
      building4 = new Building (195, 100, Color.gray, 25, 100);
      building5 = new Building (235, 140, Color.white, 20, 60);
      
      //Sets the resolution and color of the panel.
      setPreferredSize (new Dimension(300, 200));
      setBackground (Color.pink);
      
      //Draws the name of the city.
      JLabel cityName = new JLabel("Wanzin and Edward's City");
      this.add(cityName);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each building draw itself.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      building5.draw(page);
   }
}
