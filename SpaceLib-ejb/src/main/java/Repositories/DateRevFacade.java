/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.DateRev;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author malik
 */
@Stateless
public class DateRevFacade extends AbstractFacade<DateRev> implements DateRevFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_SpaceLib-ejb_ejb_1.0-SNAPSHOTPU2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DateRevFacade() {
        super(DateRev.class);
    }
    
}
