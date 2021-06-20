import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email) {
        super(name,email);
        //this.speciality = speciality;
    }

    //Comportamientos o metodos

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
