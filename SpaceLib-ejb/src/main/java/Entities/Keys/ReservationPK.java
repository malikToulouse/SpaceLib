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
public class ReservationPK implements Serializable{
    
    private Long idNavette;
    private Long  idCli;
    private Date dateReservationD;

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

    public Date getDateReservationD() {
        return dateReservationD;
    }

    public void setDateReservationD(Date dateReservationD) {
        this.dateReservationD = dateReservationD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idNavette);
        hash = 79 * hash + Objects.hashCode(this.idCli);
        hash = 79 * hash + Objects.hashCode(this.dateReservationD);
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
        final ReservationPK other = (ReservationPK) obj;
        if (!Objects.equals(this.idNavette, other.idNavette)) {
            return false;
        }
        if (!Objects.equals(this.idCli, other.idCli)) {
            return false;
        }
        if (!Objects.equals(this.dateReservationD, other.dateReservationD)) {
            return false;
        }
        return true;
    }
    
    
}
