import java.awt.MouseInfo; 
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.AWTException;
/**
 * Write a description of class robotMouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robotMouse
{
    private void waitTime(int seconds){
      try {
        Thread.sleep(seconds);                 
      } 
      catch(InterruptedException ie) {
        System.out.print("Please consult Max, program isn't functioning properly: ie");
      }
   }
    public void moveMouse(int h, int w){
       int nex = 0;
       int speed = 0;
       while(true){
           int x = MouseInfo.getPointerInfo().getLocation().x; int y = MouseInfo.getPointerInfo().getLocation().y;
           if(nex != x || y > h - 120){
               speed = 0;
           }
           
           //int x = MouseInfo.getPointerInfo().getLocation().x; int y = MouseInfo.getPointerInfo().getLocation().y;
            robotMouse(x,y+speed);
            waitTime(50);
            nex = x;
            speed++;
        }
   }
   
   private void robotMouse(int x, int y){
       try{
            Robot robot = new Robot();
            robot.mouseMove(x, y);
        }
        catch(AWTException awte){
            System.out.println("Please consult Max, program isn't functioning properly: awtE");
        }
   }
}
