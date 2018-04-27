/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "imagen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagen.findAll", query = "SELECT i FROM Imagen i"),
    @NamedQuery(name = "Imagen.findByIdImagen", query = "SELECT i FROM Imagen i WHERE i.imagenPK.idImagen = :idImagen"),
    @NamedQuery(name = "Imagen.findByNombreImagen", query = "SELECT i FROM Imagen i WHERE i.nombreImagen = :nombreImagen"),
    @NamedQuery(name = "Imagen.findByUbicacion", query = "SELECT i FROM Imagen i WHERE i.ubicacion = :ubicacion"),
    @NamedQuery(name = "Imagen.findByEstampaidEstampa", query = "SELECT i FROM Imagen i WHERE i.imagenPK.estampaidEstampa = :estampaidEstampa"),
    @NamedQuery(name = "Imagen.findByEstampaArtistaidArstista", query = "SELECT i FROM Imagen i WHERE i.imagenPK.estampaArtistaidArstista = :estampaArtistaidArstista"),
    @NamedQuery(name = "Imagen.findByEstampaArtistaUsuarioidUsuario", query = "SELECT i FROM Imagen i WHERE i.imagenPK.estampaArtistaUsuarioidUsuario = :estampaArtistaUsuarioidUsuario")})
public class Imagen implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImagenPK imagenPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreImagen")
    private String nombreImagen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ubicacion")
    private String ubicacion;
    @JoinColumns({
        @JoinColumn(name = "Estampa_idEstampa", referencedColumnName = "idEstampa", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_idArstista", referencedColumnName = "Artista_idArstista", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_Usuario_idUsuario", referencedColumnName = "Artista_Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Estampa estampa;

    public Imagen() {
    }

    public Imagen(ImagenPK imagenPK) {
        this.imagenPK = imagenPK;
    }

    public Imagen(ImagenPK imagenPK, String nombreImagen, String ubicacion) {
        this.imagenPK = imagenPK;
        this.nombreImagen = nombreImagen;
        this.ubicacion = ubicacion;
    }

    public Imagen(int idImagen, int estampaidEstampa, int estampaArtistaidArstista, int estampaArtistaUsuarioidUsuario) {
        this.imagenPK = new ImagenPK(idImagen, estampaidEstampa, estampaArtistaidArstista, estampaArtistaUsuarioidUsuario);
    }

    public ImagenPK getImagenPK() {
        return imagenPK;
    }

    public void setImagenPK(ImagenPK imagenPK) {
        this.imagenPK = imagenPK;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imagenPK != null ? imagenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagen)) {
            return false;
        }
        Imagen other = (Imagen) object;
        if ((this.imagenPK == null && other.imagenPK != null) || (this.imagenPK != null && !this.imagenPK.equals(other.imagenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.Imagen[ imagenPK=" + imagenPK + " ]";
    }
    
}
