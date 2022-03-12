package com.company;

import java.util.Random;

public class Main {

  public UserInterface userInterface = new UserInterface();
  public final Random randomGenerator = new Random();

  public void menu() {

    Risk[] risks = createRandomRisks(25);
    userInterface.displayRiskArray(risks);
  }

  public Risk[] createRandomRisks(int numberOfRisk) {

    Risk[] numberRisks = new Risk[numberOfRisk];

    for (int i = 0; i < numberRisks.length; i++) {

      numberRisks[i] = new Risk(("Risk number" + i), createRandomNumber1to5(), createRandomNumber1to5());
    }

    return numberRisks;
  }

  public int createRandomNumber1to5() {
    int random = randomGenerator.nextInt(5) + 1;
    return random;
  }

  public static void main(String[] args) {
    new Main().menu();

  }
}
