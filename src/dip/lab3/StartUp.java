/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author HP
 */
public class StartUp {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        
        MessageInput input = new GuiInput();
        MessageOutput output = new GuiOutput();
//        MessageInput input = new ConsoleInput();
//        MessageOutput output = new ConsoleOutput();
        
        messageService.outputMessage(input, output);
        
    }
}
