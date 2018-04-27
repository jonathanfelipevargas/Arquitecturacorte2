package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.CamisetaHasEstampaPK;
import co.edu.uniminuto.arqSw.estampate.entities.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(CamisetaHasEstampa.class)
public class CamisetaHasEstampa_ { 

    public static volatile SingularAttribute<CamisetaHasEstampa, CamisetaHasEstampaPK> camisetaHasEstampaPK;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> texto;
    public static volatile SingularAttribute<CamisetaHasEstampa, Integer> cantdad;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> tallaCamiseta;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> estiloCamiseta;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> ubicacionFrontalEstampado;
    public static volatile SingularAttribute<CamisetaHasEstampa, Pedido> pedido;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> ubicacionPosteriorEstampado;
    public static volatile SingularAttribute<CamisetaHasEstampa, String> colorCamiseta;

}