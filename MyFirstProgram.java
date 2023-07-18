// import java.util.*;
// public class MyFirstProgram {
//   public static void main(String[] args){
// // System.out.println("Hello World");
// // System.out.print("Hello World\n");
// // System.out.print("Hello World");
// /////*****/////
// // System.out.println("*");
// // System.out.println("**");
// // System.out.println("***");
// // System.out.println("****");
// // System.out.println("*****");
// /////*****/////
// // System.out.println("*\n**\n***\n****\n*****");                                         
//   }  
// }

import java.util.*;
public class MyFirstProgram{
public static void main(String[] args){
  // System.out.println("*****");
  // System.out.println("   * ");
  // System.out.println("  *  ");
  // System.out.println(" *   ");
  // System.out.println("*****");
  // // System.out.println("*****\n   * \n  *  \n *   \n*****");

  int x = 15;
  int y = 10;
  int sum = x + y;
  System.out.println("Sum of " + x + " and "+ y + " is " + sum);
  // xy
  int prd = x * y;
  System.out.println("Product of " + x + " and " + y + " is " + prd);
  // x / y, y / x, x % y
  int v1 = x / y;
  int v2 = y / x;
  int v3 = x % y;
  System.out.println(v1);
  System.out.println(v2);
  System.out.println(v3);

  // exp
  int exp = ( x * y) / (x + y);
  System.out.println(exp);
}
}
