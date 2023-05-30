/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.model.Seleccion;
import proyectomundial.util.BasedeDatos;

/**
 *
 * @author LAB205BPC02
 */
public class LoginDAO {
    
    public LoginDAO(){
        BasedeDatos.conectar();
    }
    
    public boolean ValidarLogin(String usuario, String contrasena){
        
        String sql = "select username, \"password\" from poo.users u where username = '"+usuario+"' and \"password\" = '"+contrasena+"';";
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            if (result!= null) {
                while(result.next())
                return true;
            }
            return false;
            
            
          
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando selecciones");
        }
        
        return true;
        
    }
}
