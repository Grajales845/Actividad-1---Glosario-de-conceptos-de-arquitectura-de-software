/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author User
 */
public class Server {

 
    public static void main(String[] args) {
       try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Servidor iniciado, esperando conexiones...");
            
            while (true) {
                try (Socket clientSocket = serverSocket.accept() // Acepta la conexión del cliente
                ) {
                    System.out.println("Cliente conectado");
                    // Crear un flujo de salida para enviar datos al cliente
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    out.println("Hola desde el servidor!");
                    // Cerrar la conexión
                }
            }
        } catch (IOException e) {
        }
    }
    }
    

