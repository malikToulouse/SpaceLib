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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author malik
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Usager implements Serializable {

    private static final long serialVersionUID = 1L;

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Collection<Reservation> reservation) {
        this.reservation = reservation;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCLI")
    private Long idCli;
    
    @Size(max = 45)
    @Column(name = "NOMCLI")
    private String nomCli;
    
    @Size(max = 45)
    @Column(name = "PRENOMCLI")
    private String prenomCli;
    
    @Size(max = 45)
    @Column(name = "PSEUDO")
    private String pseudo;
    
    @NotNull
    @Size(max = 45)
    @Column(name = "MDPCLI")
    private String mdpCli;
    
    @Column(name = "IDRESERVATION")
    @OneToMany
    private Collection<Reservation> reservation;

    public Long getIdCli() {
        return idCli;
    }

    public void setIdCli(Long idCli) {
        this.idCli = idCli;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getPrenomCli() {
        return prenomCli;
    }

    public void setPrenomCli(String prenomCli) {
        this.prenomCli = prenomCli;
    }

    public String getMdpCli() {
        return mdpCli;
    }

    public void setMdpCli(String mdpCli) {
        this.mdpCli = mdpCli;
    }   

    
}
