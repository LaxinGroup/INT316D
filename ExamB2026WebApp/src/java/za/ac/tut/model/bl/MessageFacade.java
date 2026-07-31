/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.model.entity.Agent;
import za.ac.tut.model.entity.Message;

/**
 *
 * @author Student
 */
@Stateless
public class MessageFacade extends AbstractFacade<Message> implements MessageFacadeLocal {

    @PersistenceContext(unitName = "ExamB2026WebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageFacade() {
        super(Message.class);
    }
    @RolesAllowed("agent")
    @Override
    public String classification(String text) {
        if(text.contains("!")||text.contains("critical")||text.contains("emergency")||text.contains("failure")||text.contains("urgent"))return "Critical";
        else if(text.contains("important")||text.contains("priority")||text.contains("report")||text.contains("alert")||text.contains("warning")||text.contains("warn"))return "High";
        else return "Low";
    }
    
    @RolesAllowed("agent")
    @Override
    public Long numOfCriticalMessages() {
        String ql="select count(m) from Message m where m.classification=:Critical";
        return em.createQuery(ql, Long.class).setParameter("Critical", "Critical").getSingleResult();
    }
    
    @RolesAllowed("manager")
    @Override
    public List<Message> messagesPerClass(String classification) {
        String ql="select m from Message m where m.classification=:classification";
        return em.createQuery(ql, Message.class).setParameter("classification", classification).getResultList();
    }
    
    @RolesAllowed("manager")
    @Override
    public Agent agentWithMostReportsPerClass(String classification) {
        String ql="select m.agent from Message m where m.classification=:classification group by m.agent order by count(m.agent) desc";
        return em.createQuery(ql, Agent.class).setParameter("classification", classification).setMaxResults(1).getSingleResult();
    }
    
}
