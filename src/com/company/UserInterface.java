package com.company;

public class UserInterface {

  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RESET = "\u001B[0m";

  public void displayRiskArray(Risk[] riskArray) {
    System.out.println("Nr.  Risk name \t\t Pro  Con\tSev\t Level");
    for (int i = 0; i < riskArray.length; i++) {

      System.out.printf("# %2d %3s\t %d \t  %d \t%2d", i+1, riskArray[i].getName(), riskArray[i].getProbability(),
          riskArray[i].getConsequense(), riskArray[i].getSeverity());

      displaySeverityLevel(riskArray[i].getSeverity());
      System.out.println();
    }
  }

  public void displaySeverityLevel(int degreeOfSeverity) {
    if (degreeOfSeverity <= 5) {
      System.out.print("\t" + ANSI_GREEN + " Very_Low" + ANSI_RESET);
    } else if (degreeOfSeverity >= 10 && degreeOfSeverity < 15) {
      System.out.print("\t" + ANSI_GREEN + " Low" + ANSI_RESET);
    } else if (degreeOfSeverity > 10 && degreeOfSeverity <= 15) {
      System.out.print("\t" + ANSI_YELLOW + " Medium" + ANSI_RESET);
    } else if (degreeOfSeverity > 15 && degreeOfSeverity <= 20) {
      System.out.print("\t" + ANSI_RED + " High" + ANSI_RESET);
    } else {
      System.out.print("\t" + ANSI_RED + " Very_High" + ANSI_RESET);
    }

  }

}
