//Gregory Carroll
//Mock
//AP Literature/Composition
//5 November 2018

//Senior Project Event 5 Program

public class Thermal_Expansion_Runner{
  public static void main(String[] args){
    Thermal_Expansion object = new Thermal_Expansion();
    boolean endco = true;
    while(endco){
      int x = object.endCondition();
      if (x == 1){
        System.out.println("You entered 1 for a material with one fixed end.");
        endco = false;
        boolean matty = true;
        while(matty){
          int y = object.materialType();
          if (y == 1){
            System.out.println("You entered 1 for Aluminium.");
            matty = false;
            double therm = object.thermalDisp(y);
            if (therm == -1.0){
              System.out.println("Material has exceeded melting point.");
            }
          }
          else if (y==2){
            System.out.println("You entered 2 for Carbon Steel.");
            matty = false;
            double therm = object.thermalDisp(y);
            if (therm == -1.0){
              System.out.println("Material has exceeded melting point.");
            }
          }
          else {
            System.out.println("Enter valid number for material.");
          }
        }
      }
      else if (x == 2){
        System.out.println("You entered 2 for a material with two fixed ends.");
        endco = false;
        boolean matty = true;
        while(matty){
          int y = object.materialType();
          if (y == 1){
            System.out.println("You entered 1 for Aluminium.");
            matty = false;
            double therm = object.thermalStress(y);
            if (therm == -1.0){
              System.out.println("Material has exceeded melting point.");
            }
          }
          else if (y==2){
            System.out.println("You entered 2 for Carbon Steel.");
            matty = false;
            double therm = object.thermalStress(y);
            if (therm == -1.0){
              System.out.println("Material has exceeded melting point.");
            }
          }
          else {
            System.out.println("Enter valid number for material.");
          }
        }
      }
      else {
        System.out.println("Enter valid number of fixed ends.");
      }
    }
  }
}