//block class that takes in position and color
//by Nik Erb

import java.util.*;

public class Block extends GameObject
{
   protected int xpos;
   protected int ypos;
   protected String color;
   
   public Block(int xpos_in, int ypos_in, String color_in)
   {
      super(xpos_in, ypos_in, color_in);
   }
}
      