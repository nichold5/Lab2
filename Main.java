class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
 
 // avg total
int avgTotalM = 55 * 10;

 // M&M Colors
double blueM = avgTotalM * .24;
double brownM = avgTotalM * .13;
double greenM = avgTotalM * .16;
double orangeM = avgTotalM * .20;
double redM = avgTotalM * .13;
double yellowM = avgTotalM * .14;

double sumM = blueM + brownM + greenM + orangeM + redM + yellowM;

    // main method 
  
      
  
        // convert into int 
 int valueBlue = (int)Math.round(blueM); 
 int valueBrown = (int)Math.round(brownM);
 int valueGreen = (int)Math.round(greenM);
 int valueOrange = (int)Math.round(orangeM);
 int valueRed = (int)Math.round(redM);
 int valueYellow = (int)Math.round(yellowM);
 int valueSumM = (int)Math.round(sumM);


    

// system print outputs 
System.out.println("Average Blue M&Ms:" + valueBlue);
System.out.println("Average Brown M&Ms:" + valueBrown);
System.out.println("Average Green M&Ms:" + valueGreen);
System.out.println("Average Orange M&Ms:" + valueOrange);
System.out.println("Average Red M&Ms:" + valueRed);
System.out.println("Average Yellow M&Ms:" + valueYellow);

System.out.println("Sum of M&Ms:" + valueSumM);


if (valueBlue > valueBrown && valueGreen > valueOrange)
      System.out.println("Blue over Brown and Green over Orange");
if (valueBrown <= valueRed)
      System.out.println("Brown is less than or equal to Red");
    
if (valueSumM == avgTotalM)
      System.out.println("Numbers Match");
  }

}