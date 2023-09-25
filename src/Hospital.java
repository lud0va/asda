import java.util.Arrays;
import java.util.Scanner;

public class Hospital {

Trabajadores trab[];
    public Hospital() {
        trab=new Trabajadores[6];
        trab[0]=new Enfermeros("Pepe","1234141N",(Math.random()*2800)-1200,new Direccion("Cervantes","Madrid"),"12/12/09",22);
        trab[1]=new Enfermeros("Dulcinea","1413512L",(Math.random()*2800)-1200,new Direccion("Vallecas","12312"),"11/07/01",12);
        trab[2]= new Enfermeros("Manolita","972718P",(Math.random()*2800)-1200,new Direccion("San blas","01219"),"07/06/00",9);
        trab[3]=new Medicos("Jake","12310Op",(Math.random()*5000)-2000,new Direccion("Las Rosas","12341"),"01/11/02","Cirujano",11);
        trab[4]=new Medicos("Hersey","98192q",(Math.random()*5000)-2000,new Direccion("San roman","191732"),"21/05/03","Neurocirujano",23);

    }
     public void añadirempleado(Trabajadores trabajadores){
         for (int i = 0; i <trab.length ; i++) {
             if (trab[i]==null){
                 trab[i]=trabajadores;
             }
         }

     }
     public void consultaEmpleado(String localidad){

         for (int i = 0; i < 4; i++) {
             if (trab[i].getDireccion().getLocalizacion().compareTo(localidad)==0){
                 trab[i].toString();

             }

         }
     }
     public void actAltaNif(){
         Scanner nscanner=new Scanner(System.in);
         boolean flag = false;
         do {


             System.out.println("Introduzca el dni del empleado y la nueva fecha que quiera darle");
             String nsdni = nscanner.next();
             String nsfecha = nscanner.next();


             for (int i = 0; i < 4; i++) {

                 if (trab[i].getDni().compareTo(nsdni) == 0) {

                     trab[i].setFechadealta(nsfecha);
                     flag = true;
                 }
             }
             System.out.println("dni invalido");
         }while (flag==false);
     }

     public boolean ActGuard(String dni){

         for (int i = 0; i < 4; i++) {

             if (trab[i].getDni().compareTo(dni)==0){
                 return true;

             }
         }
         return false;
     }
     public void elimempl(String dni){
         for (int i = 0; i <4 ; i++) {
              if (trab[i].getDni().compareTo(dni)==0){
                  trab[i]=null;

              }

         }
     }
     public void calcSalar(){
        double total=0;
         for (int i = 3; i <4 ; i++) {
             System.out.println(trab[i].toString());
             trab[i].calcularSalario(trab[i].getSueldo());
             total=total+trab[i].getSueldo();
         }
         System.out.println("El total es "+total);
     }
     public  void ordenar(){

        Arrays.sort(trab);
         for (int i = 0; i < trab.length-1; i++) {
             if (trab[i].getNombre().charAt(1)>trab[i+1].getNombre().charAt(1)){
                 cont = trab[i];
                 trab[i]=trab[i+1];
                 trab[i+1]=cont;

             }

         }
     }

    @Override
    public String toString() {
        return super.toString();
    }
}
