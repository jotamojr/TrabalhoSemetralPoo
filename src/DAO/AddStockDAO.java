
package DAO;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.AddStock;

/**
 *
 * @author Jotamo Jr
 */
public class AddStockDAO {
    public AddStock save (AddStock addProduto){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(addProduto);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Chave adicionada com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Falha ao adicionar a chave");
        }finally{
            em.close();
    }
        return addProduto;
    }
    
    
}
