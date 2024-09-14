/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.util.Scanner;

public class Vista {
    
  private Scanner scanner = new Scanner(System.in);

    public int obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void mostrarResultado(int resultado) {
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
