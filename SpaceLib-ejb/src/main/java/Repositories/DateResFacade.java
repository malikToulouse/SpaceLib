/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.DateRes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author malik
 */
@Stateless
public class DateResFacade extends AbstractFacade<DateRes> implements DateResFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_SpaceLib-ejb_ejb_1.0-SNAPSHOTPU2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DateResFacade() {
        super(DateRes.class);
    }
    
}
