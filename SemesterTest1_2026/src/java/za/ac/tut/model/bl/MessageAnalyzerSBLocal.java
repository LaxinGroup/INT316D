/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.InvalidMessageException;

/**
 *
 * @author razku
 */
@Local
public interface MessageAnalyzerSBLocal {
    Integer Length(String message) throws InvalidMessageException;
    Integer NumberofCommas(String message) throws InvalidMessageException;
    Integer NumberOfFullstops(String message) throws InvalidMessageException;
    List<String> ListOfUniqueWords(String message) throws InvalidMessageException;
    List<String> ListOfNonUniqueWords(String message) throws InvalidMessageException;
    HashMap<String,Integer> FrequencyOfOccurrenceOfNonUniqueWords(String message) throws InvalidMessageException;
    
}
