package Entities;

import Entities.Mecanicien;
import Entities.Navette;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-05-02T21:30:58")
@StaticMetamodel(Revision.class)
public class Revision_ { 

    public static volatile SingularAttribute<Revision, Date> dateRevisionF;
    public static volatile SingularAttribute<Revision, Navette> navette;
    public static volatile SingularAttribute<Revision, Mecanicien> mecanicien;
    public static volatile SingularAttribute<Revision, Long> idCli;
    public static volatile SingularAttribute<Revision, Date> dateRevisionD;
    public static volatile SingularAttribute<Revision, Long> idNavette;

}