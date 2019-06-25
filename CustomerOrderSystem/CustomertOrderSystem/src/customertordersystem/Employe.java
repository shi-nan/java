/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customertordersystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "Employe", catalog = "COSSS", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e")
    , @NamedQuery(name = "Employe.findByEno", query = "SELECT e FROM Employe e WHERE e.eno = :eno")
    , @NamedQuery(name = "Employe.findByEname", query = "SELECT e FROM Employe e WHERE e.ename = :ename")
    , @NamedQuery(name = "Employe.findByEage", query = "SELECT e FROM Employe e WHERE e.eage = :eage")
    , @NamedQuery(name = "Employe.findByEbno", query = "SELECT e FROM Employe e WHERE e.ebno = :ebno")
    , @NamedQuery(name = "Employe.findByEwork", query = "SELECT e FROM Employe e WHERE e.ework = :ework")
    , @NamedQuery(name = "Employe.findByEtel", query = "SELECT e FROM Employe e WHERE e.etel = :etel")})
public class Employe implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Eno")
    private Integer eno;
    @Basic(optional = false)
    @Column(name = "Ename")
    private String ename;
    @Basic(optional = false)
    @Column(name = "Eage")
    private int eage;
    @Column(name = "Ebno")
    private Integer ebno;
    @Column(name = "Ework")
    private String ework;
    @Basic(optional = false)
    @Column(name = "Etel")
    private String etel;

    public Employe() {
    }

    public Employe(Integer eno) {
        this.eno = eno;
    }

    public Employe(Integer eno, String ename, int eage, String etel) {
        this.eno = eno;
        this.ename = ename;
        this.eage = eage;
        this.etel = etel;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        Integer oldEno = this.eno;
        this.eno = eno;
        changeSupport.firePropertyChange("eno", oldEno, eno);
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        String oldEname = this.ename;
        this.ename = ename;
        changeSupport.firePropertyChange("ename", oldEname, ename);
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        int oldEage = this.eage;
        this.eage = eage;
        changeSupport.firePropertyChange("eage", oldEage, eage);
    }

    public Integer getEbno() {
        return ebno;
    }

    public void setEbno(Integer ebno) {
        Integer oldEbno = this.ebno;
        this.ebno = ebno;
        changeSupport.firePropertyChange("ebno", oldEbno, ebno);
    }

    public String getEwork() {
        return ework;
    }

    public void setEwork(String ework) {
        String oldEwork = this.ework;
        this.ework = ework;
        changeSupport.firePropertyChange("ework", oldEwork, ework);
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        String oldEtel = this.etel;
        this.etel = etel;
        changeSupport.firePropertyChange("etel", oldEtel, etel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eno != null ? eno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.eno == null && other.eno != null) || (this.eno != null && !this.eno.equals(other.eno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "customertordersystem.Employe[ eno=" + eno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
