//package GraphicsRepo.CityProject;



/**
 *Buildings Class
 *Tanner Greenhagen
 *1/27/17
 *This program set the attributes of the buildings
 */

import java.awt.*;

public class Buildings
{
    //Initialize building variables
    private int height;
    private int width;
    private Color color;
    private int x;
    private int y;
    private static int round = 1;
    
    Graphics2D g2;

    /**
     * Building Constructor
     * Sets the x-cord, y-cord, color, width, height
     */
    public Buildings(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;
    }

    /**
     * Building Setter
     * Sets the x-cord, y-cord, color, width, height
     */
    public void set(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;

    }

    /**
     * setRound
     * Sets the round(really useless actually)
     */
            public void setRound(int r){
        
                this.round = r;}
                
    /**
     * Draw
     * Actually draws the picture
     */            
    public void draw(Graphics page){
        
        g2 = (Graphics2D) page;
   
        if (round == 1){
            Rectangle box = new Rectangle(x,y+height-50,width,600-height);
            g2.setColor(this.color);
            g2.fill(box);
        }


    }

}
