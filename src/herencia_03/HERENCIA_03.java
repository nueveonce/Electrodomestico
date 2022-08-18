/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package herencia_03;

import herencia_03.Entidades.Electrodomestico;
import herencia_03.Entidades.Lavadora;
import herencia_03.Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author nueveonce
 */
public class HERENCIA_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora();
        Televisor tel1 = new Televisor();
        Televisor tel2 = new Televisor();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        System.out.println("LAVADORA");
        lav1.crearLavadora();
        System.out.println("LAVADORA");
        lav2.crearLavadora();
        System.out.println("\n************* ---- *************\n");
        System.out.println("TELEVISOR");
        tel1.crearTelevisor();
        System.out.println("TELEVISOR");
        tel2.crearTelevisor();

        
        electrodomesticos.add(lav1);
        electrodomesticos.add(lav2);
        electrodomesticos.add(tel1);
        electrodomesticos.add(tel2);

        for (Electrodomestico elec : electrodomesticos) {
            elec.precioFinal();
        }
        for (Electrodomestico elec : electrodomesticos) {
            System.out.println(elec);
        }
    }

}
