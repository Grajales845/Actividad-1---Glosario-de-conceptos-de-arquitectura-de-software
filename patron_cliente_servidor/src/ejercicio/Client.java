/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 *
 * @author User
 */
public class Client {

    public static void main(String[] args) {
         try (Socket socket = new Socket("localhost", 1234)) {
            // Crear un flujo de entrada para recibir datos del servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            // Leer el mensaje del servidor
            String message = in.readLine();
            System.out.println("Mensaje del servidor: " + message);
        } catch (IOException e) {
        }
    }
    
}
