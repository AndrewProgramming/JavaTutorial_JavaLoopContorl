package com.andrewprogramming;

public class LoopControl {

  public static void main(String[] args) {
    forLoopDemo();
    whileLoopDemo();
    doWhileLoopDemo();
  }

  public static void forLoopDemo() {
    for (int counter = 0; counter < 10; counter++) {
      System.out.print(counter);
    }
  }


  public static void whileLoopDemo() {
    int counter = 0;
    while (counter < 10) {
      System.out.println(counter);
      counter++;
    }
  }

  public static void doWhileLoopDemo() {
    int i = 10;
    do {
      System.out.println(i);
      i--;
    } while (i > 0);
  }
}
