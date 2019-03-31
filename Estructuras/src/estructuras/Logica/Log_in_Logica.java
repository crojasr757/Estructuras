/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Logica;

import estructuras.LOG_IN;
import javax.swing.JOptionPane;

/**
 *
 * @author Caoba
 */
public class Log_in_Logica extends estructuras.LOG_IN {
    LOG_IN login=new LOG_IN();
      public void login(){
          
        String usuario;
        String contraseña;
        usuario = login.getCuenta().getText();
        contraseña = login.getContra().getText();
        if ("Carolina".equals(usuario) && "123".equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "Bienvenido","Inicio", JOptionPane.INFORMATION_MESSAGE);
          
           
        }else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos","Guapa <3", JOptionPane.WARNING_MESSAGE);
        }
    }
}
