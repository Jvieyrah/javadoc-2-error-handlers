package com.trybe.acc.java;

/**
 * texto generico. author joao
 *
 */
public class Divisor {
  /**
   * tex2 author joao.
   *
   */
  public int dividir(int um, int dois) {
    try {
      return um / dois;
    } catch (ArithmeticException e) {
      return 0;
    }
  }

}
