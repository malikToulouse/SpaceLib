package Entities;

import Entities.Navette;
import Entities.Station;
import Entities.Usager;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T12:42:37")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Navette> navette;
    public static volatile SingularAttribute<Reservation, Long> idCli;
    public static volatile SingularAttribute<Reservation, Integer> nbPassager;
    public static volatile SingularAttribute<Reservation, Station> stationD;
    public static volatile SingularAttribute<Reservation, Usager> usager;
    public static volatile SingularAttribute<Reservation, Long> idNavette;
    public static volatile SingularAttribute<Reservation, Station> stationA;
    public static volatile SingularAttribute<Reservation, Date> dateReservationD;
    public static volatile SingularAttribute<Reservation, Date> dateReservationA;

}