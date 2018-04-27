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
public class EstampaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idEstampa")
    private int idEstampa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Artista_idArstista")
    private int artistaidArstista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Artista_Usuario_idUsuario")
    private int artistaUsuarioidUsuario;

    public EstampaPK() {
    }

    public EstampaPK(int idEstampa, int artistaidArstista, int artistaUsuarioidUsuario) {
        this.idEstampa = idEstampa;
        this.artistaidArstista = artistaidArstista;
        this.artistaUsuarioidUsuario = artistaUsuarioidUsuario;
    }

    public int getIdEstampa() {
        return idEstampa;
    }

    public void setIdEstampa(int idEstampa) {
        this.idEstampa = idEstampa;
    }

    public int getArtistaidArstista() {
        return artistaidArstista;
    }

    public void setArtistaidArstista(int artistaidArstista) {
        this.artistaidArstista = artistaidArstista;
    }

    public int getArtistaUsuarioidUsuario() {
        return artistaUsuarioidUsuario;
    }

    public void setArtistaUsuarioidUsuario(int artistaUsuarioidUsuario) {
        this.artistaUsuarioidUsuario = artistaUsuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEstampa;
        hash += (int) artistaidArstista;
        hash += (int) artistaUsuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstampaPK)) {
            return false;
        }
        EstampaPK other = (EstampaPK) object;
        if (this.idEstampa != other.idEstampa) {
            return false;
        }
        if (this.artistaidArstista != other.artistaidArstista) {
            return false;
        }
        if (this.artistaUsuarioidUsuario != other.artistaUsuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.EstampaPK[ idEstampa=" + idEstampa + ", artistaidArstista=" + artistaidArstista + ", artistaUsuarioidUsuario=" + artistaUsuarioidUsuario + " ]";
    }
    
}
