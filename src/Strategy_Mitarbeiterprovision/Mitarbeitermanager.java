package Strategy_Mitarbeiterprovision;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeitermanager {
    public List<Mitarbeiter> mitarbeitermanager;
    private Provision provision;

    public Mitarbeitermanager(Provision p) {
        this.mitarbeitermanager = new ArrayList<Mitarbeiter>();
        this.provision = p;
    }

    public void addMitarbeiter (Mitarbeiter m){
        mitarbeitermanager.add(m);
    }

    public void setProvision(Provision provision) {
        this.provision = provision;
    }

    public void provisionsBerechnung(){
        for(Mitarbeiter m : mitarbeitermanager){
                provision.provisionsberechnung(m);
        }
    }
}
