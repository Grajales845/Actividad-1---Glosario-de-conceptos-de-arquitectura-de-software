/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.Usuario;
import datos.UsuarioDAO;

/**
 *
 * @author User
 */
public class UsuarioServicio {
    
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public Usuario obtenerUsuario(int id) {
        //logica
        return usuarioDAO.obtenerUsuarioPorId(id);
    }
}
