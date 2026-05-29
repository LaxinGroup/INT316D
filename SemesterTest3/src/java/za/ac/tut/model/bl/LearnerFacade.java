/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author student
 */
@Stateless
public class LearnerFacade extends AbstractFacade<Learner> implements LearnerFacadeLocal {

    @PersistenceContext(unitName = "SemesterTest3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LearnerFacade() {
        super(Learner.class);
    }
    
    @RolesAllowed("teacher")
    @Override
    public List<Learner> passed() {
        String ql="select l from Learner l where l.percentage>=50";
        return em.createQuery(ql, Learner.class).getResultList();
    }
    
    @RolesAllowed("teacher")
    @Override
    public Learner topLearner() {
        String ql="select l from Learner l order by l.percentage desc";
        return em.createQuery(ql, Learner.class).setMaxResults(1).getSingleResult();
    }
    
}
