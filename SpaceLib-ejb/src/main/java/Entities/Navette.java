/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author malik
 */
@Entity
public class Navette implements Serializable {

    public Collection<Revision> getRevision() {
        return revision;
    }

    public void setRevision(Collection<Revision> revision) {
        this.revision = revision;
    }

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Collection<Reservation> reservation) {
        this.reservation = reservation;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDNAVETTE")
    private Long idNavette;
    
    @Column(name = "NB_PASSAGER_MAX")
    private int nbPassagerMax;

    @OneToOne
    @Column(name = "IDQUAI")
    private Quai quai;
    
    @OneToMany
    @Column(name = "IDREVISION")
    private Collection<Revision> revision;
    
    @OneToMany
    @Column(name = "IDRESRVATION")
    private Collection<Reservation> reservation;
    
    
    public int getNbPassagerMax() {
        return nbPassagerMax;
    }

    public void setNbPassagerMax(int nbPassagerMax) {
        this.nbPassagerMax = nbPassagerMax;
    }

    public Long getIdNavette() {
        return idNavette;
    }

    public void setIdNavette(Long idNavette) {
        this.idNavette = idNavette;
    }

    public Quai getQuai() {
        return quai;
    }

    public void setQuai(Quai quai) {
        this.quai = quai;
    }
    
    
    
    
}
