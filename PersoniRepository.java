/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Admin
 */

import java.util.List;
import BLL.Personi;


public class PersoniRepository extends EntMngClass implements PersoniInterface {

    @Override
    public void create(Personi p) throws CrudFormException {
       try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Personi p) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Per javet ne vijim"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Personi.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Personi findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Per javet ne vijim"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

