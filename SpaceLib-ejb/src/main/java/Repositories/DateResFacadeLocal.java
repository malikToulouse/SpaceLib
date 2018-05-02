/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.DateRes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author malik
 */
@Local
public interface DateResFacadeLocal {

    void create(DateRes dateRes);

    void edit(DateRes dateRes);

    void remove(DateRes dateRes);

    DateRes find(Object id);

    List<DateRes> findAll();

    List<DateRes> findRange(int[] range);

    int count();
    
}
