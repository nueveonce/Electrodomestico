/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_03.Entidades;

import java.util.Scanner;

/**
 *
 * @author nueveonce
 */
public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, Character consumoElectrico) {
        super(precio, color, consumoElectrico);
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Carga");
        carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga>=30) {
            this.precio=precio+500d;            
        }

    }
 
}
