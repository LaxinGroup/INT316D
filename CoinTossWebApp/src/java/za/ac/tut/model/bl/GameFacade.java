/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.Random;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.model.entity.Game;

/**
 *
 * @author student
 */
@Stateless
public class GameFacade extends AbstractFacade<Game> implements GameFacadeLocal {
    private Random random=new Random();
    @PersistenceContext(unitName = "CoinTossWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Game.class);
    }

    @Override
    public String siriToss() {
        return random.nextBoolean()? "Heads":"Tails";
    }

    @Override
    public String result(String string, String string1) {
        String result="";
        if(string.equalsIgnoreCase(string1))result="Won";
        else result="Lost";
        return result;
    }
    
}
