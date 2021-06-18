import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args){
/*
        //Declarar e instanciar un object
        Doctor myDoctor = new Doctor();
        myDoctor.name="Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
*/
        //showMenu();

        Patient paciente1= new Patient("Abdiel","abdielcro");
        Patient paciente2= new Patient("Jesus","jesus");

        System.out.println(paciente1);// se imprime la direción de memoria
        System.out.println(paciente2);


        System.out.println("Si se asigna: \n\tpaciente2= paciente1;");
        paciente2= paciente1;
        System.out.println("la direccion de memoria del objeto 2 ahora apunta a la misma que del objeto 1"+"\n");
        System.out.println(paciente1);
        System.out.println(paciente2);


    }
}
