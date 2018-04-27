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
@Table(name = "tema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tema.findAll", query = "SELECT t FROM Tema t"),
    @NamedQuery(name = "Tema.findByIdTema", query = "SELECT t FROM Tema t WHERE t.temaPK.idTema = :idTema"),
    @NamedQuery(name = "Tema.findByNombreTema", query = "SELECT t FROM Tema t WHERE t.nombreTema = :nombreTema"),
    @NamedQuery(name = "Tema.findByEstampaidEstampa", query = "SELECT t FROM Tema t WHERE t.temaPK.estampaidEstampa = :estampaidEstampa"),
    @NamedQuery(name = "Tema.findByEstampaArtistaidArstista", query = "SELECT t FROM Tema t WHERE t.temaPK.estampaArtistaidArstista = :estampaArtistaidArstista"),
    @NamedQuery(name = "Tema.findByEstampaArtistaUsuarioidUsuario", query = "SELECT t FROM Tema t WHERE t.temaPK.estampaArtistaUsuarioidUsuario = :estampaArtistaUsuarioidUsuario")})
public class Tema implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TemaPK temaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreTema")
    private String nombreTema;
    @JoinColumns({
        @JoinColumn(name = "Estampa_idEstampa", referencedColumnName = "idEstampa", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_idArstista", referencedColumnName = "Artista_idArstista", insertable = false, updatable = false),
        @JoinColumn(name = "Estampa_Artista_Usuario_idUsuario", referencedColumnName = "Artista_Usuario_idUsuario", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Estampa estampa;

    public Tema() {
    }

    public Tema(TemaPK temaPK) {
        this.temaPK = temaPK;
    }

    public Tema(TemaPK temaPK, String nombreTema) {
        this.temaPK = temaPK;
        this.nombreTema = nombreTema;
    }

    public Tema(int idTema, int estampaidEstampa, int estampaArtistaidArstista, int estampaArtistaUsuarioidUsuario) {
        this.temaPK = new TemaPK(idTema, estampaidEstampa, estampaArtistaidArstista, estampaArtistaUsuarioidUsuario);
    }

    public TemaPK getTemaPK() {
        return temaPK;
    }

    public void setTemaPK(TemaPK temaPK) {
        this.temaPK = temaPK;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
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
        hash += (temaPK != null ? temaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tema)) {
            return false;
        }
        Tema other = (Tema) object;
        if ((this.temaPK == null && other.temaPK != null) || (this.temaPK != null && !this.temaPK.equals(other.temaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniminuto.arqSw.estampate.entities.Tema[ temaPK=" + temaPK + " ]";
    }
    
}
