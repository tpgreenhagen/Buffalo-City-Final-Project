import java.awt.*;

/**
 * Windows Class
 * Tanner Greenhagen
 * 1/27/17
 * This will put the windows on the buildings in certain locations
 */
public class Windows
{
    
    //Intialize the window attributes
    private int x;
    private int y;
    private char let;
    private int height;
    private int width;
    Color color;
    Graphics2D g2;
    Color white = new Color(255,215,0);
    Color black = new Color(32,32,32);
    
    /**
     * Windows Constructor
     * Sets the x-cord, y-cord, color, width, height, letter
     */
    public Windows(int x, int y,  Color c,  int w, int h, char l){
        this.x = x;
        this.y = y+h-50;
        this.let = l;
        this.height = 700-h;
        this.width = w;
        this.color = c;
    }
    
    /**
     * Windows Setter
     * Sets the x-cord, y-cord, color, width, height, letter
     */
    public void set(int x, int y, Color c, int w, int h, char l){
        this.x = x;
        this.y = y+h-50;
        this.let = l;
        this.height = 700-h;
        this.width = w;
        this.color = c;

    }
   
    /**
     * draw
     * This will put the windows into the arrangements of letters
     */
    public void draw(Graphics page){
        g2 = (Graphics2D) page;
        
        //Depending on what letter is sent in, a different if statement is executed
        if (this.let == 'b'){
            

            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across;
            
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
            
                    g2.fill(box);
                    if (num == number || (num == 1 && x2 == x)){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                
                
                 if (num == 1 && x2 == x){
                    x2 = width+x-35;
                    num = number-1;
                    y2 = y;
                    
                
                
                }
                y2+=25;
                    num--;
                    
               
                
                
                
                }
           
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac+1)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (ac == 0){
                        box = new Rectangle(x2+5,y2+5,20+(width-(x2+25)),20);
                        g2.setColor(color);
                        g2.fill(box);
                    }
                    else 
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
            
    
    }
    
     if (this.let == 'u'){
    
            int x2 = x;
            int y2 = y;
            int number = height/30;
            int num = number;
            int across = width/30;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                 
                    g2.setColor(white);
                    if (y2  < 520){
                    g2.fill(box);}
                    if ((num == 1 && x2 == x)){
                        while (ac > 0){
                     box = new Rectangle(x2+10,y2-45,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                     if (num == 1 && x2 == x){
                    x2 = width+x-35;
                    num = number-1;
                    y2 = y-25;
                    
                
                
                }
                y2+=25;
                    num--;
    
    
    
                }
    }
    
     if (this.let == 'f'){
    
            int x2 = x;
            int y2 = y;
            int number = height/30;
            int num = number;
            int across = width/30;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                 
                    g2.setColor(white);
                    if (y2  < 550){
                    g2.fill(box);}
                    if ((num == number && x2 == x)){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;

                }
                    y2+=25;
                    num--;
    
    
    
                }
                
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac+1)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (ac == 0){
                        box = new Rectangle(x2+5,y2+5,20+(width-(x2+25)),20);
                        g2.setColor(color);
                        g2.fill(box);
                    }
                    else 
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
    }
    
     if (this.let == 'a'){
    
            int x2 = x;
            int y2 = y;
            int number = height/30;
            int num = number;
            int across = width/30;
            int ac = across-1;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+30,20,20);
                 
                    g2.setColor(white);
                    if (y2  < 490){
                    g2.fill(box);}
                    if (num == number ){
                        while (ac > 0){
                     box = new Rectangle(x2+20,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                else if  (num == 1 && x2 == x){
                        while (ac > 0){
                     box = new Rectangle(x2+10,y2-45,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                
                
                }
                     if (num == 1 && x2 == x){
                    x2 = width+x-35-15;
                    num = number-1;
                    y2 = y-25;
                    
                
                
                }
                y2+=25;
                    num--;
    
    
    
                }
    }
    
    
     if (this.let == 'l'){
    
            int x2 = x;
            int y2 = y;
            int number = height/30;
            int num = number;
            int across = width/30;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                 
                    g2.setColor(white);
                    if (y2  < 520){
                    g2.fill(box);}
                    if ((num == 1 && x2 == x)){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2-20,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                
                y2+=25;
                    num--;
    
    
    
                }
    }

    if (this.let == 'o'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across+1;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                if (y2  < 550){
                    g2.fill(box);}
                    if (num == number ){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across+1;
                }
                if(num == 1 && x2 == x){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2-20,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across+1;
                }
                
                 if (num == 1 && x2 == x){
                    x2 = width+x-35;
                    num = number-1;
                    y2 = y;
                    
                
                
                }
                y2+=25;
                    num--;
                    
               
                
                
                
                }
            }
            
            
     if (this.let == 'i'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across+1; 
            int half = (ac/2)*25;
            int x3 = x2+ half;
            
             while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
                x2 = x;
                 while(num > 0){
                    Rectangle box = new Rectangle(x3+5,y2+5,20,20);
                    g2.setColor(white);
                    if (y2  < 550){
                    g2.fill(box);}
                    
                     y2+=25;
                    num--;
                }
                ac = across +1;
                y2-=50;
                 while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
        }
          
        
         if (this.let == 's'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number/2+1;
            int across = width/30+1;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                if (y2  < 550){
                    g2.fill(box);}
                    if (num == (number/2+1)){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }

                
                
                 if (num == 1 && x2 == x){
                    x2 = width+x-25;
                    num = number/2+1;

                }
                else if (num == 1 && x2 == width+x-25){
                    x2 = x;
                    num = number/2+1;
                           while (ac > 0){
                     box = new Rectangle(x2+5,y2-20,20,20);
                    g2.setColor(white);
                    
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }

                }
                y2+=25;
                    num--;
                    
               
                
                
                
                }
           
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                     
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
            
    
    }
    
     if (this.let == 'e'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30+1;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                if (y2  < 550){
                    g2.fill(box);}
                    
                    if (num == number ){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                
                    if (num == 1 && x2==x){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2-20,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }

                
                
                 if (num == 1 && x2 == x){
                    x2 = width+x-30;
                    num = number/2+1;
                    y2 = y-25;

                }
               
                y2+=25;
                    num--;
                    
               
                
                
                
                }
           
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac-1)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                     if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
            
    
    }
    
