/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String text;
    private Integer length;
    private Integer totalVowels;
    private Integer totalConsonants;
    private List<Character> uniqueLetters;
    private List<Character> nonUniqueLetters;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date onCreation;

    public Message() {
    }

    public Message(Long id, String text, Integer length, Integer totalVowels, Integer totalConsonants, List<Character> uniqueLetters, List<Character> nonUniqueLetters, Date onCreation) {
        this.id = id;
        this.text = text;
        this.length = length;
        this.totalVowels = totalVowels;
        this.totalConsonants = totalConsonants;
        this.uniqueLetters = uniqueLetters;
        this.nonUniqueLetters = nonUniqueLetters;
        this.onCreation = onCreation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getTotalVowels() {
        return totalVowels;
    }

    public void setTotalVowels(Integer totalVowels) {
        this.totalVowels = totalVowels;
    }

    public Integer getTotalConsonants() {
        return totalConsonants;
    }

    public void setTotalConsonants(Integer totalConsonants) {
        this.totalConsonants = totalConsonants;
    }

    public List<Character> getUniqueLetters() {
        return uniqueLetters;
    }

    public void setUniqueLetters(List<Character> uniqueLetters) {
        this.uniqueLetters = uniqueLetters;
    }

    public List<Character> getNonUniqueLetters() {
        return nonUniqueLetters;
    }

    public void setNonUniqueLetters(List<Character> nonUniqueLetters) {
        this.nonUniqueLetters = nonUniqueLetters;
    }

    public Date getOnCreation() {
        return onCreation;
    }

    public void setOnCreation(Date onCreation) {
        this.onCreation = onCreation;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entity.Message[ id=" + id + " ]";
    }
    
}
