package Entities;

import Entities.Navette;
import Entities.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T21:30:58")
@StaticMetamodel(Quai.class)
public class Quai_ { 

    public static volatile SingularAttribute<Quai, Navette> navette;
    public static volatile SingularAttribute<Quai, Long> idQuai;
    public static volatile SingularAttribute<Quai, Station> station;

}