package Entities;

import Entities.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T21:30:58")
@StaticMetamodel(Usager.class)
public class Usager_ { 

    public static volatile SingularAttribute<Usager, String> mdpCli;
    public static volatile SingularAttribute<Usager, Long> idCli;
    public static volatile SingularAttribute<Usager, String> nomCli;
    public static volatile SingularAttribute<Usager, String> prenomCli;
    public static volatile CollectionAttribute<Usager, Reservation> reservation;
    public static volatile SingularAttribute<Usager, String> pseudo;

}