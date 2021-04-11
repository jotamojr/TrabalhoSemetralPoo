
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Usuario;
import org.hibernate.event.spi.PersistEvent;
import model.AddStock;

/**
 *
 * @author Jotamo Jr
 */
public class Teste {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ed", "edua", "klaus", "", "");
        AddStock a = new  AddStock("050", "" ,"TOY 10", "");
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
        em.close();
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        
        em.close();
      
        
        
    }
    
    
}
