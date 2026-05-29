/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Result;

/**
 *
 * @author student
 */
@Local
public interface ResultFacadeLocal {

    void create(Result result);

    void edit(Result result);

    void remove(Result result);

    Result find(Object id);

    List<Result> findAll();

    List<Result> findRange(int[] range);

    int count();
    
}
