import java.text.DecimalFormat;
public class NSidedPolygon
{
   private int sides;
   private double length;
   private String name;
   
   //constructor
   public NSidedPolygon(int sides, double length)
   {
      this.sides = sides;
      this.length = length;
      setPolyName();
   }
   
   //sets the name of a polygon
   private void setPolyName()
   {
      switch(sides)
      {
         case 3:
            name = "Triangle";
            break;
         case 4:
            name = "Quadrilateral";
            break;
         case 5:
            name = "Pentagon";
            break;
         case 6:
            name = "Hexagon";
            break;
         case 7:
            name = "Heptagon";
            break;
         case 8:
            name = "Octagon";
            break;
         case 9:
            name = "Nonagon";
            break;
         case 10:
            name = "Decagon";
            break;  
      }//end of switch statement
   }//end of setPolyName()
   
   //calculate the perimeter
   private double perimeter()
   {
      return sides * length;
   }
   
   //calculate the area
   private double area()
   {
      return(sides * Math.pow(length, 2)) / (Math.tan(Math.PI / sides) * 4);
   }
   
   //toString method to output information
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("0.###");
      return "Name: " + name + "\t\t\t" + 
             "Length of side: " + length + "\t\t" + 
             "Perimeter: " + fmt.format(perimeter()) + "\t\t" + 
             "Area: " + fmt.format(area());
   }
}
