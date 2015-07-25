/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameboard;

/**
 *
 * @author KCISCisco
 */
public class GameBoard {

    // This function will check if X has three in a row
    public boolean checkWinX(String [][] c) {
        
        // Check rows for x
      if ((c[0][0].equals("X")) && (c[0][1].equals("X")) && (c[0][2].equals("X"))) {
          return true;
          
          
      }
      else if ((c[1][0].equals("X")) && (c[1][1].equals("X")) && (c[1][2].equals("X"))) {
          return true;
      }   
      
      else if ((c[2][0].equals("X")) && (c[2][1].equals("X")) && (c[2][2].equals("X"))) {
          return true;
      }
        
      // Check columns for x
      if ((c[0][0].equals("X")) && (c[1][0].equals("X")) && (c[2][0].equals("X"))) {
          return true;
      }
      else if ((c[0][1].equals("X")) && (c[1][1].equals("X")) && (c[2][1].equals("X"))) {
          return true;
      }
      else if ((c[0][2].equals("X")) && (c[1][2].equals("X")) && (c[2][2].equals("X"))) {
          return true;
      }
      
      // Check the diagonals for x
      if ((c[0][0].equals("X")) && (c[1][1].equals("X")) && (c[2][2].equals("X"))) {
          return true;
      }
      else if ((c[0][2].equals("X")) && (c[1][1].equals("X")) && (c[2][0].equals("X"))){
          return true;
      }
      
        return false;
    }
        

    // This function will check if O has three in a row
    public boolean checkWinO(String c [][]) {
        
        // Check rows for x
      if ((c[0][0].equals("O")) && (c[0][1].equals("O")) && (c[0][2].equals("O"))) {
          return true;
   
      }
      else if ((c[1][0].equals("O")) && (c[1][1].equals("O")) && (c[1][2].equals("O"))) {
          return true;
      }   
      
      else if ((c[2][0].equals("O")) && (c[2][1].equals("O")) && (c[2][2].equals("O"))) {
          return true;
      }
        
      // Check columns for x
      if ((c[0][0].equals("O")) && (c[1][0].equals("O")) && (c[2][0].equals("O"))) {
          return true;
      }
      else if ((c[0][1].equals("O")) && (c[1][1].equals("O")) && (c[2][1].equals("O"))) {
          return true;
      }
      else if ((c[0][2].equals("O")) && (c[1][2].equals("O")) && (c[2][2].equals("O"))) {
          return true;
      }
      
      // Check the diagonals for x
      if ((c[0][0].equals("O")) && (c[1][1].equals("O")) && (c[2][2].equals("O"))) {
          return true;
      }
      else if ((c[0][2].equals("O")) && (c[1][1].equals("O")) && (c[2][0].equals("O"))){
          return true;
      }
      
        return false;
    }
        
    
    public boolean checkForTieX(int num) {
        return (num == 9);
    }
    
    public boolean checkForTieO(int num) {
        return (num == 10);
    }
}
        
