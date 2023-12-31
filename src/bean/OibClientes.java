package bean;
// Generated 16/10/2023 17:57:48 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OibClientes generated by hbm2java
 */
@Entity
@Table(name="oib_clientes"
    ,catalog="db_oscar_britez"
)
public class OibClientes  implements java.io.Serializable {


     private int idClientes;
     private String nome;
     private String sobrenome;
     private Date dataNascimento;
     private String email;
     private int telefone;
     private int senha;
     private String cpfCnpj;
     private String rg;
     private String status;
     private String endereco;
     private String cep;
     private String estadoCivil;
     private String sexo;
     private String naturalidade;
     private String tipoCliente;
     private Set oibVendas = new HashSet(0);

    public OibClientes() {
    }

	
    public OibClientes(int idClientes, String nome, String sobrenome, Date dataNascimento, String email, int telefone, int senha, String cpfCnpj, String rg, String status, String endereco, String cep, String estadoCivil, String sexo, String naturalidade, String tipoCliente) {
        this.idClientes = idClientes;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.cpfCnpj = cpfCnpj;
        this.rg = rg;
        this.status = status;
        this.endereco = endereco;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.tipoCliente = tipoCliente;
    }
    public OibClientes(int idClientes, String nome, String sobrenome, Date dataNascimento, String email, int telefone, int senha, String cpfCnpj, String rg, String status, String endereco, String cep, String estadoCivil, String sexo, String naturalidade, String tipoCliente, Set oibVendas) {
       this.idClientes = idClientes;
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.dataNascimento = dataNascimento;
       this.email = email;
       this.telefone = telefone;
       this.senha = senha;
       this.cpfCnpj = cpfCnpj;
       this.rg = rg;
       this.status = status;
       this.endereco = endereco;
       this.cep = cep;
       this.estadoCivil = estadoCivil;
       this.sexo = sexo;
       this.naturalidade = naturalidade;
       this.tipoCliente = tipoCliente;
       this.oibVendas = oibVendas;
    }
   
     @Id 

    
    @Column(name="idClientes", unique=true, nullable=false)
    public int getIdClientes() {
        return this.idClientes;
    }
    
    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="sobrenome", nullable=false, length=45)
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento", nullable=false, length=10)
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="telefone", nullable=false)
    public int getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    @Column(name="senha", nullable=false)
    public int getSenha() {
        return this.senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    @Column(name="cpf_cnpj", nullable=false, length=45)
    public String getCpfCnpj() {
        return this.cpfCnpj;
    }
    
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    
    @Column(name="rg", nullable=false, length=45)
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    @Column(name="status", nullable=false, length=65535)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="endereco", nullable=false, length=45)
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="cep", nullable=false, length=45)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name="estado_civil", nullable=false, length=45)
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    @Column(name="sexo", nullable=false, length=45)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Column(name="naturalidade", nullable=false, length=45)
    public String getNaturalidade() {
        return this.naturalidade;
    }
    
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    
    @Column(name="tipo_cliente", nullable=false, length=45)
    public String getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="oibClientes")
    public Set getOibVendas() {
        return this.oibVendas;
    }
    
    public void setOibVendas(Set oibVendas) {
        this.oibVendas = oibVendas;
    }




}


