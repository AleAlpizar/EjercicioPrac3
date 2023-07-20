
package ejpractico3;

import javax.swing.JOptionPane;


public class Iglesia {
      private String nombre;
    private Pastor pastor;
    private Feligrante[] feligreses;

    public Iglesia(String nombre, Pastor pastor) {
        this.nombre = nombre;
        this.pastor = pastor;
    }

    public void agregarFeligreses(int cantidadFeligreses) {
        feligreses = new Feligrante[cantidadFeligreses];
        for (int i = 0; i < cantidadFeligreses; i++) {
            String nombre = JOptionPane.showInputDialog("digite el nombre del feligres :");
            String cedula = JOptionPane.showInputDialog("digite la cédula del feligres  :");
            double diezmo = Double.parseDouble(JOptionPane.showInputDialog("digite el diezmo del feligres :"));
            feligreses[i] = new Feligrante(nombre, cedula, diezmo);
        }
    }

    public double calcularGananciasIglesia() {
        double gananciasTotales = 0;
        for (Feligrante feligrese : feligreses) {
            gananciasTotales += feligrese.getDiezmo();
        }
        return gananciasTotales;
    }

    public double calcularImpuestoMunicipalidad() {
        return calcularGananciasIglesia() * 0.09;
    }

    public double calcularImpuestoComedorMunicipal() {
        return calcularGananciasIglesia() * 0.21;
    }

    public double calcularGananciaPastor() {
        return calcularGananciasIglesia() * 0.7;
    }

    
    

}


