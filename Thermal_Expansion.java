//Gregory Carroll
//Mock
//AP Literature
//5 November 2016

//Senior Project Event 5 Program

import java.util.Scanner;

public class Thermal_Expansion {
  public int endCondition(){
    System.out.println("Is the material fixed on one or two ends?");
    System.out.println("If one end, enter 1. If two ends, enter 2.");
    Scanner temp = new Scanner(System.in);
    int x = temp.nextInt();
    return x;
  }
  
  public int materialType(){
    System.out.print("If the material is Aluminium, enter 1.");
    System.out.println(" If the material is Carbon Steel, enter 2.");
    Scanner temp = new Scanner(System.in);
    int x = temp.nextInt();
    return x;
  }
  
  public double thermalDisp(int mat){
    System.out.println("Enter the initial length in meters.");
    Scanner temp = new Scanner(System.in);
    double x = temp.nextDouble();
    
    if (mat == 1){
      double a = 23.1 * Math.pow(10,-6);
      System.out.println("Enter the initial temperature in Celcius.");
      double y = temp.nextDouble();
      if (y >= 660.3){
        return -1.0;
      }
      
      System.out.println("Enter the final temperature in Celcius.");
      double z = temp.nextDouble();
      if (z >= 660.3){
        return -1.0;
      }
      
      double displace = x*(z-y)*a;
      System.out.println("The thermal expansion of this system is " + displace + " meters.");
      return displace;
    }
    else {
      double a = 11.7 * Math.pow(10,-6);
      System.out.println("Enter the initial temperature in Celcius.");
      double y = temp.nextDouble();
      if (y >= 1370){
        return -1.0;
      }
      
      System.out.println("Enter the final temperature in Celcius.");
      double z = temp.nextDouble();
      if (z >= 1370){
        return -1.0;
      }
      double displace = x*(z-y)*a;
      System.out.println("The thermal expansion of this system is " + displace + " meters.");
      return displace;
    }
  }
  
  public double thermalStress(int mat){
    System.out.println("Enter the initial length in meters.");
    Scanner temp = new Scanner(System.in);
    double x = temp.nextDouble();
    
    if (mat == 1){
      double a = 23.1 * Math.pow(10,-6);
      System.out.println("Enter the initial temperature in Celcius.");
      double y = temp.nextDouble();
      if (y >= 660.3){
        return -1.0;
      }
      
      System.out.println("Enter the final temperature in Celcius.");
      double z = temp.nextDouble();
      if (z >= 660.3){
        return -1.0;
      }
      
      System.out.println("Enter the cross-sectional area in meters squared.");
      double b = temp.nextDouble();
      
      double stress = (z-y)*a*72400000000.0;
      double force = stress * b;
      System.out.println("The internal resultant normal force due to thermal stress is " + force + " Newtons.");
      System.out.println("The average normal stress of this system is " + stress + " Pascals.");
      if (stress >= 414000000){
        System.out.println("Thermal stress has exceeded yield strength.");
      }
      return stress;
    }
    else {
      double a = 11.7 * Math.pow(10,-6);
      System.out.println("Enter the initial temperature in Celcius.");
      double y = temp.nextDouble();
      if (y >= 1370){
        return -1.0;
      }
      
      System.out.println("Enter the final temperature in Celcius.");
      double z = temp.nextDouble();
      if (z >= 1370){
        return -1.0;
      }
      
      System.out.println("Enter the cross-sectional area in meters squared.");
      double b = temp.nextDouble();
      
      double stress = (z-y)*a*200000000000.0;
      double force = stress * b;
      System.out.println("The internal resultant normal force due to thermal stress is " + force + " Newtons.");
      System.out.println("The average normal stress of this system is " + stress + " Pascals.");
      if (stress >= 250000000){
        System.out.println("Thermal stress has exceeded yield strength.");
      }
      return stress;
    }
  }
}
    