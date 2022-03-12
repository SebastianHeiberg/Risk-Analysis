package com.company;

public class UserInterface {

  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_CYAN = "\u001B[36m";


  public void displayRiskArray (Risk [] riskArray) {
    System.out.println("Nr.  Risk name \t\t pro  con\tsev\t Level");
    for (int i = 0; i < riskArray.length; i++) {
      System.out.printf("# %2d %3s\t %d \t  %d \t%d\n", i,riskArray[i].getName(),riskArray[i].getProbability(),
          riskArray[i].getConsequense(),riskArray[i].getSeverity());

    }
  }


}
