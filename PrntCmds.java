/**
 * Set of print functions
 * @author Hunter Gallant
 * 5/29/18
*/
import java.io.*;
import java.util.*;

public class PrntCmds {

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

  /**
   * deletes the last typed character(s)
   * @param numDel An int specifying how many character to delete
  */
  public static void backSpace(int numDel){
    for (int i = 0; i < numDel; i++){
      System.out.print("\b \b");
    }
  }
}
