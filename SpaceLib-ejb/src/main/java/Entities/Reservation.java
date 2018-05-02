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
@IdClass(Entities.Keys.ReservationPK.class)
public class Reservation implements Serializable {

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

    public Navette getNavette() {
        return navette;
    }

    public void setNavette(Navette navette) {
        this.navette = navette;
    }

    public Usager getUsager() {
        return usager;
    }

    public void setUsager(Usager usager) {
        this.usager = usager;
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public Station getStationD() {
        return stationD;
    }

    public void setStationD(Station stationD) {
        this.stationD = stationD;
    }

    public Station getStationA() {
        return stationA;
    }

    public void setStationA(Station stationA) {
        this.stationA = stationA;
    }

    public Date getDateReservationA() {
        return dateReservationA;
    }

    public void setDateReservationA(Date dateReservationA) {
        this.dateReservationA = dateReservationA;
    }

    
    private static final long serialVersionUID = 1L;
    @Id
    private Long idNavette;
    @Id
    private Long  idCli;
    @Id
    private Date dateReservationD;

    @ManyToOne
    private Navette navette;
    
    @ManyToOne
    private Usager usager; 
    
    @Size(max = 50)
    @Column(name = "NBPASSAGER")
    private int nbPassager;
    
    @Size(max = 50)
    @Column(name = "STATIOND")
    private Station stationD;
    
    @Size(max = 50)
    @Column(name = "STATIONA")
    private Station stationA;
    
    @Column(name = "STATIONA")
    private Date dateReservationA;

}
