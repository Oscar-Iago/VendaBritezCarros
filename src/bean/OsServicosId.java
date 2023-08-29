package bean;
// Generated 29/08/2023 11:54:47 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OsServicosId generated by hbm2java
 */
@Embeddable
public class OsServicosId  implements java.io.Serializable {


     private int idos;
     private int servicos;

    public OsServicosId() {
    }

    public OsServicosId(int idos, int servicos) {
       this.idos = idos;
       this.servicos = servicos;
    }
   


    @Column(name="idos", nullable=false)
    public int getIdos() {
        return this.idos;
    }
    
    public void setIdos(int idos) {
        this.idos = idos;
    }


    @Column(name="servicos", nullable=false)
    public int getServicos() {
        return this.servicos;
    }
    
    public void setServicos(int servicos) {
        this.servicos = servicos;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OsServicosId) ) return false;
		 OsServicosId castOther = ( OsServicosId ) other; 
         
		 return (this.getIdos()==castOther.getIdos())
 && (this.getServicos()==castOther.getServicos());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdos();
         result = 37 * result + this.getServicos();
         return result;
   }   


}

