package co.edu.uniminuto.arqSw.estampate.entities;

import co.edu.uniminuto.arqSw.estampate.entities.ArtistaPK;
import co.edu.uniminuto.arqSw.estampate.entities.Estampa;
import co.edu.uniminuto.arqSw.estampate.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-27T17:00:05")
@StaticMetamodel(Artista.class)
public class Artista_ { 

    public static volatile SingularAttribute<Artista, String> ciudadArtista;
    public static volatile SingularAttribute<Artista, String> biografiaArtista;
    public static volatile SingularAttribute<Artista, String> nombreArtistico;
    public static volatile SingularAttribute<Artista, Usuario> usuario;
    public static volatile SingularAttribute<Artista, ArtistaPK> artistaPK;
    public static volatile ListAttribute<Artista, Estampa> estampaList;

}