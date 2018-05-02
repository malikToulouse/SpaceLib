/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.DateRev;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author malik
 */
@Local
public interface DateRevFacadeLocal {

    void create(DateRev dateRev);

    void edit(DateRev dateRev);

    void remove(DateRev dateRev);

    DateRev find(Object id);

    List<DateRev> findAll();

    List<DateRev> findRange(int[] range);

    int count();
    
}
