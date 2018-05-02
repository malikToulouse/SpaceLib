/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Keys;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author malik
 */
public class RevisionPK implements Serializable{
    
    private Long idNavette;
    private Long  idCli;
    private Date dateRevisionD;

    public Date getDateRevisionD() {
        return dateRevisionD;
    }

    public void setDateRevisionD(Date dateRevisionD) {
        this.dateRevisionD = dateRevisionD;
    }
    
    public RevisionPK() {
    }

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

    public Date getDateRevision() {
        return dateRevisionD;
    }

    public void setDateRevision(Date dateRevision) {
        this.dateRevisionD = dateRevision;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idNavette);
        hash = 29 * hash + Objects.hashCode(this.idCli);
        hash = 29 * hash + Objects.hashCode(this.dateRevisionD);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RevisionPK other = (RevisionPK) obj;
        if (!Objects.equals(this.idNavette, other.idNavette)) {
            return false;
        }
        if (!Objects.equals(this.idCli, other.idCli)) {
            return false;
        }
        if (!Objects.equals(this.dateRevisionD, other.dateRevisionD)) {
            return false;
        }
        return true;
    }
    
    
}
