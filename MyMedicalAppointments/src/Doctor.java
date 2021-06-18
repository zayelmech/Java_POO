public class Doctor {
    int id;
    String name;
    String speciality;
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
