package UI;

import java.time.Month;
import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response =0;
        do {
            System.out.println("\n\nDoctor");
            System.out.println("Welcome "+UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My schedule appointment");
            System.out.println("3. Logout ");

            Scanner sc= new Scanner(System.in);
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
    private static void showAddAvailableAppointmentsMenu(){
        int response =0;
        do {
            System.out.println(":: Add Available Appointments");
            System.out.println("Select a month ");
            for(int i=0; i<3 ; i++){
                int j = i +1;
                System.out.println(j+". "+ UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc= new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if(response>0 && response<4){
                //1,2,3
                int monthSelected=response;
                System.out.println(monthSelected +". "+ UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the day available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Your date is : "+ date +"\n1. Correct\n2.Change");

            }else if(response==0){
                showDoctorMenu();
                int monthSelected=response;
            }
        }while (response!=0);
    }
}
