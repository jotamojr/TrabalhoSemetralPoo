
package DAO;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Jotamo Jr
 */
public class UsuarioDAO {
    public Usuario save (Usuario usuario) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcionario Registado com Sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Falha ao registar funcionario");
        }finally{
            em.close();
    }
        return usuario;
        
    }
}
