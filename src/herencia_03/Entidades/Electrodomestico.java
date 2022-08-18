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
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoElectrico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoElectrico) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(Character consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public void comprobarConsumoElectrico(Character letra) {

        switch (letra) {
            case 'A':
                consumoElectrico = letra;
                break;
            case 'B':
                consumoElectrico = letra;
                break;
            case 'C':
                consumoElectrico = letra;
                break;
            case 'D':
                consumoElectrico = letra;
                break;
            case 'E':
                consumoElectrico = letra;
                break;
            default:
                consumoElectrico = 'F';
        }
    }

    public void comprobarColor(String color) {

        switch (color) {
            case "negro":
                this.color = color;
                break;
            case "rojo":
                this.color = color;
                break;
            case "azul":
                this.color = color;
                break;
            case "gris":
                this.color = color;
                break;
            default:
                this.color = "blanco";
        }

    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL COLOR DEL ELECTRODOMESTICO: ");
        comprobarColor(leer.next().toLowerCase());
        System.out.print("INGRESE LA CLASE DE CONSUMO ELECTRICO\n [A] - [B] - [C] - [D] - [E] - [F] ");
        comprobarConsumoElectrico(leer.next().toUpperCase().charAt(0));

    }

    public void precioFinal() {
        Scanner leer = new Scanner(System.in);
        precio = 1000d;
        
        switch (consumoElectrico) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        System.out.println("INGRESE EL PESO DEL ELECTRODOMESTICO");
        Integer peso= leer.nextInt();
        if (peso>0 && peso<20) {
            precio +=100;            
        }else if (peso>19 && peso<50) {
            precio +=500;            
        }else if (peso>49 && peso<80) {
            precio +=800;
        }else if ( peso>79) {
            precio +=1000;
        }
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + '}';
    }

}
