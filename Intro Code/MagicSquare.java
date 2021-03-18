/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquare
{
    private static int magicnum;
    private static int [][] square;
    public MagicSquare(int [][] array)
    {
        square = array;
        magicnum = 0;
        int row = array.length -1;
        for (int column = 0; column < array[row].length; column++)
        {
            magicnum += array[row][column];
        }

    }
    public boolean isMagic()
    {
        boolean magic = false;
        int row, columnumn, diag1, diag2;
        for (int i = 0; i < square.length; i++)
        {
            row = MagicSquare.addRow(i);
            if (row != magicnum)
                magic = false;
            else if (row == magicnum)
                magic = true;
            
            columnumn = MagicSquare.addcolumn(i);
            if (columnumn != magicnum)
                magic = false;
            else if (columnumn == magicnum)
                magic = true;
              
        }
            diag1 = MagicSquare.addDiag(1); 
             if (diag1 != magicnum)
                magic = false;
            else if (diag1 == magicnum)
                magic = true;
            diag2 = MagicSquare.addDiag(2);
             if (diag2 != magicnum)
                magic = false;
            else if (diag2 == magicnum)
                magic = true;                                
        return magic;
    }
    public int getMagicNum()
    {
        return magicnum;
    }
    public void setMagicSquare (int [][] arr)
    {
       square = arr;
       magicnum = 0;
       int row = square.length -1;
       for (int column =0; column < arr[row].length; column++)
       {
        magicnum += arr[row][column];
       }
       
       
    }
    public static int addRow (int row)
    {
     int total = 0;
     
      for (int column =0; column < square[row].length; column++)
     {
      total += square[row][column];
     } 
     
     return total;
    }
    public static int addDiag (int diag)
     {
         int total = 0;
         if (diag == 1) 
         {
         for (int i = 0; i <square.length ; i++)
         {
            total += square[i][i]; 
            }
         
        }
        else if (diag == 2)
        {
            for (int i = square.length-1, j = 0; i >= 0 && j<square.length; i--, j++)
         {
            total += square[j][i]; 
            }
         
        }
        return total;
    }
    public static int[] addRows()
    {
        int [] Rows = new int[square.length];
        for (int i = 0; i < square.length; i++)
         { 
             int total = 0;
             
             for (int j = 0; j < square[i].length; j++)
             {
                 total += square[i][j];
                 
                }
             Rows[i] = total;
            }
            return Rows;
    }
    public static int addcolumn (int column)
    {
     int total = 0;
     
     for (int row = 0; row < square.length; row++)
     {
      total += square[row][column];
     } 
     
     return total;
    }
    public static int[] addcolumns()
    {
        int [] columns = new int[square.length];
        for (int i = 0; i < square.length; i++)
         { 
             int total = 0;
             
             for (int j = 0; j < square[i].length; j++)
             {
                 total += square[j][i];
                 
                }
             columns[i] = total;
            }
            return columns;
        }
}












