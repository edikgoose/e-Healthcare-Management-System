package innopolis.university.frontends;

import innopolis.university.system.SpecializationEnum;
import innopolis.university.users.SystemManager;

import java.io.PrintWriter;


public final class SystemManagerFrontend extends Frontend {

    private final SystemManager systemManager;

    public SystemManagerFrontend(PrintWriter writer, SystemManager systemManager) {
        super(writer);
        this.systemManager = systemManager;
    }

    @Override
    public void start() { }

    public void addMedicineClicked(){
        systemManager.addMedicine();
    }

    public void hireDoctorClicked(String login, String password, String name, SpecializationEnum specialization){
        systemManager.hireDoctor(login, password, name, specialization);
    }
    public void fireDoctorClicked(int doctorId){
        systemManager.fireDoctor(doctorId);
    }

    public void hireNurseClicked(String login, String password, String name, SpecializationEnum specialization){
        systemManager.hireNurse(login, password, name, specialization);

    }
    public void fireNurseClicked(int nurseId){
        systemManager.fireNurse(nurseId);
    }

    public void hireClerkClicked(String login, String password, String name){
        systemManager.hireClerk(login, password, name);
    }
    public void fireClerkClicked(int clerkId){
        systemManager.fireNurse(clerkId);
    }
}
