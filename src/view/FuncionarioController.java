/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.OibFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class FuncionarioController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public OibFuncionario getBean(int row) {
        return (OibFuncionario) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        OibFuncionario oibfuncionario = (OibFuncionario) lista.get(row);
        if (column == 0) {
           return oibfuncionario.getIdFuncionario();
        } 
        if (column == 1) {
           return oibfuncionario.getOibNome();
        } 
        if (column == 2) {
           return oibfuncionario.getOibSobrenome();
        } 
        if (column == 3) {
           return oibfuncionario.getOibCpf();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Sobrenome";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
}
