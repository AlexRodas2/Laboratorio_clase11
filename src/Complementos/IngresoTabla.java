/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementos;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class IngresoTabla extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row , int column ){
       if(value instanceof JLabel){
        JLabel lbl = (JLabel) value;
        return lbl;
    }
        if(value instanceof JButton){
            JButton button= (JButton) value;
            if(isSelected){
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            }else{
                button.setForeground(table.getSelectionForeground());           
                button.setBackground(UIManager.getColor("Button.background"));
            }
            return button;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

        
    }

