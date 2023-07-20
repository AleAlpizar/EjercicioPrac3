
package ejpractico3;


class Pastor {
    private String nombre;

    public Pastor(String nombre) {
        this.nombre = nombre;
    }
}

class Feligrante {
    private String nombre;
    private String cedula;
    private double diezmo;

    public Feligrante(String nombre, String cedula, double diezmo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getDiezmo() {
        return diezmo;
    }

}
