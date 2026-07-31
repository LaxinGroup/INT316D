package za.ac.tut.model.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.model.entity.Message;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-07-31T14:58:24")
@StaticMetamodel(Agent.class)
public class Agent_ { 

    public static volatile SingularAttribute<Agent, String> name;
    public static volatile ListAttribute<Agent, Message> messages;
    public static volatile SingularAttribute<Agent, Long> id;
    public static volatile SingularAttribute<Agent, Date> creationDate;

}