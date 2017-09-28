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
public class MessageService {
    public final void outputMessage(MessageInput input, MessageOutput output){
        output.outputMessage(input.getMessage());
    }
}