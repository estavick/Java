//********************************************************************
//  SplatPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
   private Building rectangle1, rectangle2, rectangle3, rectangle4, rectangle5;

   //-----------------------------------------------------------------
   //  Constructor: Creates five Circle objects.
   //-----------------------------------------------------------------
   public SkylinePanel()
   {
      rectangle1 = new Building (0, 100, 40, 50, Color.black);
      rectangle2 = new Building (70, 40, 20, 120, Color.green);
      rectangle3 = new Building (120, 65, 50, 80, Color.red);
      rectangle4 = new Building (190, 55, 15, 95, Color.lightGray);
      rectangle5 = new Building (240, 80, 13, 70, Color.white);

      setPreferredSize (new Dimension(300, 200));
      setBackground (Color.pink);
      JLabel label1 = new JLabel("Wanzin and Edward's City");
      this.add(label1);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each circle draw itself.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      rectangle1.draw(page);
      rectangle2.draw(page);
      rectangle3.draw(page);
      rectangle4.draw(page);
      rectangle5.draw(page);
   }
}
