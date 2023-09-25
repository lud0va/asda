public abstract class Trabajadores {
    private String nombre;
    private String dni;
    private double sueldo;
    private Direccion direccion;
    private String fechadealta;

    public String getNombre() {
        return nombre;
    }

    public Trabajadores(String nombre, String dni, double sueldo, Direccion direccion, String fechadealta){
        this.nombre=nombre; this.dni=dni; this.sueldo=sueldo; this.direccion=direccion; this.fechadealta=fechadealta;

    }


    public double getSueldo() {
        return sueldo;
    }

    public abstract  double calcularSalario(double salario);

    public String getFechadealta() {
        return fechadealta;
    }

    public String getDni() {
        return dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setFechadealta(String fechadealta) {
        this.fechadealta = fechadealta;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", direccion=" + direccion +
                ", fechadealta='" + fechadealta + '\'' +
                '}';
    }
}
