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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author malik
 */
@Entity
@PrimaryKeyJoinColumn(name="IDCLI")
public class Mecanicien extends Usager implements Serializable {


    @JoinColumn(name = "IDREVISION")
    @OneToMany
    private Collection<Revision> revision;

    public Collection<Revision> getRevision() {
        return revision;
    }

    public void setRevision(Collection<Revision> revision) {
        this.revision = revision;
    }
    

    
}
