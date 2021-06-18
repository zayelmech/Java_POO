public class Doctor {
    static int id =0 ; //autoincrement
    String name;
    String speciality;
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
