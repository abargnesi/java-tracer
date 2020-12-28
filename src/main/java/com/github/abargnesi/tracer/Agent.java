package com.github.abargnesi.tracer;

import java.lang.instrument.Instrumentation;

public class Agent {

  public static void premain(String args, Instrumentation inst) {
    System.err.println("Attached agent at JVM startup.");
  }

  public static void agentmain(String args, Instrumentation inst) {
    System.err.println("Attached agent after JVM startup.");
  }
}
