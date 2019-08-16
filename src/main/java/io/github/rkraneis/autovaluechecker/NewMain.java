package io.github.rkraneis.autovaluechecker;

import org.checkerframework.checker.nullness.qual.NonNull;


public class NewMain {

  public static void main(String[] args) {
    foo(null);
  }
  
  public static void foo(@NonNull String notNull) {
    System.out.println(notNull);
  }
}
