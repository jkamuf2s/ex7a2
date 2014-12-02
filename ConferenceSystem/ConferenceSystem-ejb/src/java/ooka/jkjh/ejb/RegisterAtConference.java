package ooka.jkjh.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author JAYDESKTOP
 */
@Stateless
public class RegisterAtConference implements RegisterAtConferenceRemote {

    @EJB
    private PersonDao personDao;

    @Override
    public Long registerPerson(PersonEntity p) {

        return personDao.persist(p);

    }

    @Override
    public PersonEntity getPersonByID(Long id) {

        List<PersonEntity> personEntityList = personDao.getAllPersons();

        for (PersonEntity personEntity : personEntityList) {
            if (id.equals(personEntity.getId())) {

                return personEntity;
            }

        }

        throw new IllegalAccessError("Person with id: " + id + " does not exist in database");
    }

}
