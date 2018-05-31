/**
 * Working on building a sample text adventure game
 * @author Hunter Gallant
 * 4/23/18
*/
import java.io.*;
import java.util.*;

public class TestWorld1 {

  private static int dT = 50;

  private static Scanner scanner = new Scanner( System.in );

  public static void main(String[] args){
    //introduction 1
    PrntCmds.blank(100);
    PrntCmds.typeWrite("Hello. Welcome to Test World 1.", dT);
    PrntCmds.wait(1500);

    PrntCmds.blank(1);
    PrntCmds.typeWrite("Thank you for playtesting in this stage of development. We appreciate all " +
    "feedback regarding the game, and any critiques would be appreciated.", dT);
    PrntCmds.wait(1500);

    PrntCmds.blank(1);
    PrntCmds.typeWrite("Before we begin, please sign up for an account to save your progress:", dT);

    PrntCmds.typeWrite("Username:", dT);
    String username1 = scanner.nextLine();
    PrntCmds.typeWrite("Password:", dT);
    String password1 = scanner.nextLine();
    PrntCmds.wait(1000);

    for (int i = 1; i < 3; i++){
      PrntCmds.blank(100);

      PrntCmds.typeWrite2("Processing", dT - i * dT/5 + dT/5);PrntCmds.loadDots(3, 4 + i - 1);

      PrntCmds.blank(100);

      PrntCmds.typeWrite("Hmm, that username seems to be taken. Please try again:", dT - i * dT/5);

      PrntCmds.typeWrite("Username:", dT - i * dT/5);
      String username2 = scanner.nextLine();
      PrntCmds.typeWrite("Password:", dT - i * dT/5);
      String password2 = scanner.nextLine();
      PrntCmds.wait(1000 - i * 100);
    }

    PrntCmds.blank(100);

    PrntCmds.typeWrite2("Processing", dT - 2 * dT/5);PrntCmds.loadDots(3, 4 + 2);

    PrntCmds.blank(100);

    PrntCmds.typeWrite("Hmm, that username seems to be taken. Please t", dT - 3 * dT/5);
    PrntCmds.randomChar(200, 50, 1);

    PrntCmds.blank(100);
    PrntCmds.wait(5000);

    PrntCmds.typeWrite2("Error Report", dT); PrntCmds.typeWrite2("x5903381:", 2 * dT);
    PrntCmds.typeWrite("Unknown function. Request Administrator assistance.", dT);
    PrntCmds.wait(1000);

    PrntCmds.typeWrite2("Please stand by", dT);PrntCmds.loadDots(3, 6);

    PrntCmds.blank(100);

    PrntCmds.typeWrite("System Failure. Exiting Program.", dT);
    PrntCmds.wait(2000);

    PrntCmds.blank(1000);

  }

}
