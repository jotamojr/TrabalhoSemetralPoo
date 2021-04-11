
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jotamo Jr
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sgcPU");
    
    /**
     *
     */
    public EntityManager getConnection(){
        
        return emf.createEntityManager();
    }
            
}
