import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args){

        //showMenu();
/*
        Patient paciente1= new Patient("Abdiel","abdielcro");
        Patient paciente2= new Patient("Jesus","jesus");

        System.out.println(paciente1);// se imprime la direción de memoria
        System.out.println(paciente2);


        System.out.println("Si se asigna: \n\tpaciente2= paciente1;");
        paciente2= paciente1;
        System.out.println("la direccion de memoria del objeto 2 ahora apunta a la misma que del objeto 1"+"\n");
        System.out.println(paciente1);
        System.out.println(paciente2);

    */

        Doctor myDoctor = new Doctor("Abdiel","Pediatra");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10pm");
        myDoctor.addAvailableAppointment(new Date(),"8am");
        System.out.println(myDoctor.getAvailableAppointments());
        for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+ "\t" +aA.getTime());
        }

        System.out.println("\n");
        Patient paciente= new Patient("Abdiel","abdielcro");
        paciente.setWeight(43);
        //System.out.println(paciente.getWeight());
        System.out.println(paciente);
    }
}
