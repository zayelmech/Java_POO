import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id =0 ; //autoincrement
    private String name;
    private String email;
    private String speciality;

    public Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos o metodos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }

    ArrayList<AvailableAppointment> availableAppointments =new ArrayList<>();
    public void addAvailableAppointment(Date date,String time){
        availableAppointments.add(new AvailableAppointment(date,time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return  availableAppointments;
    }
    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

       public AvailableAppointment(Date date,String time){
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
