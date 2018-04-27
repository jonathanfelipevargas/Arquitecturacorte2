/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.estampate.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jonathan
 */
@Embeddable
public class ImagenPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idImagen")
    private int idImagen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estampa_idEstampa")
    private int estampaidEstampa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estampa_Artista_idArstista")
    private int estampaArtistaidArstista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estampa_Artista_Usuario_idUsuario")
    private int estampaArtistaUsuarioidUsuario;

    public ImagenPK() {
    }

    public ImagenPK(int idImagen, int estampaidEstampa, int estampaArtistaidArstista, int estampaArtistaUsuarioidUsuario) {
        this.idImagen = idImagen;
        this.estampaidEstampa = estampaidEstampa;
        this.estampaArtistaidArstista = estampaArtistaidArstista;
        this.estampaArtistaUsuarioidUsuario = estampaArtistaUsuarioidUsuario;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public int getEstampaidEstampa() {
        return estampaidEstampa;
    }

    public void setEstampaidEstampa(int estampaidEstampa) {
        this.estampaidEstampa = estampaidEstampa;
    }

    public int getEstampaArtistaidArstista() {
        return estampaArtistaidArstista;
    }

    public void setEstampaArtistaidArstista(int estampaArtistaidArstista) {
        this.estampaArtistaidArstista = estampaArtistaidArstista;
    }

    public int getEstampaArtistaUsuarioidUsuario() {
        return estampaArtistaUsuarioidUsuario;
    }

    public void setEstampaArtistaUsuarioidUsuario(int estampaArtistaUsuarioidUsuario) {
        this.estampaArtistaUsuarioidUsuario = estampaArtistaUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idImagen;
        hash += (int) estampaidEstampa;
        hash += (int) estampaArtistaidArstista;
        hash += (int) estampaArtistaUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImagenPK)) {
            return false;
        }
        ImagenPK other = (ImagenPK) object;
        if (this.idImagen != other.idImagen) {
            return false;
        }
        if (this.estampaidEstampa != other.estampaidEstampa) {
            return false;
        }
        if (this.estampaArtistaidArstista != other.estampaArtistaidArstista) {
            return false;
        }
        if (this.estampaArtistaUsuarioidUsuario != other.estampaArtistaUsuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.ImagenPK[ idImagen=" + idImagen + ", estampaidEstampa=" + estampaidEstampa + ", estampaArtistaidArstista=" + estampaArtistaidArstista + ", estampaArtistaUsuarioidUsuario=" + estampaArtistaUsuarioidUsuario + " ]";
    }
    
}
