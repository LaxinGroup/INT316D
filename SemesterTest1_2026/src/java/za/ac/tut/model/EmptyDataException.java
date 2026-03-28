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
public class EmptyDataException extends EJBException {

    public EmptyDataException(String message) {
        super(message);
    }
    
}
