import java.util.ArrayList;

public class Leaf{
     private String color;
     private String shape;
     
     public Leaf(){
          color = "green";
          shape = "leaf-like";
     }
     public Leaf(String colorIn, String shapeIn){
          color = colorIn;
          shape = shapeIn;
     }
     public Leaf(Leaf leafIn){
          color = leafIn.getColor();
          shape = leafIn.getShape();
     }
     
     public void setColor(String colorIn){
          color = colorIn;
     }
     public String getColor(){
          return color;
     }
     
     public void setShape(String shapeIn){
          shape = shapeIn;
     }
     public String getShape(){
          return shape;
     }
     
     public boolean equals(Leaf in){
          
      if(color.equals(in.getColor()))
              if(shape.equals(in.getShape()))
                      return true;
      return false;
          
     }
     
     public String toString(){
          return ""+ color+ " " + shape;
     }
     
     
     
}