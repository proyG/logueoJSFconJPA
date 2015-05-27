/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.inmueble;

import com.entity.inmueble.Inmueble;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erik
 */
@Stateless
public class InmuebleFacade extends AbstractFacade<Inmueble> {
    @PersistenceContext(unitName = "logueoJSFconJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InmuebleFacade() {
        super(Inmueble.class);
    }
    
}