     if (this.let == 'r'){
    
            int x2 = x;
            int y2 = y;
            int number = height/30;
            int num = number;
            int across = width/30;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                 
                    g2.setColor(white);
                    if (y2  < 550){
                    g2.fill(box);}
                    if ((num == number && x2 == x)){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;

                }
                    y2+=25;
                    num--;
    
    
    
                }
            }
            
            
             if (this.let == 't'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across+1; 
            int half = (ac/2)*25;
            int x3 = x2+ half;
            int half2 = (num/2)*15;
            
                 while(num > 0){
                    Rectangle box = new Rectangle(x3+5,y2+5,20,20);
                    g2.setColor(white);
                    if (y2  < 550){
                    g2.fill(box);}
                    
                     y2+=25;
                    num--;
                }
                
                y2 = half2+y;
                 //Middle Line
                while ((ac+1)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (ac == 0){
                        box = new Rectangle(x2+5,y2+5,20+(width-(x2+25)),20);
                        g2.setColor(color);
                        g2.fill(box);
                    }
                    else 
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
              
        }
        
        
         if (this.let == 'h'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30+1;
            int ac = across;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                if (y2  < 550){
                    g2.fill(box);}
                   

                
                
                 if (num == 1 && x2 == x){
                    x2 = width+x-30;
                    num = number/2+1;
                    y2 = y+height/2-75;

                }
                
                y2+=25;
                    num--;
                    
               
                
                
                
                }
           
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                     
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
            
    
    }
    
    
      if (this.let == 'E'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30+1;
            int ac = across;
            int half2 = (num/2)*25;
            while(num > 0){
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                if (y2  < 550){
                    g2.fill(box);}
                    if (num == number){
                        while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    if (x2 < x+this.width)
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                 ac = across;
                }
                
                 if (num == 1 ){
                
                    x2 = x;
                    
                           while (ac > 0){
                     box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    
                    g2.fill(box);
                    x2+=25;
                    ac--;
                 }
                 x2 = x;
                }
                y2+=25;
                    num--;
                    
               
                
                
                
                }
           
                num = number;
                ac = across;
                x2 = x;
                y2 = y+height/2-50;
                
                //Middle Line
                while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                     
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
            
    
    }
    
     if (this.let == 'T'){
            
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across+1; 
            int half = (ac/2)*25;
            int x3 = x2+ half;
            
             while ((ac)>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    g2.setColor(white);
                    g2.fill(box);
                    x2+=25;
                    ac--;
                
                }
                x2 = x;
                 while(num > 0){
                    Rectangle box = new Rectangle(x3+5,y2+5,20,20);
                    g2.setColor(white);
                    if (y2  < 550){
                    g2.fill(box);}
                    
                     y2+=25;
                    num--;
                }
        }
        
        //Runs for a building not set as a letter
        if (this.let == 'x'){
        
            int x2 = x;
            int y2 = y;
            int number = height/30-1;
            int num = number;
            int across = width/30;
            int ac = across;
            
            while(num > 0){
            
                while(ac>0){
                
                    Rectangle box = new Rectangle(x2+5,y2+5,20,20);
                    
                    int col = (int)(Math.random()*2);
                    if (col== 0){
                    g2.setColor(white);}
                    else 
                    g2.setColor(black);
                    if (y2  < 550){
                    g2.fill(box);}

                    ac--;
                    x2+=25;
                }
            
                ac = across;
      
                num--;
                y2+=25;
                x2=x;
            
            }

        }
    
}
}