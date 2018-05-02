/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 *
 * @author malik
 */
@Entity
@IdClass(Entities.Keys.RevisionPK.class)
public class Revision implements Serializable {

    @Id
    private Long idNavette;
        
    @Id
    private Long  idCli;

    public Long getIdNavette() {
        return idNavette;
    }

    public void setIdNavette(Long idNavette) {
        this.idNavette = idNavette;
    }

    public Long getIdCli() {
        return idCli;
    }

    public void setIdCli(Long idCli) {
        this.idCli = idCli;
    }

    public Date getDateRevisionD() {
        return dateRevisionD;
    }

    public void setDateRevisionD(Date dateRevisionD) {
        this.dateRevisionD = dateRevisionD;
    }

    public Navette getNavette() {
        return navette;
    }

    public void setNavette(Navette navette) {
        this.navette = navette;
    }

    public Mecanicien getMecanicien() {
        return mecanicien;
    }

    public void setMecanicien(Mecanicien mecanicien) {
        this.mecanicien = mecanicien;
    }

    public Date getDateRevisionF() {
        return dateRevisionF;
    }

    public void setDateRevisionF(Date dateRevisionF) {
        this.dateRevisionF = dateRevisionF;
    }

    @Id
    private Date dateRevisionD; 
    
    @ManyToOne
    private Navette navette;
    
    @ManyToOne
    private Mecanicien mecanicien; 
    
    
    @Column(name = "DATEREVISIONF")
    private Date dateRevisionF;
}
