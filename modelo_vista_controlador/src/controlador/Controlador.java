/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author User
 */
public class Controlador {
    
 private final Modelo modelo;
    private final Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        int numero1 = vista.obtenerNumero("Ingrese el primer número: ");
        int numero2 = vista.obtenerNumero("Ingrese el segundo número: ");
        
        modelo.setNumero1(numero1);
        modelo.setNumero2(numero2);
        
        int resultado = modelo.sumar();
        vista.mostrarResultado(resultado);
    }
}