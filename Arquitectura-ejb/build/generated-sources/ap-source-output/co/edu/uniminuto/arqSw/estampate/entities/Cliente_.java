package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.ClienteHasEstampa;
import co.edu.uniminuto.arqSw.estampate.entities.ClientePK;
import co.edu.uniminuto.arqSw.estampate.entities.Pedido;
import co.edu.uniminuto.arqSw.estampate.entities.Tarjeta;
import co.edu.uniminuto.arqSw.estampate.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> tipoCliente;
    public static volatile SingularAttribute<Cliente, ClientePK> clientePK;
    public static volatile ListAttribute<Cliente, Tarjeta> tarjetaList;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, Usuario> usuario;
    public static volatile ListAttribute<Cliente, ClienteHasEstampa> clienteHasEstampaList;

}