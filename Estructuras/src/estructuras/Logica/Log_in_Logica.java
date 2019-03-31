/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Logica;

import estructuras.LOG_IN;
import estructuras.Menu_Personal;
import javax.swing.JOptionPane;

/**
 *
 * @author Caoba
 */
public class Log_in_Logica extends estructuras.LOG_IN {
    LOG_IN login=new LOG_IN();
      public void Log_in_Logica(){
          Menu_Personal acceso= new Menu_Personal();
       String  usuarioconfirmado = login.getCuenta().getText();
       String contraseñaconfirmada = login.getContra().getText();
        if ("Caoba".equalsIgnoreCase(usuarioconfirmado) && "123".equalsIgnoreCase(contraseñaconfirmada)) {
            JOptionPane.showMessageDialog(null, "Bienvenida Caoba!!","Inicio", JOptionPane.INFORMATION_MESSAGE);  
            
            acceso.setVisible(true);
            this.setVisible(false);
        
        }
       else if (usuarioconfirmado.equalsIgnoreCase("Pitus") && contraseñaconfirmada.equalsIgnoreCase("Susceptible")) {
            JOptionPane.showMessageDialog(null, "Bienvenido Pitus >:D!!","Inicio", JOptionPane.INFORMATION_MESSAGE);  
        acceso.setVisible(true);
            dispose();
        }
        else if (usuarioconfirmado.equalsIgnoreCase("Daniel") && contraseñaconfirmada.equalsIgnoreCase("123")) {
            JOptionPane.showMessageDialog(null, "Bienvenido Dani!!","Inicio", JOptionPane.INFORMATION_MESSAGE);  
        acceso.setVisible(true);
            this.setVisible(false);
        
     }else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos","Guap@ <3", JOptionPane.WARNING_MESSAGE);
}
      }
}
