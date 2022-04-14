//Frame class for project 
//by Nik Erb

import java.util.*;

public class Project extends JFrame
{
   public Project()
   {
      super("Project");
      Container contents = getContentPane();
      contents.add(new MainPanel());
      
      setSize(832,655);
      setViisible(true);
   }
   
   public static void main(String[] args)
   {
      Project theFrame = new Project();
      theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
