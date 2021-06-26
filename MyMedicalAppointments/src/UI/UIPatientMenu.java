package UI;

import model.Doctor;

import javax.print.Doc;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response=0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome to the Hospital C." + UIMenu.patientLogged);
            System.out.println("1. Book an Appointment ");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout  ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    break;
                case 2:
                    break;

                case 0:
                    UIMenu.showMenu();
                    break;

            }

        }while (response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response=0;
        do {
            System.out.println(":: Book an Appointment ");
            System.out.println(":: Select date--->");

            //Numeracion de la lista de fechas
            //Indice de la fecha que seleccione nuestro paciente
            //
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments  = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k+". "+availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                    
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            
        }while (response!=0);
    }
}
