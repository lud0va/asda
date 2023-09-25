public class Medicos extends Trabajadores {
      private String especialidad;
      private int nºguardias25h;



    public Medicos(String nombre, String dni,double sueldo, Direccion direccion, String fechadealta,String especialidad, int nguard) {
        super(nombre, dni, sueldo, direccion, fechadealta);
        this.especialidad=especialidad;    this.nºguardias25h=nguard;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public double calcularSalario(double salario) {
        double salarioreal=salario+(salario*(100/(nºguardias25h*5)));
        return salarioreal;
    }


}
