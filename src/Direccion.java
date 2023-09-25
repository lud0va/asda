public class Direccion {
    private  String calle;
    private String localizacion;

    public Direccion(String calle, String localizacion) {
        this.calle = calle; this.localizacion=localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }
}
