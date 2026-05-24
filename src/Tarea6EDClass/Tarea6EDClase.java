package Tarea6EDClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Tarea6EDClase, contiene el metodo para aplicar el descuento en compras
 * @author Niick
 */
public class Tarea6EDClase {
    public static final double DESCUENTO_MENOR = 0.95;
    public static final double DESCUENTO_MAYOR = 0.8;
    public static final int DESCUENTO_FIJO = 5;
    public static final int CANTIDAD_PRODUCTOS_DESCUENTO_FIJO = 3;
    
    /**
     * Método que aplica un descuento dependiendo de la cantidad 
     * de productos comprados
     * @param precioProducto Precio original del producto
     * @param numProductos Cantidad de productos comprados
     */
    public void aplicarDescuento(double precioProducto, int numProductos){
    double total;
        if(numProductos>CANTIDAD_PRODUCTOS_DESCUENTO_FIJO)
            precioProducto-=DESCUENTO_FIJO;
        if (numProductos!=0){
        total = precioProducto*DESCUENTO_MAYOR;
        mostrarResultado(total);
        }else {
            total = precioProducto*DESCUENTO_MENOR;
            mostrarResultado(total);
        }   
    }

    /**
     * Método que muestra por pantalla el coste total de la compra.
     * @param total Coste total de la compra
     */
    public void mostrarResultado(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}
