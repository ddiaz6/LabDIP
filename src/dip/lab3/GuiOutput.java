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
public class GuiOutput implements MessageOutput{

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);

    }
    
    
}
