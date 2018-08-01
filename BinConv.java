/**
 * Used in SwingBinConv program. These are conversion routines for binary(base2) and decimal(base10) notation.
 * 
 * @author  C. Stewart
 * @version 1.0
 * @since   24-07-2018
 * 
 */ 
class BinConv {

  /**
   * This is a convertDecToBin method which converts a given decimal string to binary notation.
   * @param in A string containing the input decimal string.
   * @return String containing the converted binary string.
   * @throws NumberFormatException
   */
   public String convertDecToBin(String in) throws NumberFormatException{
   
      int i;
      String out = null;
   
      i = Integer.parseInt(in);
      out = Integer.toBinaryString(i);
      
      return(out);     
   } //End convert

   /**
    * convertBinToDec takes an input binary string and converts it into a decimal string before returning it.
    * If a NumberFormatException is from then a stacktrace is shown.
    * @return String containing converted decimal string.
    * @throws NumberFormatException
    */
   public String convertBinToDec(String in) throws NumberFormatException {
     
     int i;
     String out = null;
     
     i = Integer.parseInt(in, 2);
     out = Integer.toString(i, 10);
     
     return(out);
   } // End convertBinToDec
 
} // End BinConv

class BinConvTestDrive {

  /**
   * This is the main method which is the program entry point. In this case the program entry point is used for testing
   * purposes only since this file contains low level classes and functions used by other programs.
   * @param args [0] contains a decimal string for conversion into a binary format.
   */
   public static void main(String[] args) {
      BinConv myConv = new BinConv();

      String result = myConv.convertDecToBin(args[0]);
      System.out.println(args[0] + " in binary is: " + result);
      
      String decResult = myConv.convertBinToDec(result);
      System.out.println(result + " in decimal is: " + decResult);
   } // End main

} // End BinConvTestDrive