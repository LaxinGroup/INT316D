/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Agent;

/**
 *
 * @author student
 */
@Stateless
public class AgentFacade extends AbstractFacade<Agent> implements AgentFacadeLocal {
    Query query;
    @PersistenceContext(unitName = "AgentsWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgentFacade() {
        super(Agent.class);
    }

    @Override
    public Long totalNumberOfAgentsPerGender(Character gender) {
        String ql="select count(a) from Agent a where a.gender=:gender";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        return (Long)query.getSingleResult();
    }

    @Override
    public List<Agent> agentsPerGender(Character gender) {
        String ql="select a from Agent a where a.gender=:gender";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        return (List<Agent>)query.getResultList();
    }

    @Override
    public Long totalNumberOfMarriedPerGender(Character gender) {
        String ql="select count(a) from Agent a where a.maritalStatus=:Married and a.gender=:gender";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        query.setParameter("Married", "Married");
        return (Long)query.getSingleResult();
    }

    @Override
    public List<Agent> marriedAgentsPerGender(Character gender) {
        String ql="select a from Agent a where a.maritalStatus=:Married and a.gender=:gender";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        query.setParameter("Married", "Married");
        return (List<Agent>)query.getResultList();
    }

    @Override
    public Long totalNumberOfAgentsPerAgeRange(Character gender, Integer min, Integer imax) {
        String ql="select count(a) from Agent a where a.gender=:gender and a.age>=:min and a.age<=:imax";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        query.setParameter("min", min);
        query.setParameter("imax", imax);
        return (Long)query.getSingleResult();
    }

    @Override
    public List<Agent> agentsPerAgeRange(Character gender, Integer min, Integer imax) {
        String ql="select a from Agent a where a.gender=:gender and a.age>=:min and a.age<=:imax";
        query=em.createQuery(ql);
        query.setParameter("gender", gender);
        query.setParameter("min", min);
        query.setParameter("imax", imax);
        return (List<Agent>)query.getResultList();
    }

    @Override
    public Agent oldestAgent() {
       String ql="select a from Agent a order by a.age desc";
       query=em.createQuery(ql);
       query.setMaxResults(1);
       return (Agent)query.getSingleResult();
    }
    
}
