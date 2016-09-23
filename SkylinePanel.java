//********************************************************************
//  SplatPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
   private Rectangle rectangle1, rectangle2, rectangle3, rectangle4, rectangle5;

   //-----------------------------------------------------------------
   //  Constructor: Creates five Circle objects.
   //-----------------------------------------------------------------
   public SkylinePanel()
   {
      rectangle1 = new Rectangle (0, 100, Color.red, 10, 120);
      rectangle2 = new Rectangle (20, 60, Color.green, 40, 120);
      rectangle3 = new Rectangle (50, 70, Color.cyan, 60, 120);
      rectangle4 = new Rectangle (70, 65, Color.yellow, 80, 120);
      rectangle5 = new Rectangle (100, 85, Color.blue, 110, 120);

      setPreferredSize (new Dimension(300, 200));
      setBackground (Color.black);
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
