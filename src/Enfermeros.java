public class Enfermeros extends Trabajadores{
  private int ndepacientes;

    public Enfermeros(String nombre, String dni, double sueldo, Direccion direccion, String fechadealta,int ndepacientes) {
        super(nombre, dni, sueldo, direccion, fechadealta);
        this.ndepacientes=ndepacientes;
    }


    @Override
    public double calcularSalario(int salario) {
        double salarioreal=salario+(salario*0.1);
        return salarioreal;
    }

    @Override
    public String toString() {
        return "Enfermeros{" +
                "ndepacientes=" + ndepacientes +
                '}';
    }
}
