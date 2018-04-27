package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.Artista;
import co.edu.uniminuto.arqSw.estampate.entities.ClienteHasEstampa;
import co.edu.uniminuto.arqSw.estampate.entities.EstampaPK;
import co.edu.uniminuto.arqSw.estampate.entities.Imagen;
import co.edu.uniminuto.arqSw.estampate.entities.Tema;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Estampa.class)
public class Estampa_ { 

    public static volatile SingularAttribute<Estampa, String> estado;
    public static volatile SingularAttribute<Estampa, String> ubicacionFoto;
    public static volatile SingularAttribute<Estampa, Artista> artista;
    public static volatile SingularAttribute<Estampa, Double> pupularidad;
    public static volatile SingularAttribute<Estampa, Double> rating;
    public static volatile SingularAttribute<Estampa, EstampaPK> estampaPK;
    public static volatile SingularAttribute<Estampa, String> nombre;
    public static volatile ListAttribute<Estampa, ClienteHasEstampa> clienteHasEstampaList;
    public static volatile SingularAttribute<Estampa, Double> precio;
    public static volatile ListAttribute<Estampa, Imagen> imagenList;
    public static volatile SingularAttribute<Estampa, Double> ancho;
    public static volatile SingularAttribute<Estampa, Double> largo;
    public static volatile ListAttribute<Estampa, Tema> temaList;

}