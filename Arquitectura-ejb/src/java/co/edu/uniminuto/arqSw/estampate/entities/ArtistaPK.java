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
public class ArtistaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idArstista")
    private int idArstista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_idUsuario")
    private int usuarioidUsuario;

    public ArtistaPK() {
    }

    public ArtistaPK(int idArstista, int usuarioidUsuario) {
        this.idArstista = idArstista;
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public int getIdArstista() {
        return idArstista;
    }

    public void setIdArstista(int idArstista) {
        this.idArstista = idArstista;
    }

    public int getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(int usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idArstista;
        hash += (int) usuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArtistaPK)) {
            return false;
        }
        ArtistaPK other = (ArtistaPK) object;
        if (this.idArstista != other.idArstista) {
            return false;
        }
        if (this.usuarioidUsuario != other.usuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.ArtistaPK[ idArstista=" + idArstista + ", usuarioidUsuario=" + usuarioidUsuario + " ]";
    }
    
}
