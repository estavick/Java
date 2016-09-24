//***********************
//Building.java				Author: Lewis/Loftus
//
//Represents a building with a particular width, height, and color.
//*************************

import java.awt.*;
public class Building
{
    private int w, h, x, y;
    private Color color;
    
    //-------------------------
    //  Constructor: Sets up this circle with the specified values.
    //-------------------------
    
    public Building ( int upperX, int upperY, int width, int height, Color shade)
    {
    	color    = shade;
    	w    	 = width;
    	h        = height;
    	x        = upperX;
    	y 		 = upperY;
    }
    
    //--------------------------------
    // Draws this rectangle in the specified graphic context.
    //---------------------------------
    
    public void draw (Graphics page)
    {
    	page.setColor (color);
    	page.fillRect (x, y, w, h);
    	page.setColor (color.blue);
    	page.fillRect (x+3, y+3, 5, 5);
    }
    
	//---------------------
	//Rectangle mutator.
	//---------------------
	
	public void setW (int width)
	{
		w = width;
	}
	
	public void setH (int height)
	{
		h = height;
	}
	
	//--------------------
	//Color mutator.
	//-------------------
	
	public void setColor (Color shade)
	{
		color = shade;
	}
	
	//-----------------------
	
	public void setX  (int upperX)
	{
		x = upperX;
	}
	
	public void setY  (int upperY)
	{
		y = upperY;
	}
	
	//------------------------
	// rectangle accessor
	//------------------------
	
	public int getW ()
	{
		return w;
	}
	
	public int getH ()
	{
		return h;
	}
	
	public Color getColor ()
	{
		return color;
	}
	
	public int getX ()
	{
		return x;
	}
	
	public int getY ()
	{
		return y;
	}
}