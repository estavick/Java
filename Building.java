import java.awt.*;

/*****
 * @authors Wanzin Yazar and Edward Stavick 
 * @version 1.0
 * @since September 26, 2016
 * @param upperX ----- starting x-coordinate
 * @param upperY ----- starting y-coordinate
 * @param arg shade ---- the color of the building
 * @param width ---- the width of the building
 * @param page ---- draws the buildings and the windows
 * @param height ---- the height of the window and buildings
 * @exception Any exception.
 * @return The graphical depiction of building.
*****/

public class Building
{
    private int w, h, x, y;
    private Color color;
    
    //-------------------------
    //  Constructor: Sets up this building with the specified values.
    //-------------------------
    
    public Building (int upperX, int upperY, Color shade, int width, int height)
    {
    	color = shade;
    	w = width;
    	h = height;
    	x = upperX;
    	y = upperY;
    }
    
    //--------------------------------
    // Draws this building in the specified graphics context.
    //---------------------------------
    
    public void draw (Graphics page)
    {
    	page.setColor(color);
    	page.fillRect(x, y, w, h);

    	//Draws the windows on the buildings.
    	page.setColor(color.blue);
    	page.fillRect(x+3, y+3, 5, 5);
    	page.fillRect(x+12, y+3, 5, 5);
    }
    
	//Width mutator.
	public void setW (int width)
	{
		w = width;
	}
	
	//Height mutator.
	public void setH (int height)
	{
		h = height;
	}
	
	//Color mutator.
	public void setColor (Color shade)
	{
		color = shade;
	}
	
	//X mutator.
	public void setX  (int upperX)
	{
		x = upperX;
	}
	
	//Y mutator.
	public void setY  (int upperY)
	{
		y = upperY;
	}

	//Width accessor.
	public int getW ()
	{
		return w;
	}
	
	//Height accessor.
	public int getH ()
	{
		return h;
	}
	
	//Color accessor.
	public Color getColor ()
	{
		return color;
	}
	
	
	// X accessor.
	public int getX ()
	{
		return x;
	}
	
	
	// Y accessor.
	public int getY ()
	{
		return y;
	}
}