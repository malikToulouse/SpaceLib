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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author malik
 */
@Entity
public class Station implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "IDSTATION")
    private Long idStation;

    @Size(max = 50)
    @Column(name = "NOMSTATION")
    private String nomStation;
    
    @Size(max = 50)
    @Column(name = "LIEUSTATION")
    private String lieuStation;
    
    @Column(name = "MES")
    private boolean mes;
    
    @OneToMany(mappedBy = "IDSTATION")
    private Collection<Quai> quaiCollection;
    

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getLieuStation() {
        return lieuStation;
    }

    public void setLieuStation(String lieuStation) {
        this.lieuStation = lieuStation;
    }

    public boolean isMes() {
        return mes;
    }

    public void setMes(boolean mes) {
        this.mes = mes;
    }
    
    public Long getId() {
        return idStation;
    }

    public void setId(Long id) {
        this.idStation = id;
    }

    public Long getIdStation() {
        return idStation;
    }

    public void setIdStation(Long idStation) {
        this.idStation = idStation;
    }

    public Collection<Quai> getQuaiCollection() {
        return quaiCollection;
    }

    public void setQuaiCollection(Collection<Quai> quaiCollection) {
        this.quaiCollection = quaiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStation != null ? idStation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Station)) {
            return false;
        }
        Station other = (Station) object;
        if ((this.idStation == null && other.idStation != null) || (this.idStation != null && !this.idStation.equals(other.idStation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Station[ id=" + idStation + " ]";
    }
    
}
