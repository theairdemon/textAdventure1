/**
 * Working on building a sample text adventure game
 * @author Hunter Gallant
 * 4/23/18
*/
import java.io.*;
import java.util.*;

public class TestWorld1 {
  private static int dT = 50;

  public static void main(String[] args){
    //introduction 1
    PrntCmds.blank(50);
    PrntCmds.typeWrite2("Something something", dT);
    PrntCmds.backSpace(5);
    PrntCmds.wait(2000);

  }

}
