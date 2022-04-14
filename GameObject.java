//Game Object class that detects collisions and draws game pieces
//By Nik Erb

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameObject 
{
   protected int xpos;
   protected int ypos;
   protected String color;
   
   public GameObject(int xpos_in, int ypos_in, String color_in)
   {  
      xpos = xpos_in;
      ypos = ypos_in;
      color = color_in;
   }
   
   public static boolean collides(GameObject_in)
   {
   //if both objects are the same, return tru
      if this.GameObject().equals(GameObject_in())
      {
         return false;
      }
      e
      else
      //if sides collide then return true and if not then return false
      {
         int topthis = this.ypos-12;
         int bottomthis = this.ypos+12;
         int leftthis = this.xpos-12;
         int rightthis = this.xpos+12;
         int topother = ypos-12;
         int bottomother = ypos+12;
         int leftother = xpos-12;
         int rightother = xpos+12;
         
         return !((bottomthis < topother) || (topthis > bottomother) || (leftthis > rightother) || (rightthis < leftother))
         
      }
   }
   public void color(Graphics g)
   {
      if (color.equals("blue"))
      {
         g.setColor(Color.BLUE);
      }
      else if (color.equals("red"))
      {
         g.setColor(Color.RED);
      }
      else if (color.equals("green"))
      {
         g.setColor(Color.GREEN);
      }
   }
   
   public void draw(Graphics g)
   {
   //create square from upper left corner
      color(g);
      g.fillRect(xpos-12,ypos-12,25,25);
   }
   
   public int getXpos()
   {
      return xpos;
   }
   
   public int getYpos();
   {
      return ypos;
   }
   
}
      