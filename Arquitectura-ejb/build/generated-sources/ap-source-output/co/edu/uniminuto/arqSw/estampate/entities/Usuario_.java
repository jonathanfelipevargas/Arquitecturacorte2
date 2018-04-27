package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.Artista;
import co.edu.uniminuto.arqSw.estampate.entities.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, Date> fechaRegistro;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> passwordUsuario;
    public static volatile SingularAttribute<Usuario, String> categoria;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;
    public static volatile ListAttribute<Usuario, Artista> artistaList;
    public static volatile SingularAttribute<Usuario, String> apellidoUusario;
    public static volatile ListAttribute<Usuario, Cliente> clienteList;
    public static volatile SingularAttribute<Usuario, String> estadoUsuario;
    public static volatile SingularAttribute<Usuario, String> celularUusuario;
    public static volatile SingularAttribute<Usuario, String> sexoUsuario;
    public static volatile SingularAttribute<Usuario, String> correoElectronico;

}