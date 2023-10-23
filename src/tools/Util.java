/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u06539293151
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... vetComp){
    for (int i = 0; i < vetComp.length; i++) {
        vetComp[i].setEnabled(valor);
    }
}


    public static void limparCampos(JComponent ... vetComp){
        for (JComponent component : vetComp) {
            if (component instanceof JTextField){
            ((JTextField)component).setText("");
        }
            if (component instanceof JComboBox){
             ((JComboBox)component).setSelectedIndex(-1);
            }
            if (component instanceof JCheckBox){
             ((JCheckBox)component).setSelected(false);
            }
      }
    }
    
    public static void mensagem(String cadeia){
        JOptionPane.showMessageDialog(null, cadeia);
    }
    
    public static boolean perguntar(String cadeia){
        int resp = JOptionPane.showConfirmDialog(null, cadeia,
                "Perguntar", JOptionPane.YES_NO_OPTION);
        return false;
    }
    
    public static int strInt(String cad){
        return Integer.valueOf(cad);
    }
    
    public static String intStr(int num){
        return "";
    }
    
    public static double strDouble(Double cad){
        return 0;
    }
    
    public static String doubleStr(Double num){
        return "";
    }
    
    public static Date strDate(String cad){
        return null;
    }
    
    public static String dateStr(Date num){
        return "";
    }
}