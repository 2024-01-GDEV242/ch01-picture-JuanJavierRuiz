/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square ground;
    private Square sky;
    private Person guy;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        ground = new Square();
        sky = new Square();
        guy = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.moveHorizontal(-320);
            sky.moveVertical(-320);
            sky.changeSize(510);
            sky.makeVisible();
            
            wall.changeColor("yellow");
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeColor("red");
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("white");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            ground.changeColor("green");
            ground.moveHorizontal(-320);
            ground.moveVertical(130);
            ground.changeSize(510);
            ground.makeVisible();
            drawn = true;
            
            guy.changeColor("black");
            guy.moveHorizontal(30);
            guy.moveVertical(18);
            guy.changeSize(60,30);
            guy.makeVisible();
            drawn = true;
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        guy.changeColor("black");
        ground.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        wall.changeColor("yellow");
        window.changeColor("black");
        roof.changeColor("red");
        sun.changeColor("white");
        guy.changeColor("black");
        ground.changeColor("green");
    }
}
