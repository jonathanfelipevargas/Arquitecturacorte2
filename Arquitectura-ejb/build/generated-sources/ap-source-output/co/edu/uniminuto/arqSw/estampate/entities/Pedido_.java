package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.CamisetaHasEstampa;
import co.edu.uniminuto.arqSw.estampate.entities.Cliente;
import co.edu.uniminuto.arqSw.estampate.entities.PedidoPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, String> barrio;
    public static volatile ListAttribute<Pedido, CamisetaHasEstampa> camisetaHasEstampaList;
    public static volatile SingularAttribute<Pedido, Double> valorPedido;
    public static volatile SingularAttribute<Pedido, String> pais;
    public static volatile SingularAttribute<Pedido, String> correoDestinatario;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, String> direccionDestino;
    public static volatile SingularAttribute<Pedido, PedidoPK> pedidoPK;
    public static volatile SingularAttribute<Pedido, String> ciudad;
    public static volatile SingularAttribute<Pedido, Date> fechaPeticion;
    public static volatile SingularAttribute<Pedido, Date> fechaEntrega;
    public static volatile SingularAttribute<Pedido, String> estadoPedido;
    public static volatile SingularAttribute<Pedido, String> telefonoRemitente;

}