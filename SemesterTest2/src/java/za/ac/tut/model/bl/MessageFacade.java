/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Message;

/**
 *
 * @author student
 */
@Stateless
public class MessageFacade extends AbstractFacade<Message> implements MessageFacadeLocal {

    @PersistenceContext(unitName = "SemesterTest2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageFacade() {
        super(Message.class);
    }

    @Override
    public Integer totalVowels(String message) {
        Integer a=0,e=0,i=0,o=0,u=0;
        String newMessage=message.replace(" ", "");
        
        for (int j = 0; j < newMessage.length(); j++) {
            if(newMessage.charAt(j)=='a')a++;
            if(newMessage.charAt(j)=='e')e++;
            if(newMessage.charAt(j)=='i')i++;
            if(newMessage.charAt(j)=='o')o++;
            if(newMessage.charAt(j)=='u')u++;
        }
        
        return a+e+i+o+u;
    }

    @Override
    public Integer totalConsonants(String message) {
        Integer consonant=0;
        String newMessage=message.replace(" ", "");
        
        for (int i = 0; i < newMessage.length(); i++) {
            if(newMessage.charAt(i)!='a'&&newMessage.charAt(i)!='e'&&newMessage.charAt(i)!='i'&&newMessage.charAt(i)!='o'&&newMessage.charAt(i)!='u')consonant++;
        }
        
        return consonant;
    }

    @Override
    public Message longestMessage() {
        String ql="select max(m.length) from Message m";
        Query query=em.createQuery(ql);
        return (Message)query.getSingleResult();
    }

    @Override
    public List<Character> uniqueLetters(String string) {
        String newMessage=string.replace(" ", "");
        List<Character> unique=new ArrayList<>();
        
        for (int i = 0; i < newMessage.length(); i++) {
            unique.add(newMessage.charAt(i));
        }
        
        return unique;
    }

    @Override
    public List<Character> nonUniqueLetters(String string) {
        String newMessage=string.replace(" ", "");
        List<Character> nonunique=new ArrayList<>();
        
        for (int i = 0; i < newMessage.length(); i++) {
            nonunique.add(newMessage.charAt(i));
        }
        
        return nonunique;
    }

    
}
