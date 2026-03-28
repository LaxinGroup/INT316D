/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateless;
import za.ac.tut.model.InvalidMessageException;

/**
 *
 * @author razku
 */
@Stateless
public class MessageAnalyzerSB implements MessageAnalyzerSBLocal {

    @Override
    public Integer Length(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        return message.length();
    }

    @Override
    public Integer NumberofCommas(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        Integer numCommas=0;
        
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i)==','){numCommas++;}
        }
        
        return numCommas;
    }

    @Override
    public Integer NumberOfFullstops(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        Integer numFullstops=0;
        
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i)==','){numFullstops++;}
        }
        
        return numFullstops;
        
    }

    @Override
    public List<String> ListOfUniqueWords(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        List<String> uniqueWords=new ArrayList<>();
        
        String newMessage=message.replace(",", "").replace(".", "");
        
        String[] words=newMessage.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            uniqueWords.add(newMessage);
        }
        
        return uniqueWords;
        
    }

    @Override
    public List<String> ListOfNonUniqueWords(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        List<String> nonUniqueWords=new ArrayList<>();
        
        String newMessage=message.replace(",", "").replace(".", "");
        
        String[] words=newMessage.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            nonUniqueWords.add(newMessage);
        }
        
        return nonUniqueWords;
        
    }

    @Override
    public HashMap<String, Integer> FrequencyOfOccurrenceOfNonUniqueWords(String message) throws InvalidMessageException {
        for (int i = 0; i < message.length(); i++) {
            if(Character.isDigit(message.charAt(i))){
                throw new InvalidMessageException("your message contains a digit");
            }
        }
        
        HashMap<String,Integer> frequency=new HashMap<>();
        
        String newMessage=message.replace(",", "").replace(".", "");
        
        String[] words=newMessage.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            frequency.put(words[i], i);
        }
        
        return frequency;
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
