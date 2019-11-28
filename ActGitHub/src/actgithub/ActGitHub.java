/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actgithub;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Joel
 */
public class ActGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader (isr);
      try
      {
         System.out.print("Insereix el primer numero : ");
         int n1 = Integer.parseInt(br.readLine());
         System.out.print("Insereix el segon numero : ");
         int n2 = Integer.parseInt(br.readLine());
         int suma=n1+n2;
         System.out.println ("La suma es " + n1 + "+" + n2 +"="+ suma);
      }
      catch (Exception e)
      {
      }
   }
}
}