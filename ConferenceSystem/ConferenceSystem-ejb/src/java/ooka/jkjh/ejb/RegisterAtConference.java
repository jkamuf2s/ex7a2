package ooka.jkjh.ejb;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author JAYDESKTOP
 */
@Stateless
public class RegisterAtConference implements RegisterAtConferenceRemote {
    
    private PersonDao pd;

    @Override
    public String registerPerson(Person p) {
        
        pd.persist(p);
        
         List<PersonEntity> pel = pd.getAllGuests();
        
        return "Person successfully registered at the conference";
        
       
        
    }

}
