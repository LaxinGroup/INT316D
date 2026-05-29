/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author student
 */
@Entity
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer gamesPlayed,wonBySiri,wonByPlayer;
    private String tossesBySiri,tossesByPlayer;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;

    public Game() {
    }

    public Game(Long id, String name, Integer gamesPlayed, Integer wonBySiri, Integer wonByPlayer, String tossesBySiri, String tossesByPlayer, Date creationDate) {
        this.id = id;
        this.name = name;
        this.gamesPlayed = gamesPlayed;
        this.wonBySiri = wonBySiri;
        this.wonByPlayer = wonByPlayer;
        this.tossesBySiri = tossesBySiri;
        this.tossesByPlayer = tossesByPlayer;
        this.creationDate = creationDate;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getWonBySiri() {
        return wonBySiri;
    }

    public void setWonBySiri(Integer wonBySiri) {
        this.wonBySiri = wonBySiri;
    }

    public Integer getWonByPlayer() {
        return wonByPlayer;
    }

    public void setWonByPlayer(Integer wonByPlayer) {
        this.wonByPlayer = wonByPlayer;
    }

    public String getTossesBySiri() {
        return tossesBySiri;
    }

    public void setTossesBySiri(String tossesBySiri) {
        this.tossesBySiri = tossesBySiri;
    }

    public String getTossesByPlayer() {
        return tossesByPlayer;
    }

    public void setTossesByPlayer(String tossesByPlayer) {
        this.tossesByPlayer = tossesByPlayer;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entity.Game[ id=" + id + " ]";
    }
    
}
