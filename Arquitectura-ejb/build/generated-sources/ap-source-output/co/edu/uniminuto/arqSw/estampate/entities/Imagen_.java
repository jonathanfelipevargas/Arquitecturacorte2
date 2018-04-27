package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.Estampa;
import co.edu.uniminuto.arqSw.estampate.entities.ImagenPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Imagen.class)
public class Imagen_ { 

    public static volatile SingularAttribute<Imagen, Estampa> estampa;
    public static volatile SingularAttribute<Imagen, String> ubicacion;
    public static volatile SingularAttribute<Imagen, ImagenPK> imagenPK;
    public static volatile SingularAttribute<Imagen, String> nombreImagen;

}