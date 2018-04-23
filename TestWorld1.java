/**
 * Working on building a sample text adventure game
 * @author Hunter Gallant
 * 4/23/18
*/
import java.io.*;
import java.util.*;

public class TestWorld1 {
  public static int dT = 50;

  public static void main(String[] args){
    //introduction 1
    blank(50);
    typeWrite("Hello, and welcome to the game.", dT);
    wait(2000);
    typeWrite("What would you like to do first?", dT);
    wait(2000);
    typeWrite("Dammit, I forgot to mention how this works.", dT/2);
    wait(500);
    typeWrite("Let's try this again.", dT);
    wait(2000);
    blank(50);

    //introduction 2
    typeWrite("Hello, and welcome to the game.", dT);
    wait(1500);
    typeWrite("In this game, you have complete freedom.", dT);
    wait(1000);
    typeWrite("Well, complete freedom within the confines of this world.", dT);

  }

  /**
   * Types out each character individually
   * @param printOut A string to be "typed" printOut
   * @param delay An int defining the amound of delay between each character
  */
  public static void typeWrite(String printOut, int delay){
    String text = printOut;
    for(int i = 0; i < text.length(); i++){
      System.out.printf("%c", text.charAt(i));
      try{
          Thread.sleep(delay);//0.5s pause between characters
      }catch(InterruptedException ex){
          Thread.currentThread().interrupt();
      }
    }
    blank(1);
  }

  /**
   * Same as typeWrite() but without the extra line at the end
   * @param printOut A string to be "typed" printOut
   * @param delay An int defining the amound of delay between each character
  */
  public static void typeWrite2(String printOut, int delay){
    String text = printOut;
    for(int i = 0; i < text.length(); i++){
      System.out.printf("%c", text.charAt(i));
      try{
          Thread.sleep(delay);//0.5s pause between characters
      }catch(InterruptedException ex){
          Thread.currentThread().interrupt();
      }
    }
  }

  /**   TEST STAGE
   * Works like typeWrite(), but types at a slightly inconsistent speed
   * @param printOut A string to be "typed" printOut
   * @param delay An int defining the amound of delay between each character
  */
  public static void realWrite(String printOut, int delay){
    String text = printOut;
    for(int i = 0; i < text.length(); i++){
      System.out.printf("%c", text.charAt(i));
      try{
          Thread.sleep(delay);//0.5s pause between characters
      }catch(InterruptedException ex){
          Thread.currentThread().interrupt();
      }
    }
    blank(1);
  }

  /**
   * waits for the specified amount
   * @param delay An int specifying the amount of waiting time
  */
  public static void wait(int delay){
    try{
        Thread.sleep(delay); //0.5s pause between characters
    }catch(InterruptedException ex){
        Thread.currentThread().interrupt();
    }
  }

  /**
   * prints out a specified amount of blank lines
   * @param num An int specifying the number of blank lines to print out
  */
  public static void blank(int num){
    for (int i = 0; i < num; i++){
        System.out.println(" ");
    }
  }
}
