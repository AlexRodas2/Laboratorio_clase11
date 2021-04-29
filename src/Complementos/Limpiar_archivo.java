
package Complementos;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Limpiar_archivo {
  
    public void Limpiar_Archivo(JPanel panel){
        for(int i=0; panel.getComponents().length>i; i++){
            if (panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            } else if (panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setText("");
            }
        }
    }
}
