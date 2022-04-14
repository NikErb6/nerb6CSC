/*player class that takes in position and color and moves based 
on keyboard inputs and senses collision with other blocks*/
//By Nik Erb

import java.util.*;

public class ProjectPlayer extends GameObject
{
   public ProjectPlayer(int xpos_in, int ypos_in, String color_in) 
   {
      super(xpos_in, ypos_in, color_in);
      
   }
   
   public static boolean isOnGround(ArrayList<ArrayList<Integer>> mapData_in)
   {
      //if bottom equals top
      return true;
      //else
      return false;
   }
   
   public static boolean move(int xdirect, int ydirect, ArrayList<ArrayList<Integer>> mapData_in)
   {
      //if move was successful
      return true;
      //if move was not
      return false;
   }
   
   public static boolean collides(GameObject_in)
   {
      super(GameObject_in);
   }
      
   
}
      