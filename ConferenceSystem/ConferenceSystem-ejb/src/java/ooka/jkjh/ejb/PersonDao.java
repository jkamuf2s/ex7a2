/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooka.jkjh.ejb;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class PersonDao {

    // Injected database connection:
    @PersistenceContext
    private EntityManager em;

    // Stores a new guest: 
    public void persist(Person p) {

        PersonEntity pe = new PersonEntity(p.getFirstName(),p.getLastName(),p.getRole());
        em.persist(pe);
    }

    // Retrieves all the guests:
    public List<PersonEntity> getAllPersons() {
        TypedQuery<PersonEntity> query = em.createQuery(
                "SELECT p FROM PersonEntity p", PersonEntity.class);
        List<PersonEntity> results = query.getResultList();
        return results;
    }
}
