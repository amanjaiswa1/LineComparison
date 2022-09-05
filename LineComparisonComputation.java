package com.assignments.day3.LineComparision;

import java.util.*;

public class LineComparisonComputation {
  public static void main(String[] args) {
	  System.out.println("Welcome to Line Comparison Computation Program");

      Scanner S = new Scanner(System.in);

      System.out.println("Enter the value of line XY:");
      System.out.println("x1 coordinate");
      int x1 = S.nextInt();
      System.out.println("y1 coordinate");
      int y1 = S.nextInt();
      System.out.println("x2 coordinate");
      int x2 = S.nextInt();
      System.out.println("y2 coordinate");
      int y2 = S.nextInt();

      double lineLengthXY = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
      System.out.println("\nLength of the line XY is: "+lineLengthXY);

      System.out.println("\nEnter the value of line AB:");
      System.out.println("x1 coordinate");
      int a1 = S.nextInt();
      System.out.println("y1 coordinate");
      int b1 = S.nextInt();
      System.out.println("x2 coordinate");
      int a2 = S.nextInt();
      System.out.println("y2 coordinate");
      int b2 = S.nextInt();

      double lineLengthAB = Math.sqrt((a2 - a1)*(a2 - a1) + (b2 - b1)*(b2 - b1));
      System.out.println("\nLength of the line AB is: "+lineLengthAB);


      if (lineLengthXY == lineLengthAB)
          System.out.println("\nBoth lines are equal");
      else
          System.out.println("\nBoth lines are not equal");
  }
  }
