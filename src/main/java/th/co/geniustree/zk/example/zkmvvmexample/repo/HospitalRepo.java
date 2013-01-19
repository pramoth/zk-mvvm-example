/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.zk.example.zkmvvmexample.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.zk.example.zkmvvmexample.model.Hospital;

/**
 *
 * @author pramoth
 */
public interface HospitalRepo extends JpaRepository<Hospital, String> {
    
}
