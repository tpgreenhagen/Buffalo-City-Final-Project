//package GraphicsRepo.CityProject;


import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.applet.Applet;

/**
 * Class City_Viewer 
 * Tanner Greenhagen
 * 1/27/17
 * This will display some buildings and windows
 */
public class City_Viewer extends Applet //implements MouseListener
{
    
    //Set applet window size
   private final int APPLET_WIDTH = 1000;
   private final int APPLET_HEIGHT = 700;
   
   //Initialize building data
   private int x = 10;
   private int y = 0;
   private int w = 120;
   private int h = 300;
   private int run = 1;
   
   //Set colors
   Color blue = new Color(70,130,180);
   Color red = new Color(208,34,34);
   Color white = new Color(245,230,230);
   Color sky = new Color(25,25,112);
   Color grass = new Color(144,238,144);
   Color text = new Color(220,220,220);

   //Initialize objects of the building, window, and background class
   Buildings building1,building2,building3,building4,building5,building6,building7;
   Buildings reset, reset2;
   Back ground;
   Windows window1,window2,window3,window4,window5,window6,window7;
   
   //Initailize picture
   Image pic;

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first
     * time that the start method is called.
     */
    public void init()
    {
        
        //Set building objects to values
        //x-cord, y-cord, color, width, height
         building1 = new Buildings(x,y,blue,w,h+50);
         building2 = new Buildings(x+=(w+20),y,white,w,h+100);
         building3 = new Buildings(x+=(w+20),y,red,w,h);
         building4 = new Buildings(x+=(w+20),y,red,w,h);
         building5 = new Buildings(x+=(w+20),y,blue,w,h+150);
         building6 = new Buildings(x+=(w+20),y,white,w,h+50);
         building7 = new Buildings(x+=(w+20),y,blue,w-10,h+150);
         
         //Reset building data
                     x = 10;
            y=0;
            w= 120;
            
         //Set window objects to values
         //x-cord, y-cord, color, width, height, letter
         window1 = new Windows(x,y,blue,w,h+50,'b');
         window2 = new Windows(x+=(w+20),y,white,w,h+100,'u');
         window3 = new Windows(x+=(w+20),y,red,w,h,'f');
         window4 = new Windows(x+=(w+20),y,red,w,h,'f');
         window5 = new Windows(x+=(w+20),y,blue,w,h+150,'a');
         window6 = new Windows(x+=(w+20),y,white,w,h+50,'l');
         window7 = new Windows(x+=(w+20),y,blue,w-10,h+150,'o');
         
        //Set data for big boxes
          reset = new Buildings(0,0,sky,1000,0);
          reset2 = new Buildings(0,300,sky,1000,0);
          ground = new Back(0,550,grass,1000,150);
          
          //Get the picture
          pic = getImage(getDocumentBase(), ("data//buffa.jpg"));
          
          
         
          //Set background
        setBackground (sky);
        
        //Set applet height
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }



   

