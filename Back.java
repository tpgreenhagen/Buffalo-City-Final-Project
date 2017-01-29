//package GraphicsRepo.CityProject;

import java.awt.*;

/**
 * Back Class (Background Class)
 * Tanner Greenhagen
 * 1/27/17
 * This will set background rectangles
 */
public class Back
{
    
    //Initialize background attributes
     private int height;
    private int width;
    private Color color;
    private int x;
    private int y;
     Graphics2D g2;
     
     /**
     * Back Constructor
     * Sets the x-cord, y-cord, color, width, height
     */
    public Back(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Draw
     * Actually draws the picture
     */  
    public void draw(Graphics page){
        g2 = (Graphics2D) page;
        
        
            Rectangle box = new Rectangle(x,y,width,height);
            g2.setColor(this.color);
            g2.fill(box);
        }


    }
    


