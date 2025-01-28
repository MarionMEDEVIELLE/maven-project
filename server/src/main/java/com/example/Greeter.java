package com.example;

import java.lang.Math;
/**
* this is a defaut Class constructor
*/

public class Greeter {

  public String nom = "Fred";
  public int age = 0;
 
  /**
  * this in contructor
  */
  public Greeter() {
   // contructeur par défaut
  }

   public void doSomeThing() {
   System.out.print("Bonjour le Monde");
  }

  public void doNoThing() {
   System.out.print("Bonjour le Monde");
  }
 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
   System.out.print("Bonjour le Monde");
   return String.format("Hello Again, %s!", someone);
   
 }
}
