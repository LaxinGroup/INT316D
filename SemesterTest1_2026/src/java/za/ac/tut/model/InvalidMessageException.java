/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import javax.ejb.EJBException;

/**
 *
 * @author razku
 */
public class InvalidMessageException extends EJBException{

    public InvalidMessageException(String message) {
        super(message);
    }
    
}
