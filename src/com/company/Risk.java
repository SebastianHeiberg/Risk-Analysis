package com.company;

public class Risk {

  private String name;
  private int probability;
  private int consequense;
  private int severity;


  Risk(String name, int probability, int consequense) {
    this.name = name;
    this.probability = probability;
    this.consequense = consequense;
    severity = probability * consequense;
  }

  public String getName() {
    return name;
  }

  public int getProbability() {
    return probability;
  }

  public int getConsequense() {
    return consequense;
  }

  public int getSeverity() {
    return severity;
  }

}
