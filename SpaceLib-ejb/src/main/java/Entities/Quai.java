/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author malik
 */
@Entity
public class Quai implements Serializable {

    public Long getIdQuai() {
        return idQuai;
    }

    public void setIdQuai(Long idQuai) {
        this.idQuai = idQuai;
    }

    public Navette getNavette() {
        return navette;
    }

    public void setNavette(Navette navette) {
        this.navette = navette;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDQUAI")
    private Long idQuai;
    
    @OneToOne
    @JoinColumn(name = "IDNAVETTE")
    private Navette navette;
    
    @ManyToOne
    @JoinColumn(name = "IDSTATION")
    private Station station;
    
    
    public Long getId() {
        return idQuai;
    }

    public void setId(Long id) {
        this.idQuai = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuai != null ? idQuai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quai)) {
            return false;
        }
        Quai other = (Quai) object;
        if ((this.idQuai == null && other.idQuai != null) || (this.idQuai != null && !this.idQuai.equals(other.idQuai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Quai[ id=" + idQuai + " ]";
    }
    
}
