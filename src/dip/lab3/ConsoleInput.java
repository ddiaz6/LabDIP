/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ConsoleInput implements MessageInput{
    
   

    @Override
    public final String getMessage() {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Eneter message:\n");
         String text = keyboard.nextLine();
         
         return text;
    }

}
