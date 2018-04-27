package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.Cliente;
import co.edu.uniminuto.arqSw.estampate.entities.ClienteHasEstampaPK;
import co.edu.uniminuto.arqSw.estampate.entities.Estampa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(ClienteHasEstampa.class)
public class ClienteHasEstampa_ { 

    public static volatile SingularAttribute<ClienteHasEstampa, Estampa> estampa;
    public static volatile SingularAttribute<ClienteHasEstampa, Cliente> cliente;
    public static volatile SingularAttribute<ClienteHasEstampa, Integer> calificacion;
    public static volatile SingularAttribute<ClienteHasEstampa, ClienteHasEstampaPK> clienteHasEstampaPK;

}