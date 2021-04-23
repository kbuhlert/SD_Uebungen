package Strategy_Mitarbeiterprovision2_Training;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeitermanager {
    private List<MitarbeiterInnen> alleMitarbeiter;
    private Provision provision;

    public Mitarbeitermanager(Provision provision) {
        this.provision = provision;
        this.alleMitarbeiter = new ArrayList<>();
    }

    public void addMitarbeiter(MitarbeiterInnen m){
        alleMitarbeiter.add(m);
    }

    public void provisionberechnung(){
        for(MitarbeiterInnen m:alleMitarbeiter){
            provision.provisionsberechnung(m);
        }
    }

    public void setProvision(Provision provision) {
        this.provision = provision;
    }
}
