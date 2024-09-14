/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import datos.Usuario;
import negocio.UsuarioServicio;

/**
 *
 * @author User
 */
public class UsuarioControlador {

   private final UsuarioServicio usuarioServicio = new UsuarioServicio();
   
   public void mostrarUsuario(int id) {
        Usuario usuario = usuarioServicio.obtenerUsuario(id);
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
   
    public static void main(String[] args) {
        
        UsuarioControlador controlador = new UsuarioControlador();
        controlador.mostrarUsuario(1);
    }
    }
    

