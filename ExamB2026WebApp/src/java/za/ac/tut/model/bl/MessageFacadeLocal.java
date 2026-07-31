/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Local;
import za.ac.tut.model.entity.Agent;
import za.ac.tut.model.entity.Message;

/**
 *
 * @author Student
 */
@Local
public interface MessageFacadeLocal {
    
    @RolesAllowed("agent")
    void create(Message message);

    void edit(Message message);

    void remove(Message message);
    
    @RolesAllowed("agent")
    Message find(Object id);

    List<Message> findAll();

    List<Message> findRange(int[] range);

    int count();
    
    String classification(String text);
    
    Long numOfCriticalMessages();
    
    List<Message> messagesPerClass(String classification);
    
    Agent agentWithMostReportsPerClass(String classification);
    
}
