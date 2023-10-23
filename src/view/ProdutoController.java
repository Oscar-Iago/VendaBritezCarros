/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.OibProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class ProdutoController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public OibProduto getBean(int row) {
        return (OibProduto) lista.get(row);
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
        OibProduto OibProduto = (OibProduto) lista.get(row);
        if (column == 0) {
           return OibProduto.getIdProduto();
        } 
        if (column == 1) {
           return OibProduto.getMarca();
        } 
        if (column == 2) {
           return OibProduto.getPreco();
        } 
        if (column == 3) {
           return OibProduto.getModelo();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Marca";
        }
        if (column == 2) {
            return "Preco";
        }
        if (column == 3) {
            return "Modelo";
        }
        return "";
    }
}
