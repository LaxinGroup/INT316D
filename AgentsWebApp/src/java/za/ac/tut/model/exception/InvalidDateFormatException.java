/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.exception;

import javax.ejb.EJBException;

/**
 *
 * @author student
 */
public class InvalidDateFormatException extends EJBException{

    public InvalidDateFormatException(String message) {
        super(message);
    }
    
}
