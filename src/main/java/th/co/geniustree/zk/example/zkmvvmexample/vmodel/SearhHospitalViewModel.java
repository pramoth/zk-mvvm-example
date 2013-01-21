/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.zk.example.zkmvvmexample.vmodel;

import java.util.List;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zkplus.spring.SpringUtil;
import th.co.geniustree.zk.example.zkmvvmexample.model.Hospital;
import th.co.geniustree.zk.example.zkmvvmexample.repo.HospitalRepo;

/**
 *
 * @author pramoth
 */
public class SearhHospitalViewModel {
    private String keyword;
    private List<Hospital> hospitals;
    private Hospital selectedHospital;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public Hospital getSelectedHospital() {
        return selectedHospital;
    }

    public void setSelectedHospital(Hospital selectedHospital) {
        this.selectedHospital = selectedHospital;
    }
    
    @Command
    @NotifyChange("hospitals")
    public void search(){
        hospitals = SpringUtil.getApplicationContext().getBean(HospitalRepo.class)
                .findByHmainLikeOrHnameLike(keyword,"%"+keyword+"%");
        if(!hospitals.isEmpty()){
            selectedHospital = hospitals.get(0);
        }
    }
    @Command
    @NotifyChange("hospitals")
    public void changeHname(){
        selectedHospital.setHname("xxxxxxxxxxxxxxxxxx");
    }
}
