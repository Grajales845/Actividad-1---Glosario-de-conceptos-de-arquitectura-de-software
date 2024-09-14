/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author User
 */
public class UsuarioDAO {
    
    public Usuario obtenerUsuarioPorID(int id){
        //"Consulta base de datos
        return new Usuario(id, "Alberto Grajales","alberto2003@gmail.com");
    }

    public Usuario obtenerUsuarioPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