    /**
     * Paint method for applet.
     *
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
       
   
      
            //Draw buidlings, windows, and ground
            ground.draw(page);
            building1.setRound(1);
            building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
            
            window1.draw(page);
            window2.draw(page);
            window3.draw(page);
            window4.draw(page);
            window5.draw(page);
            window6.draw(page);
            window7.draw(page);
        
            //Reset values
            x = 10;
            y=0;
            w= 130;

            //Set buidlings and windows
         building1.set(x,y,blue,w,h+50);
         building2.set(x+=(w+70),y,white,w,h+100);
         building3.set(x+=(w+70),y,red,w,h);
         building4.set(x+=(w+70),y,red,w,h);
         building5.set(x+=(w+70),y,blue,w,h+50);
         building6.set(x+=(w+20),y,white,0,700);
         building7.set(x+=(w+20),y,blue,0,700);
         
         //Reset values
            x = 10;
            y=0;
            w= 130;
            
            
            window1.set(x,y,blue,w,h+50,'b');
            window2.set(x+=(w+70),y,white,w,h+100,'i');
            window3.set(x+=(w+70),y,red,w,h,'l');
            window4.set(x+=(w+70),y,red,w,h,'l');
            window5.set(x+=(w+70),y,blue,w,h+50,'s');
            window6.set(x+=(w+20),y,white,0,700,'z');
            window7.set(x+=(w+20),y,blue,0,700,'z');
   
            //Pause for 1.5 seconds
         try{Thread.sleep(1500);}
            catch(InterruptedException e){};
            
            //Reset the page
            reset.draw(page);
            
            //Draw buidlings and windows
            building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
            
            window1.draw(page);
            window2.draw(page);
            window3.draw(page);
            window4.draw(page);
            window5.draw(page);
            window6.draw(page);
            window7.draw(page);

            //Reset values
                x = 10;
                y=0;
                w= 120;
    
                //Set buidlings and windows
             building1.set(x,y,blue,w,h+150);
             building2.set(x+=(w+20),y,white,w,h+150);
             building3.set(x+=(w+20),y,red,w+10,h+150);
             building4.set(x+=(w+150),y,red,w+10,h+50);
             building5.set(x+=(w+20),y,blue,w+10,h+50);
             building6.set(x+=(w+20),y,white,w+10,h+150);
             building7.set(x+=(w+20),y,blue,0,700);

             //Reset values
               x = 10;
                y=0;
                w= 120;
                
             window1.set(x,y,blue,w,h+150,'a');
             window2.set(x+=(w+20),y,white,w,h+150,'r');
             window3.set(x+=(w+20),y,red,w+10,h+150,'e');
             window4.set(x+=(w+150),y,red,w+10,h+50,'t');
             window5.set(x+=(w+20),y,blue,w+10,h+50,'h');
             window6.set(x+=(w+20),y,white,w+10,h+150,'e');
             window7.set(x+=(w+20),y,blue,0,700,'z');
  
             //Pause for 1.5 seconds
              try{Thread.sleep(1500);}
            catch(InterruptedException e){};
            
           //Reset the page
            reset.draw(page);
            
            //Draw buidlings and windows
            building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
            
            window1.draw(page);
            window2.draw(page);
            window3.draw(page);
            window4.draw(page);
            window5.draw(page);
            window6.draw(page);
            window7.draw(page);

            //Reset values
            x = 10;
            y=0;
            w= 150;
            h-=50;
            
           
            //Set buidlings and windows
         building1.set(x,y,red,w,h);
         building2.set(x+=(w+40),y,white,w,h);
         building3.set(x+=(w+40),y,red,w,h);
         building4.set(x+=(w+40),y,white,w+30,h);
         building5.set(x+=(w+40),y,blue,0,700);
         building6.set(x+=(w+20),y,blue,0,700);
         building7.set(x+=(w+20),y,blue,0,700);
         
         //Reset values
          x = 10;
            y=0;
       
            
             window1.set(x,y,red,w,h, 'b');
             window2.set(x+=(w+40),y,white,w,h,'E');
             window3.set(x+=(w+40),y,red,w,h,'s');
             window4.set(x+=(w+40),y,white,w+30,h,'T');
             window5.set(x+=(w+40),y,blue,0,700,'z');
             window6.set(x+=(w+20),y,blue,0,700,'z');
             window7.set(x+=(w+20),y,blue,0,700,'z');
         
             //Pause for 1.5 seconds
            try{Thread.sleep(1500);}
            catch(InterruptedException e){};
            
            //Reset the page
            reset.draw(page);
            
            //Draw buidlings and windows
             building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
         
             window1.draw(page);
            window2.draw(page);
            window3.draw(page);
            window4.draw(page);
            window5.draw(page);
            window6.draw(page);
            window7.draw(page);
            
            //Pause for 1.5 seconds
             try{Thread.sleep(1500);}
            catch(InterruptedException e){};
            
             //Reset the page
            reset.draw(page);
            
            //Reset values
            x = 10;
            y=0;
            w= 120;
            h = 300;
            
             //Set buidlings and windows
         building1.set(x,y,blue,w,h);
         building2.set(x+=(w+20),y,white,w,h+50);
         building3.set(x+=(w+20),y,red,w,h+75);
         building4.set(x+=(w+20),y,blue,w,h+100);
         building5.set(x+=(w+20),y,red,w,h+75);
         building6.set(x+=(w+20),y,white,w,h+50);
         building7.set(x+=(w+20),y,blue,w,h);
         
         //Reset values
          x = 10;
            y=0;
            w= 120;
            h = 300;
            
         window1.set(x,y,blue,w,h,'x');
         window2.set(x+=(w+20),y,white,w,h+50,'x');
         window3.set(x+=(w+20),y,red,w,h+75,'x');
         window4.set(x+=(w+20),y,blue,w,h+100,'x');
         window5.set(x+=(w+20),y,red,w,h+75,'x');
         window6.set(x+=(w+20),y,white,w,h+50,'x');
         window7.set(x+=(w+20),y,blue,w,h,'x');

         
         //Draw buidlings and windows
            building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
         
            window1.draw(page);
            window2.draw(page);
            window3.draw(page);
            window4.draw(page);
            window5.draw(page);
            window6.draw(page);
            window7.draw(page);
            
            //Initialize picture values
            int xp = 0;
          int yp = 0;
          
          //Set text color
          page.setColor(text);
          
          //Draw picture
           page.drawImage(pic, xp,yp, this); 
           
           //Set font
          page.setFont(new Font("TimesRoman", Font.PLAIN, 40));
          
          //Draw the text
          page.drawString("Buffalo Bills 2017-2018 Record",250,150);
          
          //Sleep for 2 seconds
          try{Thread.sleep(2000);}
                catch(InterruptedException e){};
      
                //Reset image
            reset.draw(page);
            
            //Loop through 19 times for 19 games for a perfect season
          for (int i = 0; i<=19;i++){
              
              //Set text size and color and display it
              page.setColor(text);
              page.setFont(new Font("TimesRoman", Font.PLAIN, 40));
              page.drawString("2017-2018 Record:",280,210);
              page.setFont(new Font("TimesRoman", Font.PLAIN, 50));
              page.drawString("Super Bowl LII",650,210);
              page.setFont(new Font("TimesRoman", Font.PLAIN, 35));
              page.drawString(i+"-0",310,250);
              
              //Display pic and move it over to the right
              page.drawImage(pic, xp,yp, this);  
                xp +=40;
                
                //Windows change color 4 times per picture move
              for(int j = 0; j<3;j++){
                reset2.draw(page);
                ground.draw(page);
                building1.draw(page);
                building2.draw(page);
                building3.draw(page);
                building4.draw(page);
                building5.draw(page);
                building6.draw(page);
                building7.draw(page);
             
                window1.draw(page);
                window2.draw(page);
                window3.draw(page);
                window4.draw(page);
                window5.draw(page);
                window6.draw(page);
                window7.draw(page);
                
                //Pause for half a second
                 try{Thread.sleep(500);}
                catch(InterruptedException e){};
            }
                
            //Reset picture
                reset.draw(page);
            
        }
        
        //Set text size and color
         page.setColor(text);
        page.setFont(new Font("TimesRoman", Font.PLAIN, 60));
        
        //Display text
          page.drawString("Buffalo Bills are your",150,150);
          page.drawString("2018 Super Bowl Champions",150,450);
        
       
   
    }
   
}
