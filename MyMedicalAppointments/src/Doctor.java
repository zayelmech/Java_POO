public class Doctor {
    static int id =0 ; //autoincrement
    String name;
    String speciality;

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
}
