/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pesquisar;

import bean.Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class ClientesControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public Clientes getBean(int linha) {
        return (Clientes) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 16;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clientes clientes = (Clientes) lista.get(rowIndex);
        if (columnIndex == 0) {
            return clientes.getIdClientes();
        }
        if (columnIndex == 1) {
            return clientes.getNome();
        }
        if (columnIndex == 2) {
            return clientes.getSobrenome();
        }
        if (columnIndex == 3) {
            return clientes.getDataNascimento();
        }
        if (columnIndex == 4) {
            return clientes.getEmail();
        }
        if (columnIndex == 5) {
            return clientes.getTelefone();
        }
        if (columnIndex == 6) {
            return clientes.getSenha();
        }
        if (columnIndex == 7) {
            return clientes.getCpf_cnpj();
        }
        if (columnIndex == 8) {
            return clientes.getRg();
        }
        if (columnIndex == 9) {
            return clientes.getStatus();
        }
        if (columnIndex == 10) {
            return clientes.getEndereco();
        }
        if (columnIndex == 11) {
            return clientes.getCep();
        }
        if (columnIndex == 12) {
            return clientes.getEstado_civil();
        }
        if (columnIndex == 13) {
            return clientes.getSexo();
        }
        if (columnIndex == 14) {
            return clientes.getNaturalidade();
        }
        if (columnIndex == 15) {
            return clientes.getTipo_cliente();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Sobrenome";
        }
        if (columnIndex == 3) {
            return "DataNascimento";
        }
        if (columnIndex == 4) {
            return "Email";
        }
        if (columnIndex == 5) {
            return "Telefone";
        }
        if (columnIndex == 6) {
            return "Senha";
        }
        if (columnIndex == 7) {
            return "Cpf_cnpj";
        }
        if (columnIndex == 8) {
            return "Rg";
        }
        if (columnIndex == 9) {
            return "Status";
        }
        if (columnIndex == 10) {
            return "Endereco";
        }
        if (columnIndex == 11) {
            return "Cep";
        }
        if (columnIndex == 12) {
            return "Estado_civil";
        }
        if (columnIndex == 13) {
            return "Sexo";
        }
        if (columnIndex == 14) {
            return "Naturalidade";
        }
        if (columnIndex == 15) {
            return "Tipo_cliente";
        }
        return "";
    }
}
