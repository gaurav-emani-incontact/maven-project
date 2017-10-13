package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *  Added the final keyword
  **/    
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
