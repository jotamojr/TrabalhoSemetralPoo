
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.JComboBox;

/**
 *
 * @author Jotamo Jr
 */
@Entity
public class AddStock {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String chaveSimples;
    private String qtdChaveSimples;
    private String chaveCarro;
    private String qtdChaveCarro;
    
    
    public AddStock(String chaveSimples, String qtdChaveSimples, String chaveCarro, String qtdChaveCarro) {
        this.chaveSimples = chaveSimples;
        this.qtdChaveSimples = qtdChaveSimples;
        this.chaveCarro = chaveCarro;
        this.qtdChaveCarro = qtdChaveCarro;
    }
    
    public AddStock(){
    }

    public String getChaveSimples() {
        return chaveSimples;
    }

    public void setChaveSimples(String chaveSimples) {
        this.chaveSimples = chaveSimples;
    }

    public String getChaveCarro() {
        return chaveCarro;
    }

    public void setChaveCarro(String chaveCarro) {
        this.chaveCarro = chaveCarro;
    }

    public String getQtdChaveSimples() {
        return qtdChaveSimples;
    }

    public void setQtdChaveSimples(String qtdChaveSimples) {
        this.qtdChaveSimples = qtdChaveSimples;
    }

    public String getQtdChaveCarro() {
        return qtdChaveCarro;
    }

    public void setQtdChaveCarro(String qtdChaveCarro) {
        this.qtdChaveCarro = qtdChaveCarro;
    }

    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}