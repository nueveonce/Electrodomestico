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
public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Double precio, String color, Character consumoElectrico) {
        super(precio, color, consumoElectrico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        String opcion;

        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Resolucion (pulgadas)");
        resolucion = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? SI/NO");
        do {
            opcion = leer.next();
        } while (!opcion.toUpperCase().equals("SI") && !opcion.toUpperCase().equals("NO"));
        sintonizador = opcion.equals("SI");
    }

    @Override
    public void precioFinal() {

        super.precioFinal();
        if (resolucion > 40) {
            precio = precio * 1.30;
        }
        if (sintonizador==true) {
            precio+=500;
            
        }

    }

}
