package Entities;

import Entities.Quai;
import Entities.Reservation;
import Entities.Revision;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T12:42:37")
@StaticMetamodel(Navette.class)
public class Navette_ { 

    public static volatile SingularAttribute<Navette, Long> idNavette;
    public static volatile SingularAttribute<Navette, Quai> quai;
    public static volatile CollectionAttribute<Navette, Reservation> reservation;
    public static volatile SingularAttribute<Navette, Integer> nbPassagerMax;
    public static volatile CollectionAttribute<Navette, Revision> revision;

}