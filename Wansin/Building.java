//***********************
//Building.java				Author: Wanzin, Edward
//@Date 09/27/2016
//Represents a building with a particular width, height, color, and windows.
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
    // Draws this rectangle with windows in the specified graphic context.
    //---------------------------------
    
    public void draw (Graphics page)
    {
    	page.setColor (color);
    	page.fillRect (x, y, w, h);
    	page.setColor (color.blue);
    	page.fillRect (x+3, y+3, 5, 5);
    }
    
	//---------------------
	//width, mutator.
	//---------------------
	
	public void setW (int width)
	{
		w = width;
	}
	
	//----------------
	//Height, mutator.
	//----------------
	
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
	// X mutator.
	//-----------------------
	
	public void setX  (int upperX)
	{
		x = upperX;
	}
	
	//-----------------------------
	//Y mutator.
	//-----------------------------
	
	public void setY  (int upperY)
	{
		y = upperY;
	}
	
	//-----------------
	//Width accessor.
	//-----------------
	
	public int getW ()
	{
		return w;
	}
	
	//height accessor.
	
	public int getH ()
	{
		return h;
	}
	
	//Color accessor.
	
	public Color getColor ()
	{
		return color;
	}
	
	//----------------------
	// X accessor.
	//----------------------
	
	public int getX ()
	{
		return x;
	}
	
	//---------------------
	// Y accessor.
	//---------------------
	
	public int getY ()
	{
		return y;
	}
}