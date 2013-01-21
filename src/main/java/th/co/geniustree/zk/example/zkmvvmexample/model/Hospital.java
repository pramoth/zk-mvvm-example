/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.zk.example.zkmvvmexample.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.eclipse.persistence.annotations.ReadOnly;

/**
 *
 * @author pramoth
 */
@Entity
@ReadOnly
public class Hospital implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String hmain;
    private String hname;

    public String getHmain() {
        return hmain;
    }

    public void setHmain(String hmain) {
        this.hmain = hmain;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.hmain != null ? this.hmain.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        if ((this.hmain == null) ? (other.hmain != null) : !this.hmain.equals(other.hmain)) {
            return false;
        }
        return true;
    }
   
    
}
