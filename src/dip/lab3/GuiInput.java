/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GuiInput implements MessageInput{

    @Override
    public final String getMessage() {
        return JOptionPane.showInputDialog("Enter Message");
    }
    
}
