package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.Cliente;
import co.edu.uniminuto.arqSw.estampate.entities.TarjetaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Tarjeta.class)
public class Tarjeta_ { 

    public static volatile SingularAttribute<Tarjeta, Cliente> cliente;
    public static volatile SingularAttribute<Tarjeta, String> tipo;
    public static volatile SingularAttribute<Tarjeta, String> bancoTarjeta;
    public static volatile SingularAttribute<Tarjeta, TarjetaPK> tarjetaPK;
    public static volatile SingularAttribute<Tarjeta, String> numeroTarjeta;

}