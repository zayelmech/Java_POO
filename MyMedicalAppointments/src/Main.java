import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        //showMenu();
/*
        model.Patient paciente1= new model.Patient("Abdiel","abdielcro");
        model.Patient paciente2= new model.Patient("Jesus","jesus");

        System.out.println(paciente1);// se imprime la direción de memoria
        System.out.println(paciente2);


        System.out.println("Si se asigna: \n\tpaciente2= paciente1;");
        paciente2= paciente1;
        System.out.println("la direccion de memoria del objeto 2 ahora apunta a la misma que del objeto 1"+"\n");
        System.out.println(paciente1);
        System.out.println(paciente2);

    */
        /*
        Doctor myDoctor = new Doctor("Abdiel","abdielcro@imecatro.com");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10pm");
        myDoctor.addAvailableAppointment(new Date(),"8am");

        System.out.println(myDoctor);

        System.out.println("\n");
        Patient paciente= new Patient("Abdiel","abdielcro");
        paciente.setWeight(43);
        //System.out.println(paciente.getWeight());
        System.out.println(paciente);
        */

        //Tambien se puede
        User user = new Doctor("Abdiel","abdielcro@imecatro.com");
        user.showDataUser();

        User userPa = new Patient("Abdiel","abdielcro");
        userPa.setId(12);
        userPa.showDataUser();
    }
}
