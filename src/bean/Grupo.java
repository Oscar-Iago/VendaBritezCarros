package bean;
// Generated 29/08/2023 11:54:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name="grupo"
    ,catalog="mpv_aluno"
)
public class Grupo  implements java.io.Serializable {


     private int idgrupo;
     private String descricao;
     private Character ativo;
     private Set produtoses = new HashSet(0);

    public Grupo() {
    }

	
    public Grupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }
    public Grupo(int idgrupo, String descricao, Character ativo, Set produtoses) {
       this.idgrupo = idgrupo;
       this.descricao = descricao;
       this.ativo = ativo;
       this.produtoses = produtoses;
    }
   
     @Id 

    
    @Column(name="idgrupo", unique=true, nullable=false)
    public int getIdgrupo() {
        return this.idgrupo;
    }
    
    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    
    @Column(name="descricao", length=50)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="ativo", length=1)
    public Character getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupo")
    public Set getProdutoses() {
        return this.produtoses;
    }
    
    public void setProdutoses(Set produtoses) {
        this.produtoses = produtoses;
    }




}

