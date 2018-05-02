package Entities;

import Entities.Quai;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T21:30:58")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, Long> idStation;
    public static volatile CollectionAttribute<Station, Quai> quaiCollection;
    public static volatile SingularAttribute<Station, String> nomStation;
    public static volatile SingularAttribute<Station, Boolean> mes;
    public static volatile SingularAttribute<Station, String> lieuStation;

}