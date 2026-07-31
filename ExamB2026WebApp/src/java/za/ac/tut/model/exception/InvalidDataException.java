/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.exception;

import javax.ejb.EJBException;

/**
 *
 * @author Student
 */
public class InvalidDataException extends EJBException {

    public InvalidDataException(String message) {
        super(message);
    }
    
}
