package za.ac.tut.model.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.model.entity.Agent;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-07-31T14:58:24")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, Agent> agent;
    public static volatile SingularAttribute<Message, Long> id;
    public static volatile SingularAttribute<Message, String> text;
    public static volatile SingularAttribute<Message, String> classification;
    public static volatile SingularAttribute<Message, Date> creationDate;

}