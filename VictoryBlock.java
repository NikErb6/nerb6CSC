//Victory Block class that takes in a position and color
//by Nik Erb

import java.util.*;

public class VictoryBlock extends Block
{
   protected int xpos;
   protected int ypos;
   protected String color
   
   public VictoryBlock(int xpos_in, ypos_in, String color_in)
   {
      super(xpos_in, ypos_in, color_in);
      color = "red";
   }
}