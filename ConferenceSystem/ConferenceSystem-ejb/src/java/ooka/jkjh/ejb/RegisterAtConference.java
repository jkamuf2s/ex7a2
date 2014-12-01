package ooka.jkjh.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author JAYDESKTOP
 */
@Stateless
public class RegisterAtConference implements RegisterAtConferenceRemote {

    @EJB
    private PersonDao personDao;
    
    
    private Person tempPerson;

    @Override
    public String registerPerson(Person p) {

        personDao.persist(p);
        tempPerson = p;
        
        
        return "Person:" + p.getFirstName() + " " + p.getLastName() + " successfully registered at the conference";

    }

    @Override
    public Person getPersonByID(int id) {
        return this.tempPerson;
    }
    
    

}
