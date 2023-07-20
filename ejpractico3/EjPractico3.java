package ejpractico3;

import javax.swing.JOptionPane;

/**
 *
 * @author 11alp
 */
public class EjPractico3 {

    
    public static void main(String[] args) {
        String nombreIglesia = JOptionPane.showInputDialog("digite el nombre de la iglesia:");
        String nombrePastor = JOptionPane.showInputDialog("digite el nombre del pastor:");
        int cantidadFeligreses = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de feligreses:"));

        Pastor pastor = new Pastor(nombrePastor);
        Iglesia iglesia = new Iglesia(nombreIglesia, pastor);
        iglesia.agregarFeligreses(cantidadFeligreses);

        double gananciasIglesia = iglesia.calcularGananciasIglesia();
        double impuestoMunicipalidad = iglesia.calcularImpuestoMunicipalidad();
        double impuestoComedorMunicipal = iglesia.calcularImpuestoComedorMunicipal();
        double gananciaPastor = iglesia.calcularGananciaPastor();

        String informe = "Informe de la iglesia: " + nombreIglesia + "\n"
                + "monto total de ganancias de la iglesia: " + gananciasIglesia + "\n"
                + "monto para la municipalidad : " + impuestoMunicipalidad + "\n"
                + "monto para el comedor municipal: " + impuestoComedorMunicipal + "\n"
                + "monto de ganancia para el pastor: " + gananciaPastor;

        JOptionPane.showMessageDialog(null, informe);


    }
}    

