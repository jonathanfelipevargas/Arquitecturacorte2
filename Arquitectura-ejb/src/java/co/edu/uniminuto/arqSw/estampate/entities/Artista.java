/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "artista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artista.findAll", query = "SELECT a FROM Artista a"),
    @NamedQuery(name = "Artista.findByIdArstista", query = "SELECT a FROM Artista a WHERE a.artistaPK.idArstista = :idArstista"),
    @NamedQuery(name = "Artista.findByNombreArtistico", query = "SELECT a FROM Artista a WHERE a.nombreArtistico = :nombreArtistico"),
    @NamedQuery(name = "Artista.findByBiografiaArtista", query = "SELECT a FROM Artista a WHERE a.biografiaArtista = :biografiaArtista"),
    @NamedQuery(name = "Artista.findByCiudadArtista", query = "SELECT a FROM Artista a WHERE a.ciudadArtista = :ciudadArtista"),
    @NamedQuery(name = "Artista.findByUsuarioidUsuario", query = "SELECT a FROM Artista a WHERE a.artistaPK.usuarioidUsuario = :usuarioidUsuario")})
public class Artista implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArtistaPK artistaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreArtistico")
    private String nombreArtistico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "biografiaArtista")
    private String biografiaArtista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ciudadArtista")
    private String ciudadArtista;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artista")
    private List<Estampa> estampaList;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Artista() {
    }

    public Artista(ArtistaPK artistaPK) {
        this.artistaPK = artistaPK;
    }

    public Artista(ArtistaPK artistaPK, String nombreArtistico, String biografiaArtista, String ciudadArtista) {
        this.artistaPK = artistaPK;
        this.nombreArtistico = nombreArtistico;
        this.biografiaArtista = biografiaArtista;
        this.ciudadArtista = ciudadArtista;
    }

    public Artista(int idArstista, int usuarioidUsuario) {
        this.artistaPK = new ArtistaPK(idArstista, usuarioidUsuario);
    }

    public ArtistaPK getArtistaPK() {
        return artistaPK;
    }

    public void setArtistaPK(ArtistaPK artistaPK) {
        this.artistaPK = artistaPK;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getBiografiaArtista() {
        return biografiaArtista;
    }

    public void setBiografiaArtista(String biografiaArtista) {
        this.biografiaArtista = biografiaArtista;
    }

    public String getCiudadArtista() {
        return ciudadArtista;
    }

    public void setCiudadArtista(String ciudadArtista) {
        this.ciudadArtista = ciudadArtista;
    }

    @XmlTransient
    public List<Estampa> getEstampaList() {
        return estampaList;
    }

    public void setEstampaList(List<Estampa> estampaList) {
        this.estampaList = estampaList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artistaPK != null ? artistaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artista)) {
            return false;
        }
        Artista other = (Artista) object;
        if ((this.artistaPK == null && other.artistaPK != null) || (this.artistaPK != null && !this.artistaPK.equals(other.artistaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.Artista[ artistaPK=" + artistaPK + " ]";
    }
    
}
